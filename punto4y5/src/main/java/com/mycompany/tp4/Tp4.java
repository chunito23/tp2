/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp4;

import java.time.LocalDate;

/**
 *
 * @author domin
 */
public class Tp4 {

    public static void main(String[] args) {
        usuario usu = new usuario(200);
        usu.cancelarAutomaticamenteInversionParaGastos();
        usu.mostrarCuentaCorriente();
        usu.invertirbanco(200);
        System.out.println("\nplata despues de invertir\n");
        usu.mostrarCuentaCorriente();
        usu.gastarPlata(10);
        System.out.println("\nplata despues de gastar mas de lo que debo\n");
        usu.mostrarCuentaCorriente();









        //usu.mostrarCuentaCorrientecredito();
        //usu.gastarPlatacredito(60);
        //System.out.println();
        //usu.mostrarCuentaCorrientecredito();
        //System.out.println();
        //usu.pagarTarjeta();
        //usu.mostrarCuentaCorrientecredito();

    }
}
