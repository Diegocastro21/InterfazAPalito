package diegocamilocastrooliveros;

import diegocamilocastrooliveros.modelo.*;
import diegocamilocastrooliveros.vistas.*;
import javax.swing.JFrame;


public class Principal {

    public static void main(String[] args) {
        
        VentanaPrincipal ventana = new VentanaPrincipal();
        
        ventana.setTitle("::: Agenda Electronica :::");
        
        ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ventana.setVisible(true);
        
    }
    
}
