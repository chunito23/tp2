/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2b;

/**
 *
 * @author domin
 */
class ClaseExcursiones {
    private String tipoProveedor;
    private String nombre;
    private String descripcion;

    public ClaseExcursiones() {
        this.tipoProveedor = "";
        this.nombre = "";
        this.descripcion = "";
    }

    public void setTipoProveedor(String tipoProveedor) {
        this.tipoProveedor = tipoProveedor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
    }
}
