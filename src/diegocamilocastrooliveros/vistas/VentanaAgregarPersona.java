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
    
    public VentanaAgregarPersona(VentanaPrincipal ventanaPrincipal) {
        super(ventanaPrincipal);
        this.configurar();
    }
    
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }
    
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
        Font tipoDeLetra = new Font("Arial", Font.PLAIN, 20);
        this.etiquetaTitulo.setFont(tipoDeLetra);
        this.etiquetaTitulo.setForeground(Color.BLUE);
        this.etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        this.contenedorDeCampos = new JPanel();
        this.contenedorDeCampos.setBorder(new TitledBorder("Datos de la nueva Persona:"));
        Dimension tamañoDeLosCompos = new Dimension(20, 80);
// creamos el objeto para la etiqueta de texto del campo id
        this.etiquetaId = new JLabel("Id:");
        this.etiquetaId.setFont(new Font("Candara", Font.BOLD, 14));// tipo
        this.etiquetaId.setForeground(Color.BLACK);
        this.etiquetaId.setHorizontalAlignment(SwingConstants.RIGHT); //
// crear y configurar un objeto Campo de Texto para ingresar el id de
        this.campoId = new JTextField();
        this.campoId.setFont(new Font("Calibri", 0, 14));
        this.campoId.setForeground(Color.BLACK);
        this.campoId.setHorizontalAlignment(SwingConstants.CENTER);
//this.campoId.setPreferredSize(tamañoDeLosCompos);
// creamos el objeto para la etiqueta de texto del campo nombre
        this.etiquetaNombre = new JLabel("Nombre:");
        this.etiquetaNombre.setFont(new Font("Candara", Font.BOLD, 14));//
        this.etiquetaNombre.setForeground(Color.BLACK);
        this.etiquetaNombre.setHorizontalAlignment(SwingConstants.RIGHT); //
// crear y configurar un objeto Campo de Texto para ingresar el
        this.campoNombre = new JTextField();
        this.campoNombre.setFont(new Font("Calibri", 0, 14));
        this.campoNombre.setForeground(Color.BLACK);
        this.campoNombre.setHorizontalAlignment(SwingConstants.CENTER);
//this.campoNombre.setPreferredSize(tamañoDeLosCompos);
// creamos el objeto para la etiqueta de texto del campo Apellido
        this.etiquetaApellido = new JLabel("Apellido:");
        this.etiquetaApellido.setFont(new Font("Candara", Font.BOLD, 14));//
        this.etiquetaApellido.setForeground(Color.BLACK);
        this.etiquetaApellido.setHorizontalAlignment(SwingConstants.RIGHT);
// justificado a la deracha
// crear y configurar un objeto Campo de Texto para ingresar el
        this.campoApellido = new JTextField();
        this.campoApellido.setFont(new Font("Calibri", 0, 14));
        this.campoApellido.setForeground(Color.BLACK);
        this.campoApellido.setHorizontalAlignment(SwingConstants.CENTER);
//this.campoApellido.setPreferredSize(tamañoDeLosCompos);
// creamos el objeto para la etiqueta de texto del campo Fecha
        this.etiquetaFechaDeNacimiento = new JLabel("Nacimiento:");
        this.etiquetaFechaDeNacimiento.setFont(new Font("Candara", Font.BOLD,
                14));// tipo de letra Candara, Negrita 1, tamaño 12
        this.etiquetaFechaDeNacimiento.setForeground(Color.BLACK);
        this.etiquetaFechaDeNacimiento.setHorizontalAlignment(SwingConstants.RIGHT);
// justificado a la deracha
// crear y configurar un objeto Campo de Texto para ingresar el La
        this.campoFechaDeNacimiento = new JFormattedTextField();
        this.campoFechaDeNacimiento.setFont(new Font("Calibri", 0, 14));
        this.campoFechaDeNacimiento.setForeground(Color.BLACK);
        this.campoFechaDeNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
