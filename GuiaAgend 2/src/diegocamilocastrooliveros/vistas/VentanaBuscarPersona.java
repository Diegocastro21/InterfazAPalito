/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diegocamilocastrooliveros.vistas;

import diegocamilocastrooliveros.controladores.ControlPersona;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

/**
 *
 * @author macbookprom1
 */
public class VentanaBuscarPersona extends JDialog{

    public VentanaBuscarPersona(VentanaPrincipal ventanaPrincipal) {
        super(ventanaPrincipal);
        this.configurar();
    }
// PROPIEDADES
    private VentanaPrincipal ventanaPrincipal;
    private JPanel contenedorDeCampos;
    private JPanel contenedorParaLaFoto;
    private JLabel etiquetaTitulo;
    private JLabel etiquetaId;
    private JTextField campoId;
    private JLabel etiquetaNombre;
    private JTextField campoNombre;
    private JLabel etiquetaApellido;
    private JTextField campoApellido;
    private JLabel etiquetaFechaDeNacimiento;
    private JFormattedTextField campoFechaDeNacimiento;
    private JLabel etiquetaGenero;
    private JComboBox comboGenero;
    private JLabel etiquetaTelefono;
    private JTextField campoTelefono;
    private JLabel etiquetaEmail;
    private JTextField campoEmail;
    private JLabel etiquetaDireccion;
    private JScrollPane contenedorAreaDesplazamiento;
    private JTextArea cajaDireccion;
    private JButton botonAceptar;
    private JButton botonCancelar;
    private JButton botonBuscar;

