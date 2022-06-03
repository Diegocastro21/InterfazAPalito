/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diegocamilocastrooliveros.vistas;

/**
 *
 * @author macbookprom1
 */

import diegocamilocastrooliveros.controladores.ControlPersona;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
public class VentanaAgregarPersona extends JDialog {
    
    // FUNCION CONSTRUCTOR
    public VentanaAgregarPersona(VentanaPrincipal ventanaPrincipal) {
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

    public void configurar() {

        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setModal(true);
        Container contendorDelaVentana = this.getContentPane();
        GridBagLayout gestorDiseñoVentana = new GridBagLayout();
        contendorDelaVentana.setLayout(gestorDiseñoVentana);
        this.etiquetaTitulo = new JLabel();
        this.etiquetaTitulo.setText("Formulario Para Agregar Una Nueva Persona a La Agenda");
        Font tipoDeLetra = new Font("Arial", Font.PLAIN, 20); // arial,normal, tamaño 20
        this.etiquetaTitulo.setFont(tipoDeLetra);
        this.etiquetaTitulo.setForeground(Color.BLUE);
        this.etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        this.contenedorDeCampos = new JPanel();
        GridBagLayout diseñadorPanelDeDatos = new GridBagLayout();
        contenedorDeCampos.setLayout(diseñadorPanelDeDatos);
        contenedorDeCampos.setBorder(new TitledBorder("Ingrese los Datos de la Nueva Persona"));
        Dimension tamañoDeLosCompos = new Dimension(20, 80);
        this.etiquetaId = new JLabel("Id:");
        this.etiquetaId.setFont(new Font("Candara", Font.BOLD, 14));// tipo de letra Candara, Negrita 1, tamaño 12
        this.etiquetaId.setForeground(Color.BLACK);
        this.etiquetaId.setHorizontalAlignment(SwingConstants.RIGHT); //justificado a la deracha
        this.campoId = new JTextField();
        this.campoId.setFont(new Font("Calibri", 0, 14));
        this.campoId.setForeground(Color.BLACK);
        this.campoId.setHorizontalAlignment(SwingConstants.CENTER);
        this.etiquetaNombre = new JLabel("Nombre:");
        this.etiquetaNombre.setFont(new Font("Candara", Font.BOLD, 14));//tipo de letra Candara, Negrita 1, tamaño 12
        this.etiquetaNombre.setForeground(Color.BLACK);
        this.etiquetaNombre.setHorizontalAlignment(SwingConstants.RIGHT); //justificado a la deracha
        this.campoNombre = new JTextField();
        this.campoNombre.setFont(new Font("Calibri", 0, 14));
        this.campoNombre.setForeground(Color.BLACK);
        this.campoNombre.setHorizontalAlignment(SwingConstants.CENTER);
        this.etiquetaApellido = new JLabel("Apellido:");
        this.etiquetaApellido.setFont(new Font("Candara", Font.BOLD, 14));//tipo de letra Candara, Negrita 1, tamaño 12
        this.etiquetaApellido.setForeground(Color.BLACK);
        this.etiquetaApellido.setHorizontalAlignment(SwingConstants.RIGHT);
        this.campoApellido = new JTextField();
        this.campoApellido.setFont(new Font("Calibri", 0, 14));
        this.campoApellido.setForeground(Color.BLACK);
        this.campoApellido.setHorizontalAlignment(SwingConstants.CENTER);
        this.etiquetaFechaDeNacimiento = new JLabel("Nacimiento:");
        this.etiquetaFechaDeNacimiento.setFont(new Font("Candara", Font.BOLD,
                14));// tipo de letra Candara, Negrita 1, tamaño 12
        this.etiquetaFechaDeNacimiento.setForeground(Color.BLACK);
        this.etiquetaFechaDeNacimiento.setHorizontalAlignment(SwingConstants.RIGHT);
        this.campoFechaDeNacimiento = new JFormattedTextField();
        this.campoFechaDeNacimiento.setFont(new Font("Calibri", 0, 14));
        this.campoFechaDeNacimiento.setForeground(Color.BLACK);
        this.campoFechaDeNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
        this.etiquetaGenero = new JLabel("Genero:");
        this.etiquetaGenero.setFont(new Font("Candara", Font.BOLD, 14));//tipo de letra Candara, Negrita 1, tamaño 12
        this.etiquetaGenero.setForeground(Color.BLACK);
        this.etiquetaGenero.setHorizontalAlignment(SwingConstants.RIGHT); //justificado a la deracha
        this.comboGenero = new JComboBox();
        this.comboGenero.setFont(new Font("Calibri", 0, 14));
        this.comboGenero.setForeground(Color.BLACK);
        this.comboGenero.addItem("Seleccione un ...");
        this.comboGenero.addItem("Hombre");
        this.comboGenero.addItem("Mujer");
        this.etiquetaTelefono = new JLabel("Telefono:");
        this.etiquetaTelefono.setFont(new Font("Candara", Font.BOLD, 14));//tipo de letra Candara, Negrita 1, tamaño 12
        this.etiquetaTelefono.setForeground(Color.BLACK);
        this.etiquetaTelefono.setHorizontalAlignment(SwingConstants.RIGHT);
        this.campoTelefono = new JTextField();
        this.campoTelefono.setFont(new Font("Calibri", 0, 14));
        this.campoTelefono.setForeground(Color.BLACK);
        this.campoTelefono.setHorizontalAlignment(SwingConstants.CENTER);
        this.etiquetaEmail = new JLabel("Email:");
        this.etiquetaEmail.setFont(new Font("Candara", Font.BOLD, 14));//tipo de letra Candara, Negrita 1, tamaño 12
        this.etiquetaEmail.setForeground(Color.BLACK);
        this.etiquetaEmail.setHorizontalAlignment(SwingConstants.RIGHT); // justificado a la derecha
        this.campoEmail = new JTextField();
        this.campoEmail.setFont(new Font("Calibri", 0, 14));
        this.campoEmail.setForeground(Color.BLACK);
        this.campoEmail.setHorizontalAlignment(SwingConstants.CENTER);
        this.etiquetaDireccion = new JLabel("Direccion:");
        this.etiquetaDireccion.setFont(new Font("Candara", Font.BOLD, 14));//tipo de letra Candara, Negrita 1, tamaño 12
        this.etiquetaDireccion.setForeground(Color.BLACK);
        this.etiquetaDireccion.setHorizontalAlignment(SwingConstants.RIGHT);
        this.cajaDireccion = new JTextArea(3, 15);
        this.cajaDireccion.setFont(new Font("Calibri", 0, 14));
        this.cajaDireccion.setForeground(Color.BLACK);
        this.contenedorAreaDesplazamiento = new JScrollPane(this.cajaDireccion);
        this.contenedorParaLaFoto = new JPanel();
        this.contenedorParaLaFoto.setBorder(new TitledBorder(""));
        this.contenedorParaLaFoto.setPreferredSize(new Dimension(70, 70));
        this.botonAceptar = new JButton("Aceptar");
        this.botonAceptar.setPreferredSize(new Dimension(15, 20));
        this.botonCancelar = new JButton("Cancelar");
        this.botonCancelar.setPreferredSize(new Dimension(15, 20));
        this.agregarComponenteConReglas(this.etiquetaTitulo,
                contendorDelaVentana, 0, 0, 3, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.FIRST_LINE_START, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);

        this.agregarComponenteConReglas(this.etiquetaId,
                this.contenedorDeCampos, 0, 0, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.campoId,
                this.contenedorDeCampos, 1, 0, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.etiquetaNombre,
                this.contenedorDeCampos, 0, 1, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.campoNombre,
                this.contenedorDeCampos, 1, 1, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.etiquetaApellido,
                this.contenedorDeCampos, 0, 3, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.campoApellido,
                this.contenedorDeCampos, 1, 3, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.etiquetaGenero,
                this.contenedorDeCampos, 0, 4, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.comboGenero,
                this.contenedorDeCampos, 1, 4, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.etiquetaFechaDeNacimiento,
                this.contenedorDeCampos, 0, 5, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.campoFechaDeNacimiento,
                this.contenedorDeCampos, 1, 5, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.etiquetaEmail,
                this.contenedorDeCampos, 0, 6, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.campoEmail,
                this.contenedorDeCampos, 1, 6, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.etiquetaTelefono,
                this.contenedorDeCampos, 0, 7, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.campoTelefono,
                this.contenedorDeCampos, 1, 7, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.etiquetaDireccion,
                this.contenedorDeCampos, 0, 8, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.contenedorAreaDesplazamiento,
                this.contenedorDeCampos, 1, 8, 1, 1, GridBagConstraints.BOTH,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.contenedorDeCampos,
                contendorDelaVentana, 0, 1, 1, 2, GridBagConstraints.BOTH,
                GridBagConstraints.FIRST_LINE_START, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.contenedorParaLaFoto,
                contendorDelaVentana, 1, 1, 2, 1, GridBagConstraints.NONE,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 100, 100, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.botonAceptar,
                contendorDelaVentana, 1, 2, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.LAST_LINE_END, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.botonCancelar,
                contendorDelaVentana, 2, 2, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.LAST_LINE_END, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.botonAceptar.setActionCommand("agregar_persona");
        ControlPersona controlador = new ControlPersona(this);
        this.botonAceptar.addActionListener(controlador);
        this.pack();
    }

    public void agregarComponenteConReglas(JComponent componente, Container contenedor, int fila, int columna, int numFilas, int numColumnas, int relleno, int anclado, float espaciadox, float especiadoy, int espacioX, int espacioY, int bordeSuperior, int bordeIzquierdo, int bordeInferior, int bordeDerecho) {
        GridBagConstraints reglas = new GridBagConstraints();
        reglas.gridy = columna;
        reglas.gridx = fila;
        reglas.gridwidth = numFilas;
        reglas.gridheight = numColumnas;
        reglas.fill = relleno; // NONE, VERTICAL, HORIZONTAL, BOTH
        reglas.anchor = anclado; // NORTH, NORTHEAST, EAST, SOUTHEAST, SOUTH,SOUTHWEST, WEST, NORTHWEST
        reglas.weightx = espaciadox;
        reglas.weighty = especiadoy;
        reglas.ipadx = espacioX;
        reglas.ipady = espacioY;
        reglas.insets = new Insets(bordeSuperior, bordeIzquierdo, bordeInferior, bordeDerecho);
        GridBagLayout diseñador = (GridBagLayout) contenedor.getLayout();
        diseñador.setConstraints(componente, reglas);
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
