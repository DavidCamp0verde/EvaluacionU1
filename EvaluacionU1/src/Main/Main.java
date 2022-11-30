/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controlador.AtencionController;
import Modelo.Atencion;
import Modelo.Persona;

/**
 *
 * @author david
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Campoverde", "David");
        Persona p2 = new Persona("Sotooo", "Mauricio");
        Persona p3 = new Persona("Messi", "Lionel");
        Persona p4 = new Persona("Ochoa", "Guillermo");
        Persona p5 = new Persona("Alfaro", "Gustavo");
        Persona p6 = new Persona("Ramirez", "Camila");
        
        AtencionController ac = new AtencionController();
        Atencion a = new Atencion("Apertura cuenta");
        
        try {
            a.getPersonas().insertar(p1);
            a.getPersonas().insertar(p2);
            a.getPersonas().imprimir();
            
            ac.getAtenciones().insertar(a);
            ac.getAtenciones().imprimir();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
