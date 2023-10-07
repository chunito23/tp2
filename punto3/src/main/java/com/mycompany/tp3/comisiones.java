/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 *
 * @author domin
 */
public class comisiones {
    int idComision;
    String salon;
    actividad actividadComision;
    String diaClase1;
    String diaClase2;
    profesores profesor;
    ArrayList<alumnos> alumnos;
    ArrayList<Integer> asistencia;
    int cantidadAlumnos;

    public comisiones(ArrayList<alumnos> alumnos,String salon, actividad actividadComision, String diaClase1, String diaClase2, profesores profesor,int idComision) {
        this.alumnos = alumnos;
        this.salon = salon;
        this.actividadComision = actividadComision;
        this.diaClase1 = diaClase1;
        this.diaClase2 = diaClase2;
        this.profesor = profesor;
        this.idComision = idComision;
        this.cantidadAlumnos = alumnos.size();
    }
    
    public void mostrarAlumnos(){
        for(int i = 0;i<alumnos.size();i++){
            System.out.println("alumno: " + alumnos.get(i).getNombre());
        }
    }
    
    public void iniciarComision(){
        for(int i = 0;i<alumnos.size();i++){
            asistencia.add(0);
        }
    }
    
    public void registrarAsistencia(int idalumno){
        for(int i = 0;i<alumnos.size();i++){
            if (idalumno == alumnos.get(i).getIdAlumno()){
                int valor = asistencia.get(i);
                asistencia.set(i,idalumno++);
            }
        }
    }
    
    
    public int getIdComision() {
        return idComision;
    }

    public void setIdComision(int idComision) {
        this.idComision = idComision;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public actividad getActividadComision() {
        return actividadComision;
    }

    public void setActividadComision(actividad actividadComision) {
        this.actividadComision = actividadComision;
    }

    public String getDiaClase1() {
        return diaClase1;
    }

    public void setDiaClase1(String diaClase1) {
        this.diaClase1 = diaClase1;
    }

    public String getDiaClase2() {
        return diaClase2;
    }

    public void setDiaClase2(String diaClase2) {
        this.diaClase2 = diaClase2;
    }

    public profesores getProfesor() {
        return profesor;
    }

    public void setProfesor(profesores profesor) {
        this.profesor = profesor;
    }

    public ArrayList<alumnos> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<alumnos> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Integer> getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(ArrayList<Integer> asistencia) {
        this.asistencia = asistencia;
    }

    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setCantidadAlumnos(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }
}
