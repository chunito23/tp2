/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2b;
import java.util.*;

/**
 *
 * @author domin
 */
class Clientes {
    private String nombre;
    private int id;
    private ArrayList<Viajes> listaViajes = new ArrayList<>();
    private String viajeFavorito;
    
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Viajes> getListaViajes() {
        return listaViajes;
    }

    public Clientes(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public int getId() {
        return id;
    }
}