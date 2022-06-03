/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diegocamilocastrooliveros.controladores;

import diegocamilocastrooliveros.modelo.Persona;
import diegocamilocastrooliveros.vistas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author macbookprom1
 */
public class ControlPersona implements ActionListener {

    private JDialog objetovistaActual;
    private Persona objetoPersona;
    
    public ControlPersona(JDialog ventana){
        this.objetovistaActual = ventana;
    } 
    
    @Override
    public void actionPerformed (ActionEvent evento) {
        
       String comandoAccion = evento.getActionCommand();
       
        if (comandoAccion.equals("agregar_persona")) {
           try {
               this.accionAgregarPersona(evento);
           } catch (Exception ex) {
               Logger.getLogger(ControlPersona.class.getName()).log(Level.SEVERE, null, ex);
           }

        }

        else if (comandoAccion.equals("buscar_persona")) {
           this.accionBuscarPersona(evento);

        }

        else if (comandoAccion.equals("borrar_persona")) {
        this.accionBorrarPersona(evento);

        }

        else if (comandoAccion.equals("editar_persona")) {
        this.accionEditarPersona(evento);

        }

        else if (comandoAccion.equals("listar_persona")) {
        this.accionListarPersona(evento);

        }
        
    }
    public void accionAgregarPersona(ActionEvent evento) throws Exception {
        
        VentanaAgregarPersona vista = (VentanaAgregarPersona) objetovistaActual;
        //obtenet los datos introducidos en los campos de la vista
        String id = vista.getCampoId().getText();
        String nombre = vista.getCampoNombre().getText();
        String apellido = vista.getCampoApellido().getText();
        String genero = (String) vista.getComboGenero().getSelectedItem();
        String nacimiento = vista.getCampoFechaDeNacimiento().getText();
        String email = vista.getCampoEmail().getText();
        String telefono = vista.getCampoTelefono().getText();
        String direccion = vista.getCajaDireccion().getText();
        // crear el objeto de la clase Persona
        this.objetoPersona = new Persona();
        // setear sus propiedades con los datos introducidos en la vista
        this.objetoPersona.setId(id);
        this.objetoPersona.setNombre(nombre);
        this.objetoPersona.setApellido(apellido);
        this.objetoPersona.setGenero(genero);
        // pasar la fecha de String a Date
        Date fechaDeNacimiento = null;
        SimpleDateFormat formateadorDeFecha = new SimpleDateFormat("yyyy-M-d");

        try {
        // se hacer el cambio
        fechaDeNacimiento = formateadorDeFecha.parse(nacimiento);
        this.objetoPersona.setFechaNacimiento(fechaDeNacimiento);
        }
        catch (ParseException error) {
        vista.mostrarMensaje("Para poder continuar por favor digite una fecha valida");
        return;
        }
      
        this.objetoPersona.setTelefono(telefono);
        this.objetoPersona.setEmail(email);
        this.objetoPersona.setDireccion(direccion);
        
        try{
         objetoPersona.guardarEnDisco();
        }
        catch(Exception error){
         vista.mostrarMensaje("Error al Guardar esta Persona ya esta en la agenda\n");
        }
     
  
        vista.mostrarMensaje("Se agrego la siguiente persona en la agenda:\n"+ objetoPersona.devolverDatos());
}
        

    public void accionBuscarPersona(ActionEvent evento) {
        
        VentanaBuscarPersona ventana= (VentanaBuscarPersona)this.objetovistaActual;
        String id = JOptionPane.showInputDialog(this.objetovistaActual,"DIJITE EL ID DE LA PESONA");
                
        if(id == null||id.trim().length()<=0){
        ventana.mostrarMensaje("DEBE INGRESAR UN ID VALIDO");
        return;
        }
        else{
        try{
            
        this.objetoPersona = Persona.BuscarPersona(id);
        
        ventana.getCampoId().setText(objetoPersona.getId());
        ventana.getCampoNombre().setText(objetoPersona.getNombre());
        ventana.getCampoApellido().setText(objetoPersona.getApellido());
        ventana.getCampoEmail().setText(objetoPersona.getEmail());
        ventana.getCampoTelefono().setText(objetoPersona.getTelefono());
        ventana.getCajaDireccion().setText(objetoPersona.getDireccion());
        SimpleDateFormat FormateadorFecha = new SimpleDateFormat("dd-MM-yyy");
        String fechaN = FormateadorFecha.format(objetoPersona.getFechaNacimiento());
        ventana.getCampoFechaDeNacimiento().setText(fechaN);
        ventana.getComboGenero().setSelectedItem(objetoPersona.getGenero());
                
        }
        catch(Exception error){ventana.mostrarMensaje("NO SE HA ENCONTRADO EL ID ");
        return;
        }

        }
        
        
        
}
    public void accionBorrarPersona(ActionEvent evento) {
}
    public void accionEditarPersona(ActionEvent evento) {
}
    public void accionListarPersona(ActionEvent evento) {
}
    
    
    
}
