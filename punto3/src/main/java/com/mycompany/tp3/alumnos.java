/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;
import java.util.*;

/**
 *
 * @author domin
 */
public class alumnos {
    private credenciales credeancialAlumno;
    private String nombre;
    private int idAlumno;

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }
    
    public credenciales getCredeancialAlumno() {
        return credeancialAlumno;
    }

    public String getNombre() {
        return nombre;
    }


    public alumnos(credenciales credeancialAlumno, String nombre) {
        this.credeancialAlumno = credeancialAlumno;
        this.nombre = nombre;
    }
    
    
    
}