    public void configurar() {

        // Liberar memoria RAM y de Video cuando se cierra la ventana
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
// hacer que esta ventana sea Modal, es decir que esta ventana tenga mayor prioridad
        this.setModal(true);
// obtener el objeto panel de contenidos incluido en la ventana
        Container contendorDelaVentana = this.getContentPane();
// Crear un objeto diseñador para la ventena de tipo GridBag
        GridBagLayout gestorDiseñoVentana = new GridBagLayout();
// cambiamos el diseñador que trae por defecto panelDeContenido por este nuevo Diseñador
        contendorDelaVentana.setLayout(gestorDiseñoVentana);
// creamos un objeto que nos permita aplicar reglas de Posicion a los componentes dentro de la ventana
// creamos el objeto Para la etiquetaTitulo
        this.etiquetaTitulo = new JLabel();
// Colocar el texto de la etiquetaTitulo
        this.etiquetaTitulo.setText("Formulario Para Agregar Una Nueva Persona a La Agenda");
// CAMBIAR SUS PROPIEDADES USANDO SUS METOSDOS SET Y GET
// cambiar el tipo y tamaño de latra del obejeto etiquetaTitulo
        Font tipoDeLetra = new Font("Arial", Font.PLAIN, 20); // arial,normal, tamaño 20
        this.etiquetaTitulo.setFont(tipoDeLetra);
//cambiar el color de la latra
        this.etiquetaTitulo.setForeground(Color.BLUE);
// centrar el texto de la etiqueta
        this.etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
// crear el objeto panelDeDatos donde seran colocados los campos del formulario
        this.contenedorDeCampos = new JPanel();
// cambiar el diseñador del panelDeDatos por un diseñador de Filas y Columnas
        GridBagLayout diseñadorPanelDeDatos = new GridBagLayout();
// cambiamos el diseñador que trae por defecto el panel por este nuevo diseñador
        contenedorDeCampos.setLayout(diseñadorPanelDeDatos);
// cambier el borde del panel por otro Con titulo
        contenedorDeCampos.setBorder(new TitledBorder("Ingrese los Datos de la Nueva Persona"));
// Creamos los componentes que van dentro del panel de datos 
        Dimension tamañoDeLosCompos = new Dimension(20, 80);
// creamos el objeto para la etiqueta de texto del campo id
        this.etiquetaId = new JLabel("Id:");
        this.etiquetaId.setFont(new Font("Candara", Font.BOLD, 14));// tipo de letra Candara, Negrita 1, tamaño 12
        this.etiquetaId.setForeground(Color.BLACK);
        this.etiquetaId.setHorizontalAlignment(SwingConstants.RIGHT); //justificado a la deracha
// crear y configurar un objeto Campo de Texto para ingresar el id de la persona
        this.campoId = new JTextField();
        this.campoId.setFont(new Font("Calibri", 0, 14));
        this.campoId.setForeground(Color.BLACK);
        this.campoId.setHorizontalAlignment(SwingConstants.CENTER);
//this.campoId.setPreferredSize(tamañoDeLosCompos);
// creamos el objeto para la etiqueta de texto del campo nombre
        this.etiquetaNombre = new JLabel("Nombre:");
        this.etiquetaNombre.setFont(new Font("Candara", Font.BOLD, 14));//tipo de letra Candara, Negrita 1, tamaño 12
        this.etiquetaNombre.setForeground(Color.BLACK);
        this.etiquetaNombre.setHorizontalAlignment(SwingConstants.RIGHT); //justificado a la deracha
// crear y configurar un objeto Campo de Texto para ingresar el Nombre de la persona
        this.campoNombre = new JTextField();
        this.campoNombre.setFont(new Font("Calibri", 0, 14));
        this.campoNombre.setForeground(Color.BLACK);
        this.campoNombre.setHorizontalAlignment(SwingConstants.CENTER);
//this.campoNombre.setPreferredSize(tamañoDeLosCompos);
// creamos el objeto para la etiqueta de texto del campo Apellido
        this.etiquetaApellido = new JLabel("Apellido:");
        this.etiquetaApellido.setFont(new Font("Candara", Font.BOLD, 14));//tipo de letra Candara, Negrita 1, tamaño 12
        this.etiquetaApellido.setForeground(Color.BLACK);
        this.etiquetaApellido.setHorizontalAlignment(SwingConstants.RIGHT);
// justificado a la deracha
// crear y configurar un objeto Campo de Texto para ingresar el Apellido de la persona
        this.campoApellido = new JTextField();
        this.campoApellido.setFont(new Font("Calibri", 0, 14));
        this.campoApellido.setForeground(Color.BLACK);
        this.campoApellido.setHorizontalAlignment(SwingConstants.CENTER);
//this.campoApellido.setPreferredSize(tamañoDeLosCompos);
// creamos el objeto para la etiqueta de texto del campo Fecha Nacimiento
        this.etiquetaFechaDeNacimiento = new JLabel("Nacimiento:");
        this.etiquetaFechaDeNacimiento.setFont(new Font("Candara", Font.BOLD,
                14));// tipo de letra Candara, Negrita 1, tamaño 12
        this.etiquetaFechaDeNacimiento.setForeground(Color.BLACK);
        this.etiquetaFechaDeNacimiento.setHorizontalAlignment(SwingConstants.RIGHT);
// justificado a la deracha
// crear y configurar un objeto Campo de Texto para ingresar el La fecha de Nacimiento de la persona
        this.campoFechaDeNacimiento = new JFormattedTextField();
        this.campoFechaDeNacimiento.setFont(new Font("Calibri", 0, 14));
        this.campoFechaDeNacimiento.setForeground(Color.BLACK);
        this.campoFechaDeNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
// this.campoFechaDeNacimiento.setPreferredSize(tamañoDeLosCompos);
// creamos el objeto para la etiqueta de texto del campo Fecha Genero
        this.etiquetaGenero = new JLabel("Genero:");
        this.etiquetaGenero.setFont(new Font("Candara", Font.BOLD, 14));//tipo de letra Candara, Negrita 1, tamaño 12
        this.etiquetaGenero.setForeground(Color.BLACK);
        this.etiquetaGenero.setHorizontalAlignment(SwingConstants.RIGHT); //justificado a la deracha
// crear y configurar un objeto COMBO para Seleccionar el Genero de la persona
        this.comboGenero = new JComboBox();
        this.comboGenero.setFont(new Font("Calibri", 0, 14));
        this.comboGenero.setForeground(Color.BLACK);
// agregar el arreglo de opciones al combo
        this.comboGenero.addItem("Seleccione un ...");
        this.comboGenero.addItem("Hombre");
        this.comboGenero.addItem("Mujer");
// this.comboGenero.setPreferredSize(tamañoDeLosCompos);
// creamos el objeto para la etiqueta de texto del campo Telefono
        this.etiquetaTelefono = new JLabel("Telefono:");
        this.etiquetaTelefono.setFont(new Font("Candara", Font.BOLD, 14));//tipo de letra Candara, Negrita 1, tamaño 12
        this.etiquetaTelefono.setForeground(Color.BLACK);
        this.etiquetaTelefono.setHorizontalAlignment(SwingConstants.RIGHT);
// justificado a la derecha
// crear y configurar un objeto Campo de Texto para ingresar el Telefono de la persona
        this.campoTelefono = new JTextField();
        this.campoTelefono.setFont(new Font("Calibri", 0, 14));
        this.campoTelefono.setForeground(Color.BLACK);
        this.campoTelefono.setHorizontalAlignment(SwingConstants.CENTER);
// this.campoTelefono.setPreferredSize(tamañoDeLosCompos);
// creamos el objeto para la etiqueta de texto del campo Email
        this.etiquetaEmail = new JLabel("Email:");
        this.etiquetaEmail.setFont(new Font("Candara", Font.BOLD, 14));//tipo de letra Candara, Negrita 1, tamaño 12
        this.etiquetaEmail.setForeground(Color.BLACK);
        this.etiquetaEmail.setHorizontalAlignment(SwingConstants.RIGHT); // justificado a la derecha
// crear y configurar un objeto Campo de Texto para ingresar el Gmail de la persona
        this.campoEmail = new JTextField();
        this.campoEmail.setFont(new Font("Calibri", 0, 14));
        this.campoEmail.setForeground(Color.BLACK);
        this.campoEmail.setHorizontalAlignment(SwingConstants.CENTER);
//this.campoEmail.setPreferredSize(tamañoDeLosCompos);
// creamos el objeto para la etiqueta de texto del campo Direccion
        this.etiquetaDireccion = new JLabel("Direccion:");
        this.etiquetaDireccion.setFont(new Font("Candara", Font.BOLD, 14));//tipo de letra Candara, Negrita 1, tamaño 12
        this.etiquetaDireccion.setForeground(Color.BLACK);
        this.etiquetaDireccion.setHorizontalAlignment(SwingConstants.RIGHT);
// justificado a la deracha
// crear y configurar un objeto la Caja de Texto para ingresar La direccion de la persona
        this.cajaDireccion = new JTextArea(3, 15);
        this.cajaDireccion.setFont(new Font("Calibri", 0, 14));
        this.cajaDireccion.setForeground(Color.BLACK);
        this.contenedorAreaDesplazamiento = new JScrollPane(this.cajaDireccion);
//this.panelDireccion.setPreferredSize(this.cajaDireccion.getPreferredSize());
// crear el panel de la foro

        this.botonBuscar = new JButton();
//this.botonBuscar.setPreferredSize(new Dimension(40, 40));
        this.botonBuscar.setActionCommand("buscar_persona");
        ImageIcon iconoBuscar;
        iconoBuscar = new ImageIcon(this.getClass().getResource("/jefrenamaya/agendajava/vistas/icono/buscar.png"));
        this.botonBuscar.setIcon(iconoBuscar);

        this.contenedorParaLaFoto = new JPanel();
        this.contenedorParaLaFoto.setBorder(new TitledBorder(""));
        this.contenedorParaLaFoto.setPreferredSize(new Dimension(70, 70));
// crear los botones
        this.botonAceptar = new JButton("Aceptar");
        this.botonAceptar.setPreferredSize(new Dimension(15, 20));
        this.botonCancelar = new JButton("Cancelar");
        this.botonCancelar.setPreferredSize(new Dimension(15, 20));
// agregar la etiqueta al panelDeContenidos
        this.agregarComponenteConReglas(this.etiquetaTitulo, contendorDelaVentana, 0, 0, 3, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.FIRST_LINE_START, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
// AGREGAR LOS COMPONENTES AL PANEL DE DATOS
        this.agregarComponenteConReglas(this.etiquetaId, this.contenedorDeCampos, 0, 0, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.campoId, this.contenedorDeCampos, 1, 0, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.etiquetaNombre, this.contenedorDeCampos, 0, 1, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.campoNombre, this.contenedorDeCampos, 1, 1, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.etiquetaApellido, this.contenedorDeCampos, 0, 3, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.campoApellido, this.contenedorDeCampos, 1, 3, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.etiquetaGenero, this.contenedorDeCampos, 0, 4, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.comboGenero, this.contenedorDeCampos, 1, 4, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.etiquetaFechaDeNacimiento, this.contenedorDeCampos, 0, 5, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.campoFechaDeNacimiento, this.contenedorDeCampos, 1, 5, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.etiquetaEmail, this.contenedorDeCampos, 0, 6, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.campoEmail, this.contenedorDeCampos, 1, 6, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.etiquetaTelefono, this.contenedorDeCampos, 0, 7, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.campoTelefono, this.contenedorDeCampos, 1, 7, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.etiquetaDireccion, this.contenedorDeCampos, 0, 8, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.contenedorAreaDesplazamiento, this.contenedorDeCampos, 1, 8, 1, 1, GridBagConstraints.BOTH, GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
// agregar el apenel de datos al panel de contenidos
        this.agregarComponenteConReglas(this.contenedorDeCampos, contendorDelaVentana, 0, 1, 1, 2, GridBagConstraints.BOTH, GridBagConstraints.FIRST_LINE_START, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
// colocar el panel de la foto
        this.agregarComponenteConReglas(this.contenedorParaLaFoto, contendorDelaVentana, 1, 1, 2, 1, GridBagConstraints.NONE, GridBagConstraints.CENTER, 0.5f, 0.5f, 100, 100, 5, 5, 5, 5);
//agregar los botones
        this.agregarComponenteConReglas(this.botonAceptar, contendorDelaVentana, 1, 2, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.LAST_LINE_END, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.botonCancelar, contendorDelaVentana, 2, 2, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.LAST_LINE_END, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.botonBuscar, contenedorDeCampos, 3, 1, 2, 2, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        ControlPersona controlador = new ControlPersona(this);
        this.botonAceptar.setActionCommand("buscar_persona");
        this.botonBuscar.addActionListener(controlador);
        this.pack();

    }

    public void agregarComponenteConReglas(JComponent componente, Container contenedor, int fila, int columna, int numFilas, int numColumnas, int relleno, int anclado, float espaciadox, float especiadoy, int espacioX, int espacioY, int bordeSuperior, int bordeIzquierdo, int bordeInferior, int bordeDerecho) {
// crear un objeto para definir las reglas
        GridBagConstraints reglas = new GridBagConstraints();
//Las clumna y la fila donde se debe ubicar al componente
        reglas.gridy = columna;
        reglas.gridx = fila;
// Las filas y las columnas que debe ocupar el componente
        reglas.gridwidth = numFilas;
        reglas.gridheight = numColumnas;
// El comportamiento del componente cuando el contenedor cambie de tamaño
        reglas.fill = relleno; // NONE, VERTICAL, HORIZONTAL, BOTH
// El lugar dentro de la celda donde debe quedarse fijo el componente
        reglas.anchor = anclado; // NORTH, NORTHEAST, EAST, SOUTHEAST, SOUTH,SOUTHWEST, WEST, NORTHWEST
// porcentaje de estiramiento o encogimiento horizontal X o vertical Y
        reglas.weightx = espaciadox;
        reglas.weighty = especiadoy;
// tamaño minimo que debe tener el componente en ancho y alto
        reglas.ipadx = espacioX;
        reglas.ipady = espacioY;
// espacio minimo que debe tener los componentes entre si
        reglas.insets = new Insets(bordeSuperior, bordeIzquierdo, bordeInferior, bordeDerecho);
// se optiner el gestorDePosicionamiento del contenedor pasado como paramentro
        GridBagLayout diseñador = (GridBagLayout) contenedor.getLayout();
// se aplican las reglas del componente dentro del gestorDePosicionamiento
        diseñador.setConstraints(componente, reglas);
// se agrega el componente que se pasa como parametro al contenedor
        contenedor.add(componente);
    }

    public JButton getBotonAceptar() {
        return botonAceptar;
    }

    public JButton getBotonCancelar() {
        return botonCancelar;
    }

    public JTextArea getCajaDireccion() {
        return cajaDireccion;
    }

    public JTextField getCampoApellido() {
        return campoApellido;
    }

    public JTextField getCampoEmail() {
        return campoEmail;
    }

    public JFormattedTextField getCampoFechaDeNacimiento() {
        return campoFechaDeNacimiento;
    }

    public JTextField getCampoId() {
        return campoId;
    }

    public JTextField getCampoNombre() {
        return campoNombre;
    }

    public JTextField getCampoTelefono() {
        return campoTelefono;
    }

    public JComboBox getComboGenero() {
        return comboGenero;
    }

    public JScrollPane getContenedorAreaDesplazamiento() {
        return contenedorAreaDesplazamiento;
    }

    public JPanel getContenedorDeCampos() {
        return contenedorDeCampos;
    }

    public JPanel getContenedorParaLaFoto() {
        return contenedorParaLaFoto;
    }

    public JLabel getEtiquetaApellido() {
        return etiquetaApellido;
    }

    public JLabel getEtiquetaDireccion() {
        return etiquetaDireccion;
    }

    public JLabel getEtiquetaEmail() {
        return etiquetaEmail;
    }

    public JLabel getEtiquetaFechaDeNacimiento() {
        return etiquetaFechaDeNacimiento;
    }

    public JLabel getEtiquetaGenero() {
        return etiquetaGenero;
    }

    public JLabel getEtiquetaId() {
        return etiquetaId;
    }

    public JLabel getEtiquetaNombre() {
        return etiquetaNombre;
    }

    public JLabel getEtiquetaTelefono() {
        return etiquetaTelefono;
    }

    public JLabel getEtiquetaTitulo() {
        return etiquetaTitulo;
    }

    public VentanaPrincipal getVentanaPrincipal() {
        return ventanaPrincipal;
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }
}
