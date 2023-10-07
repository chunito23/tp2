/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp2b;

/**
 *
 * @author domin
 */
public class Tp2b {

    public static void main(String[] args) {
        gestorViajes gv = new gestorViajes();
        gv.mediosTransporte();
        gv.destinos();
        gv.hoteles();
        gv.agregarExcursiones();
        gv.agregarClientes();
        gv.agregarClientes();
        gv.generarPaquetes();
        gv.registrarViaje(1, 1);
        gv.registrarViaje(2, 1);
        gv.registrarViaje(2, 1);
        
        gv.mostrarViajes();
    }
}
