/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp4;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author domin
 */
public class cuentaCredito {
    final int limitecredito = 200;
    int saldoCredito;
    double recargoTarjeta;
    int saldoCuenta;
    LocalDate fechaActual;
    LocalDate fechaPagar;

    public cuentaCredito(int saldobase){
        saldoCredito = 0;
        saldoCuenta = saldobase;
        recargoTarjeta = 0.05;
        fechaActual = LocalDate.now();
        fechaPagar = fechaActual.plusDays(30);
    }

    public void gastar(int monto){
        Scanner sc = new Scanner(System.in);
        if(saldoCredito + (monto*recargoTarjeta) > limitecredito){
            System.out.println("esta compra excede el limite de credito ");
        }else{
            saldoCredito += monto*recargoTarjeta;
        }
    }

    public void pagarTarjeta(int monto){
        saldoCuenta -= monto;
        saldoCredito -= monto;
    }

    public void mostrarAtributos() {
        System.out.println("Limite de crédito: " + limitecredito);
        System.out.println("gastado Saldo de crédito: " + saldoCredito);
        System.out.println("Recargo de tarjeta: " + recargoTarjeta);
        System.out.println("Saldo de cuenta: " + saldoCuenta);
        System.out.println("Fecha actual: " + fechaActual);
        System.out.println("Fecha para retirar intereses: " + fechaPagar);
    }
}
