package diegocamilocastrooliveros.vistas;

import diegocamilocastrooliveros.vistas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends JFrame {
    
    private JMenuBar barramenu;
    private JMenu menuSesion;
    private JMenu menuPersona;
    private JMenu menuEvento;
    private JMenu menuInvitacion;
    private JMenu menuAyuda;
    
    private JMenuItem opcionMenuIniciarSesion;
    private JMenuItem opcionMenuCerrarSesion;
    private JMenuItem opcionMenuSalirSesion;
    
    private JMenuItem opcionMenuAgregarPersona;
    private JMenuItem opcionMenuBuscarPersona;
    private JMenuItem opcionMenuEditarPersona;
    private JMenuItem opcionMenuBorrarPersona;
    
    private JMenu subMenuListarPersona;
    private JMenuItem opcionListarPersonaPorNombre;
    private JMenuItem opcionListarPersonaPorApellido;
    private JMenuItem opcionListarPersonaPorGenero;
    private JMenuItem opcionListarPersonaPorFechaNacimiento;
    private JMenuItem opcionListarPersonaPorEvento;
    
    
    public VentanaPrincipal(){
        this.configurar();
    }
    
    public void configurar() {
        this.barramenu = new JMenuBar();

        this.setJMenuBar(barramenu);

        this.menuSesion = new JMenu("Sesion");
        this.menuSesion.setMnemonic('S');

        this.barramenu.add(this.menuSesion);

        this.opcionMenuIniciarSesion = new JMenuItem("Iniciar");
        this.opcionMenuCerrarSesion = new JMenuItem("Cerrar");
        this.opcionMenuSalirSesion = new JMenuItem("Salir");

        this.menuSesion.add(opcionMenuIniciarSesion);
        this.menuSesion.add(opcionMenuCerrarSesion);
        this.menuSesion.add(opcionMenuSalirSesion);

        this.menuPersona = new JMenu("Personas");
        this.barramenu.add(this.menuPersona);
        this.menuPersona.setMnemonic('P');
        this.opcionMenuAgregarPersona = new JMenuItem("Agregar...");
        this.opcionMenuBorrarPersona = new JMenuItem("Borrar...");
        this.opcionMenuBuscarPersona = new JMenuItem("Buscar...");
        this.opcionMenuEditarPersona = new JMenuItem("Editar...");
        this.menuPersona.add(this.opcionMenuAgregarPersona);
        this.menuPersona.add(this.opcionMenuBuscarPersona);
        this.menuPersona.add(this.opcionMenuEditarPersona);
        this.menuPersona.add(this.opcionMenuBorrarPersona);
        //	crear	el	objeto	para	el	submenu
        this.subMenuListarPersona = new JMenu("Listar...");
        //	agregar	el	submenu	al	menu	persona
        this.menuPersona.add(this.subMenuListarPersona);
        //	crera	las	opciones	del	sumenu
        this.opcionListarPersonaPorNombre = new JMenuItem("Por	Nombre...");
        this.opcionListarPersonaPorApellido = new JMenuItem("Por	Apellido...");
        this.opcionListarPersonaPorGenero = new JMenuItem("Por	Genero...");
        this.opcionListarPersonaPorFechaNacimiento = new JMenuItem("Por	 Fecha	 de	Nacimiento...");
        this.opcionListarPersonaPorEvento = new JMenuItem("Por	Evento...");
        this.subMenuListarPersona.add(this.opcionListarPersonaPorNombre);
        this.subMenuListarPersona.add(this.opcionListarPersonaPorApellido);
        this.subMenuListarPersona.add(this.opcionListarPersonaPorGenero);
        this.subMenuListarPersona.add(this.opcionListarPersonaPorFechaNacimiento);
        this.subMenuListarPersona.add(this.opcionListarPersonaPorEvento);
        
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       
        ActionListener eventoAgregarPersona = new ActionListener() {
            

            @Override
            public void actionPerformed(ActionEvent evento) {
                mostrarVentanaAgregarPersona(evento);
            }
            
        };
        
        ActionListener eventoBuscarPersona = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent evento) {
            mostrarVentanaBuscarPersona(evento);
        }
    };
        
        this.opcionMenuAgregarPersona.addActionListener(eventoAgregarPersona);
        this.opcionMenuBuscarPersona.addActionListener(eventoBuscarPersona);
        
}
    
    public void mostrarVentanaAgregarPersona(ActionEvent evento){
        VentanaAgregarPersona miVentana = new VentanaAgregarPersona(this);
        miVentana.setLocationRelativeTo(this);
        miVentana.setVisible(true);
    }
    
    public void mostrarVentanaBuscarPersona(ActionEvent evento) {
        VentanaBuscarPersona ventana = new VentanaBuscarPersona(this);
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }
}
