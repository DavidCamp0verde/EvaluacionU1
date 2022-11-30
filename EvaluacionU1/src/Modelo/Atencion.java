/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Listas.ListaEnlazada;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author david
 */
public class Atencion {
    private Integer id;
    private Integer nroAtenciones;
    private String fechaAtenciones;
    private String Asunto;
    private Persona responsable;
    private ListaEnlazada<Persona> personas = new ListaEnlazada<>();

    public Atencion() {
    }

    public Atencion(String Asunto) {
        this();
        this.Asunto = Asunto;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNroAtenciones() {
        return nroAtenciones;
    }

    public void setNroAtenciones(Integer nroAtenciones) {
        this.nroAtenciones = nroAtenciones;
    }
    
    public LocalDate getFechaAtenciones() {
        LocalDate fecha = LocalDate.now();
        return fecha;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        this.Asunto = Asunto;
    }

    public Persona getResponsable() {
        return responsable;
    }

    public void setResponsable(Persona responsable) {
        this.responsable = responsable;
    }

    public ListaEnlazada<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ListaEnlazada<Persona> personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return this.Asunto + " "+ this.getFechaAtenciones();
    }
    
    
    
    
    
}
