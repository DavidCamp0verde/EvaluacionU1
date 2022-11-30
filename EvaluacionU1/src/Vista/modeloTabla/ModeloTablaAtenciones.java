/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.modeloTabla;

import Controlador.AtencionController;
import Modelo.Atencion;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author david
 */
public class ModeloTablaAtenciones extends AbstractTableModel{
    private AtencionController listadoAtenciones;
    
    @Override
    public int getRowCount() {
        return listadoAtenciones.getAtenciones().getSize();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0: return "ID";
            case 1: return "Nro Atenciones";
            case 2: return "Fecha";
            case 3: return "Asunto";
            case 4: return "Responsable";
            default:return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Atencion a = null;
        try {
            a = listadoAtenciones.getAtenciones().obtener(rowIndex);
        } catch (Exception e) {
        }
        
        switch(columnIndex){
            case 0: return (rowIndex+1);
            case 1: return (a != null) ? a.getPersonas().getSize() : "SIN DEFINIR";
            case 2: return (a != null) ? (a.getFechaAtenciones()): "SIN DEFINIR";
            case 3: return (a != null) ? a.getAsunto(): "SIN DEFINIR";
            case 4: return (a != null) ? (a.getResponsable().getNombres()+" "+a.getResponsable().getApellidos()): "SIN DEFINIR";
            default:return null;
        }
    }

    public AtencionController getListadoAtenciones() {
        return listadoAtenciones;
    }

    public void setListadoAtenciones(AtencionController listadoAtenciones) {
        this.listadoAtenciones = listadoAtenciones;
    }
    
    
}
