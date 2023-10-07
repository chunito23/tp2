/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp4;
import java.time.*;
import java.util.Scanner;

/**
 *
 * @author domin
 */
public class cuentaCorriente {
    final int sobregiroinicial = 100;
    int saldoBase;
    int sobregiro;
    double saldototal;
    double interes;
    double interescorto;
    int plataFijo;
    boolean autoCancelacion;
    LocalDate fechaInvertido;
    LocalDate fechaRetirarInteres;
    
    public cuentaCorriente(int saldobase){
        this.saldoBase = saldobase;
        sobregiro = sobregiroinicial;
        saldototal = saldobase + sobregiro;
        interes = 0.40;
        interescorto = 0.05;
        LocalDate fechaInvertido = null;
        LocalDate fechaRetirarInteres = null;
        autoCancelacion = false;
    }
    
    public void gastarPlata(int monto){
        Scanner sc = new Scanner(System.in);
        if (saldototal < monto && !autoCancelacion){  //no tengo saldo para cubrir el gasto
            System.out.println("usted se quedo sin dinero para gastar");
        }else if(saldoBase + plataFijo > monto && autoCancelacion){ //invertir
            System.out.println("entre 1");
            retirarInversion(LocalDate.now());
            saldototal -= monto;
            saldoBase -= monto;
        }else if(saldototal + plataFijo + sobregiro > monto && autoCancelacion){
            System.out.println("entre 2");
            retirarInversion(LocalDate.now());
            monto = monto - saldoBase;
            saldoBase = 0;
            sobregiro = sobregiro - monto;
        }
        else if(saldototal - sobregiro >= monto){ //tengo saldo para cubrir el gasto y no llego al sobregiro
            System.out.println("entre 3");
            saldototal -= monto;
            saldoBase -= monto;
        }else if(saldototal - sobregiro < monto){
            System.out.println("entre 4");
            System.out.println("usted usara dinero del sobregiro para cubrir este pago 1-si 2-no");
            int opcion = sc.nextInt();
            if (opcion == 1){
                int base = saldoBase;
                saldoBase = 0;
                saldototal -= monto;
                sobregiro = sobregiro - (monto - base);
            }
        }
    }

    public void cancelarAutomaticamente(){
        if(!autoCancelacion){
            autoCancelacion = true;
        }else{
            autoCancelacion = false;
        }
    }

    public void retirarInversion(LocalDate fechaRetirar){
        if (fechaRetirar.isAfter(fechaRetirarInteres)){
            double plataretirar = plataFijo * interes;
            saldototal += plataFijo + plataretirar;
            saldoBase += plataFijo + plataretirar;
        }else{
            if(fechaRetirar.isAfter(fechaInvertido.plusDays(30))){
                double plataretirar = plataFijo * interescorto;
                saldototal += plataFijo + plataretirar;
                saldoBase += plataFijo + plataretirar;
            }else{
                saldototal += plataFijo;
                saldoBase += plataFijo;
            }

        }
        plataFijo = 0;
        fechaInvertido = null;
        fechaRetirarInteres = null;
    }

    public void invertir(int monto){
        if (saldototal < monto){  //tengo saldo para cubrir el gasto
            System.out.println("usted se quedo sin dinero para gastar");
        }else if(saldototal - sobregiro >= monto){ //tengo saldo para cubrir el gasto y no llego al sobregiro
            fechaInvertido = LocalDate.now();
            fechaRetirarInteres = fechaInvertido.plusDays(365);
            plataFijo = monto;
            saldototal -= monto;
            saldoBase -= monto; // Actualizar el saldoBase
        }
    }
    
    public void mostrarDatos() {
        System.out.println("autocancelacion: " + autoCancelacion);
        System.out.println("Sobregiro Inicial: " + sobregiroinicial);
        System.out.println("Saldo Base: " + saldoBase);
        System.out.println("Sobregiro: " + sobregiro);
        System.out.println("Saldo Total: " + saldototal);
        System.out.println("Interés: " + interes);
        System.out.println("Interés corto: " + interescorto);
        System.out.println("Plazo Fijo: " + plataFijo);
        System.out.println("Fecha Actual: " + fechaInvertido);
        System.out.println("Fecha para Retirar Interés: " + fechaRetirarInteres);
    }
    
   
    
}