// this.campoFechaDeNacimiento.setPreferredSize(tamañoDeLosCompos);
// creamos el objeto para la etiqueta de texto del campo Fecha Genero
        this.etiquetaGenero = new JLabel("Genero:");
        this.etiquetaGenero.setFont(new Font("Candara", Font.BOLD, 14));//
        this.etiquetaGenero.setForeground(Color.BLACK);
        this.etiquetaGenero.setHorizontalAlignment(SwingConstants.RIGHT); //
// crear y configurar un objeto COMBO para Seleccionar el Genero de
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
        this.etiquetaTelefono.setFont(new Font("Candara", Font.BOLD, 14));//
        this.etiquetaTelefono.setForeground(Color.BLACK);
        this.etiquetaTelefono.setHorizontalAlignment(SwingConstants.RIGHT);
// justificado a la deracha
// crear y configurar un objeto Campo de Texto para ingresar el
        this.campoTelefono = new JTextField();
        this.campoTelefono.setFont(new Font("Calibri", 0, 14));
        this.campoTelefono.setForeground(Color.BLACK);
        this.campoTelefono.setHorizontalAlignment(SwingConstants.CENTER);
// this.campoTelefono.setPreferredSize(tamañoDeLosCompos);
// creamos el objeto para la etiqueta de texto del campo Email
        this.etiquetaEmail = new JLabel("Email:");
        this.etiquetaEmail.setFont(new Font("Candara", Font.BOLD, 14));//
        this.etiquetaEmail.setForeground(Color.BLACK);
        this.etiquetaEmail.setHorizontalAlignment(SwingConstants.RIGHT); //
// crear y configurar un objeto Campo de Texto para ingresar el Amail
        this.campoEmail = new JTextField();
        this.campoEmail.setFont(new Font("Calibri", 0, 14));
        this.campoEmail.setForeground(Color.BLACK);
        this.campoEmail.setHorizontalAlignment(SwingConstants.CENTER);
//this.campoEmail.setPreferredSize(tamañoDeLosCompos);
// creamos el objeto para la etiqueta de texto del campo Direccion
        this.etiquetaDireccion = new JLabel("Direccion:");
        this.etiquetaDireccion.setFont(new Font("Candara", Font.BOLD, 14));//
        this.etiquetaDireccion.setForeground(Color.BLACK);
        this.etiquetaDireccion.setHorizontalAlignment(SwingConstants.RIGHT);
// justificado a la deracha
// crear y configurar un objeto la Caja de Texto para ingresar La
        this.cajaDireccion = new JTextArea(3, 15);
        this.cajaDireccion.setFont(new Font("Calibri", 0, 14));
        this.cajaDireccion.setForeground(Color.BLACK);
        this.contenedorAreaDesplazamiento = new JScrollPane(this.cajaDireccion);
        //this.panelDireccion.setPreferredSize(this.cajaDireccion.getPreferredSize())
        ;
// crear el panel de la foro
        this.contenedorParaLaFoto = new JPanel();
        this.contenedorParaLaFoto.setBorder(new TitledBorder(""));
        this.contenedorParaLaFoto.setPreferredSize(new Dimension(70, 70));
// crear los botones
        this.botonAceptar = new JButton("Aceptar");
        this.botonAceptar.setPreferredSize(new Dimension(15, 20));
        this.botonCancelar = new JButton("Cancelar");
        this.botonCancelar.setPreferredSize(new Dimension(15, 20));
