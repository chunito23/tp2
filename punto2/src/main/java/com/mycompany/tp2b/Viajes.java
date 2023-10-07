/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2b;

/**
 *
 * @author domin
 */
class Viajes {
    private int idViaje;
    private Clientes cliente;
    private Paquetes paquete;

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public void setPaquete(Paquetes paquete) {
        this.paquete = paquete;
    }

    public Paquetes getPaquete() {
        return paquete;
    }

    public void mostrarViaje() {
        System.out.println("ID del Viaje: " + idViaje + " Cliente: " + cliente.getId());
        System.out.println("Paquete: ");
        paquete.mostrarPaquete();
        System.out.println("\n");
    }
}
