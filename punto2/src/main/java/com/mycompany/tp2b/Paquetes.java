/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2b;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author domin
 */
class Paquetes {
    private int idPaquete;
    private Proveedores transporte;
    private Proveedores hospedaje;
    private String destino;
    private List<ClaseExcursiones> excursiones;

    public Paquetes() {
        this.idPaquete = 0;
        this.transporte = null;
        this.hospedaje = null;
        this.destino = "";
        this.excursiones = new ArrayList<>();
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public void setTransporte(Proveedores transporte) {
        this.transporte = transporte;
    }

    public void setHospedaje(Proveedores hospedaje) {
        this.hospedaje = hospedaje;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setExcursiones(List<ClaseExcursiones> excursiones) {
        this.excursiones = excursiones;
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public String getDestino() {
        return destino;
    }

    public void mostrarPaquete() {
        System.out.println();
        System.out.println("ID del Paquete: " + idPaquete + 
                           " Transporte: " + transporte.getNombre() + 
                           " Hospedaje: " + hospedaje.getNombre() + 
                           " Destino: " + destino);
        System.out.println("Excursiones: ");
        for (ClaseExcursiones excursione : excursiones) {
            excursione.mostrarDatos();
        }
    }


}