// agregar la etiqueta al panelDeContenidos
        this.agregarComponenteConReglas(this.etiquetaTitulo,
                contendorDelaVentana, 0, 0, 3, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.FIRST_LINE_START, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
// AGREGAR LOS COMPONENTES AL PANEL DE DATOS
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
// agregar el apenel de datos al panel de contenidos
        this.agregarComponenteConReglas(this.contenedorDeCampos,
                contendorDelaVentana, 0, 1, 1, 2, GridBagConstraints.BOTH,
                GridBagConstraints.FIRST_LINE_START, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
// colocar el panel de la foto
        this.agregarComponenteConReglas(this.contenedorParaLaFoto,
                contendorDelaVentana, 1, 1, 2, 1, GridBagConstraints.NONE,
                GridBagConstraints.CENTER, 0.5f, 0.5f, 100, 100, 5, 5, 5, 5);
//agregar los botones
        this.agregarComponenteConReglas(this.botonAceptar,
                contendorDelaVentana, 1, 2, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.LAST_LINE_END, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
        this.agregarComponenteConReglas(this.botonCancelar,
                contendorDelaVentana, 2, 2, 1, 1, GridBagConstraints.HORIZONTAL,
                GridBagConstraints.LAST_LINE_END, 0.5f, 0.5f, 0, 0, 5, 5, 5, 5);
// agregar un comando accion en el boton aceptar
        this.botonAceptar.setActionCommand("agregar_persona");
// creamos un objeto ControladorPersona
        ControlPersona controlador = new ControlPersona(this);
// agregamos el contraldor al botonAceptar para que maneje la accion agregar_persoa
        this.botonAceptar.addActionListener(controlador);
        this.pack();
    }
    
    public void agregarComponenteConReglas(JComponent componente, Container contenedor, int fila, int columna, int numFilas, int numColumnas, int relleno, int anclado, float espaciadox, float especiadoy, int espacioX, int espacioY, int bordeSuperior, int bordeIzquierdo, int bordeInferior, int bordeDerecho) {
        GridBagConstraints reglas = new GridBagConstraints();
        reglas.gridy = columna;
        reglas.gridx = fila;
        reglas.gridwidth = numFilas;
        reglas.gridheight = numColumnas;
        reglas.fill = relleno; 
        reglas.anchor = anclado; 
        reglas.weightx = espaciadox;
        reglas.weighty = especiadoy;
        reglas.ipadx = espacioX;
        reglas.ipady = espacioY;
        reglas.insets = new Insets(bordeSuperior, bordeIzquierdo, bordeInferior, bordeDerecho);
        GridBagLayout diseñador = (GridBagLayout) contenedor.getLayout();
        diseñador.setConstraints(componente, reglas);
        contenedor.add(componente);
    }

    public VentanaPrincipal getVentanaPrincipal() {
        return ventanaPrincipal;
    }


    public JPanel getContenedorDeCampos() {
        return contenedorDeCampos;
    }

    public JPanel getContenedorParaLaFoto() {
        return contenedorParaLaFoto;
    }

    public JLabel getEtiquetaTitulo() {
        return etiquetaTitulo;
    }

    public JLabel getEtiquetaId() {
        return etiquetaId;
    }

    public JTextField getCampoId() {
        return campoId;
    }

    public JLabel getEtiquetaNombre() {
        return etiquetaNombre;
    }

    public JTextField getCampoNombre() {
        return campoNombre;
    }

    public JLabel getEtiquetaApellido() {
        return etiquetaApellido;
    }

    public JTextField getCampoApellido() {
        return campoApellido;
    }

    public JLabel getEtiquetaFechaDeNacimiento() {
        return etiquetaFechaDeNacimiento;
    }

    public JFormattedTextField getCampoFechaDeNacimiento() {
        return campoFechaDeNacimiento;
    }

    public JLabel getEtiquetaGenero() {
        return etiquetaGenero;
    }

    public JComboBox getComboGenero() {
        return comboGenero;
    }

    public JLabel getEtiquetaTelefono() {
        return etiquetaTelefono;
    }

    public JTextField getCampoTelefono() {
        return campoTelefono;
    }

    public JLabel getEtiquetaEmail() {
        return etiquetaEmail;
    }

    public JTextField getCampoEmail() {
        return campoEmail;
    }

    public JLabel getEtiquetaDireccion() {
        return etiquetaDireccion;
    }

    public JScrollPane getContenedorAreaDesplazamiento() {
        return contenedorAreaDesplazamiento;
    }

    public JTextArea getCajaDireccion() {
        return cajaDireccion;
    }

    public JButton getBotonAceptar() {
        return botonAceptar;
    }

    public JButton getBotonCancelar() {
        return botonCancelar;
    }
    
    
}
