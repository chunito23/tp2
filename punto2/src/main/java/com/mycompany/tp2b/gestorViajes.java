/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2b;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author domin
 */
class gestorViajes {
    private int idCliente = 1;
    private int idPaquete = 1;
    private int idViaje = 1;
    private List<Proveedores> mediosTransporte = new ArrayList<>();
    private List<Proveedores> hosteles = new ArrayList<>();
    private List<ClaseExcursiones> excursiones = new ArrayList<>();
    private List<Viajes> viajes = new ArrayList<>();
    private List<String> destinos = new ArrayList<>();
    private List<Clientes> clientes = new ArrayList<>();
    private List<Paquetes> paquetes = new ArrayList<>();

    public void agregarExcursiones() {
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        int numero;
        String texto;

        while (bandera) {
            System.out.println("1- Agregar excursión 2- Terminar");
            numero = sc.nextInt();
            sc.nextLine();

            if (numero == 1) {
                ClaseExcursiones excursion = new ClaseExcursiones();
                excursion.setTipoProveedor("excursion");
                System.out.println("Ingrese el nombre de la excursión: ");
                texto = sc.nextLine();
                excursion.setNombre(texto);
                System.out.println("Ingrese la descripción de la excursión: ");
                texto = sc.nextLine();
                excursion.setDescripcion(texto);
                excursiones.add(excursion);
            } else {
                bandera = false;
            }
        }
    }

    public void agregarClientes() {
        Scanner sc = new Scanner(System.in);
        String texto;
        System.out.println("Ingrese el nombre del cliente: ");
        texto = sc.nextLine();
        Clientes cliente = new Clientes(texto, idCliente);
        idCliente++;
        clientes.add(cliente);
    }


    public void generarPaquetes() {
        Scanner sc = new Scanner(System.in);
        int numero;
        Paquetes paquete = new Paquetes();

        System.out.println("Seleccione proveedores medio transporte: ");
        mostrarProveedores(mediosTransporte);
        numero = sc.nextInt();
        paquete.setTransporte(mediosTransporte.get(numero));

        System.out.println("Seleccione proveedores hoteles: ");
        mostrarProveedores(hosteles);
        numero = sc.nextInt();
        paquete.setHospedaje(hosteles.get(numero));

        System.out.println("Seleccione destino: ");
        mostrarDestinos(destinos);
        numero = sc.nextInt();
        paquete.setDestino(destinos.get(numero));

        paquete.setIdPaquete(idPaquete);
        idPaquete++;

        List<ClaseExcursiones> excursionesPaquete = new ArrayList<>();
        System.out.println("Seleccione excursiones (-1 para terminar): ");
        mostrarExcursiones(excursiones);
        numero = sc.nextInt();

        while (numero != -1) {
            if (numero >= 0 && numero < excursiones.size()) {
                excursionesPaquete.add(excursiones.get(numero));
            } else {
                System.out.println("Opción inválida. Intente de nuevo.");
            }
            numero = sc.nextInt();
        }
        paquete.setExcursiones(excursionesPaquete);
        paquetes.add(paquete);
    }

    public Clientes clientePorId(int idCliente) {
        for (Clientes cliente : clientes) {
            if (cliente.getId() == idCliente) {
                return cliente;
            }
        }
        return null;
    }

    public Paquetes paquetePorId(int idPaquete) {
        for (Paquetes paquete : paquetes) {
            if (paquete.getIdPaquete() == idPaquete) {
                return paquete;
            }
        }
        return null;
    }

    public void registrarViaje(int idCliente, int idPaquete) {
        Clientes cliente = clientePorId(idCliente);
        Paquetes paquete = paquetePorId(idPaquete);

        if (cliente != null && paquete != null) {
            Viajes nuevoViaje = new Viajes();
            nuevoViaje.setCliente(cliente);
            nuevoViaje.setPaquete(paquete);
            nuevoViaje.setIdViaje(idViaje);
            idViaje++;
            viajes.add(nuevoViaje);
            cliente.getListaViajes().add(nuevoViaje);
            System.out.println("Viaje registrado con éxito.");
        } else {
            System.out.println("Cliente o paquete no encontrado. No se pudo registrar el viaje.");
        }
    }

    public void mostrarViajes() {
        if (viajes.isEmpty()) {
            System.out.println("No hay viajes registrados.");
        } else {
            viajes.sort((v1, v2) -> v1.getPaquete().getDestino().compareTo(v2.getPaquete().getDestino()));

            for (Viajes viaje : viajes) {
                viaje.mostrarViaje();
            }
        }
    }

    public void mostrarPaquetes() {
        if (paquetes.isEmpty()) {
            System.out.println("No hay paquetes registrados.");
        } else {
            for (Paquetes paquete : paquetes) {
                System.out.println("\nOpción: " + paquete.getIdPaquete());
                paquete.mostrarPaquete();
            }
        }
    }

    public void mostrarProveedores(List<Proveedores> lista) {
        if (lista.isEmpty()) {
            System.out.println("No hay proveedores registrados.");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println("\nOpción: " + i);
                lista.get(i).mostrarDatos();
            }
        }
    }

    public void mostrarExcursiones(List<ClaseExcursiones> lista) {
        if (lista.isEmpty()) {
            System.out.println("No hay excursiones registradas.");
        } else {
            System.out.println("-1 para terminar");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println("\nOpción: " + i);
                lista.get(i).mostrarDatos();
            }
        }
    }

    public void mostrarDestinos(List<String> destinos) {
        if (destinos.isEmpty()) {
            System.out.println("No hay destinos registrados.");
        } else {
            for (int i = 0; i < destinos.size(); i++) {
                System.out.println("\nOpción: " + i);
                System.out.println(destinos.get(i));
            }
        }
    }

    public void mediosTransporte() {
        Proveedores medioTransporte1 = new Proveedores("medioTransporte", "ViajesTatitos", "Viajes en auto hechos por Tato");
        Proveedores medioTransporte2 = new Proveedores("medioTransporte", "ViajesJulian", "Viajes en avión hechos por Julian");
        Proveedores medioTransporte3 = new Proveedores("medioTransporte", "ViajesMique", "Viajes en lancha hechos por Miques");
        mediosTransporte.add(medioTransporte1);
        mediosTransporte.add(medioTransporte2);
        mediosTransporte.add(medioTransporte3);
    }

    public void hoteles() {
        Proveedores hotel1 = new Proveedores("hotel", "HotelesFranco", "Cadena de hoteles de Franco");
        Proveedores hotel2 = new Proveedores("hotel", "HotelesChuno", "Cadena de hoteles de Chuno");
        hosteles.add(hotel1);
        hosteles.add(hotel2);
    }

    public void destinos() {
        destinos.add("Tatolandia");
        destinos.add("Chutolandia");
        destinos.add("Julilandia");
    }
}
