/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.Listas.ListaEnlazada;
import Modelo.Atencion;

/**
 *
 * @author david
 */
public class AtencionController {
    private ListaEnlazada<Atencion> atenciones = new ListaEnlazada<>();

    public AtencionController() {
    }

    public ListaEnlazada<Atencion> getAtenciones() {
        return atenciones;
    }

    public void setAtenciones(ListaEnlazada<Atencion> atenciones) {
        this.atenciones = atenciones;
    }
    
    
}
