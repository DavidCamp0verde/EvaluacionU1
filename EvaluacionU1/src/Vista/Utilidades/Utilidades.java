/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Utilidades;

import Controlador.AtencionController;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author david
 */
public class Utilidades {
    public static boolean guardarArchivoJSON(AtencionController atenciones){
        Gson gson = new Gson();
        String json = gson.toJson(atenciones);
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("dataJSON.json"))){
            bw.write(json);
            return true;
        } catch (Exception e) {
            System.out.println("Error"+e);
            return false;
        }    
        
    }
    
    public static AtencionController cargarArchivoJSON(){
        String json = "";
        Gson gson = new Gson();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("dataJSON.json"));
            String linea = "";
            while((linea = br.readLine()) != null){
                json += linea;
            }
            
            br.close();
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        
        AtencionController atenciones = gson.fromJson(json, AtencionController.class);
        return atenciones;
    }
}
