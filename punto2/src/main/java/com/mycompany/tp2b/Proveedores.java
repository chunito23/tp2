/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2b;

/**
 *
 * @author domin
 */
class Proveedores {
    private String tipoProveedor;
    private String nombre;
    private String descripcion;

    public String getTipoProveedor() {
        return tipoProveedor;
    }

    public void setTipoProveedor(String tipoProveedor) {
        this.tipoProveedor = tipoProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

    public Proveedores(String tipoProveedor, String nombre, String descripcion) {
        this.tipoProveedor = tipoProveedor;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void mostrarDatos() {
        System.out.println("Tipo de Proveedor: " + tipoProveedor);
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
    }
}
