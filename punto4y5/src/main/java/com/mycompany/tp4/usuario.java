/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp4;

import java.time.LocalDate;

/**
 *
 * @author domin
 */
public class usuario {
    int montoInicial;
    cuentaCredito cuentaCreditoUsuario;
    cuentaCorriente cuentaCorrienteUsuario;
    
    public usuario(int plata){
        montoInicial = plata;
        cuentaCreditoUsuario = new cuentaCredito(montoInicial);
        cuentaCorrienteUsuario = new cuentaCorriente(montoInicial);
    }
    
    public void gastarPlata(int monto){
        cuentaCorrienteUsuario.gastarPlata(monto);
    }
    
    public void mostrarCuentaCorriente(){
        cuentaCorrienteUsuario.mostrarDatos();
    }

    public void invertirbanco(int monto){
        cuentaCorrienteUsuario.invertir(monto);
    }
    
    public void recuperarInversion(LocalDate fecha){
        cuentaCorrienteUsuario.retirarInversion(fecha);
    }

    public void cancelarAutomaticamenteInversionParaGastos(){
        cuentaCorrienteUsuario.cancelarAutomaticamente();
    }

    public void gastarPlatacredito(int monto){
        cuentaCreditoUsuario.gastar(monto);
    }

    public void mostrarCuentaCorrientecredito(){
        cuentaCreditoUsuario.mostrarAtributos();
    }



    public void pagarTarjeta(int monto){
        cuentaCreditoUsuario.pagarTarjeta(monto);
    }

}
