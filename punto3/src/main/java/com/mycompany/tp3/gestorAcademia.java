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
public class gestorAcademia {
    ArrayList<actividad > actividades = new ArrayList<>();
    ArrayList<profesores> profesores  = new ArrayList<>();
    ArrayList<comisiones> comisiones  = new ArrayList<>();
    ArrayList<alumnos   > alumnos     = new ArrayList<>();

    public void setActividades(ArrayList<actividad> actividades) {
        this.actividades = actividades;
    }

    public void setProfesores(ArrayList<profesores> profesores) {
        this.profesores = profesores;
    }

    public void setAlumnos(ArrayList<alumnos> alumnos) {
        this.alumnos = alumnos;
    }
        
    public void generarComision(ArrayList<alumnos> alumnos,String salon, actividad actividadComision, String diaClase1, String diaClase2, profesores profesor,int idComision){
        comisiones nuevaComision = new comisiones(alumnos, salon, actividadComision, diaClase1, diaClase2, profesor, idComision);
        comisiones.add(nuevaComision);
    }
    
    public void pagarProfe(String profe,int idcomision){
        int comi = 0;
        int asistenciasTotales = 0;
        for(int i = 0;i<comisiones.size();i++){
            if (idcomision == comisiones.get(i).getIdComision()){
                comi = comisiones.get(i).getIdComision();
                break;
            }
        }
        for(int i = 0;i<comisiones.get(comi).getCantidadAlumnos();i++){
            asistenciasTotales += comisiones.get(i).asistencia.get(i);
        }
        asistenciasTotales *= 10;
        comisiones.get(comi).profesor.setSalario(comisiones.get(comi).profesor.getSalario() + asistenciasTotales);
    
    }
}
