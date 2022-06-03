/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegocamilocastrooliveros.modelo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Properties;

/**
 *
 * @author SALA DESARROLLO 1
 */
public class Persona {
    
    private String id;
    private String nombre;
    private String apellido;
    private String genero = "Masculino";
    private Date fechaNacimiento;
    private String email;
    private String telefono;
    private String direccion;
    private BufferedImage foto;
    private String password;
    
    
    public String devolverDatos(){
        GregorianCalendar calendario = new GregorianCalendar();
        
        calendario.setTime(getFechaNacimiento());
        int year = calendario.get(calendario.YEAR);
        int mes = calendario.get(calendario.MONTH);
        int dia = calendario.get(calendario.DAY_OF_MONTH);
        
        String fechaNac = dia + "/" + mes + "/" + year;
        
        String datos = "-------------------------------\n";
        datos = datos + "ID: " + this.getId() + "\n";
        datos = datos + "Nombre: " + this.getNombre() + "\n";
        datos = datos + "Apellido: " + this.getApellido() + "\n";
        datos += "Fecha de Nacimiento: "+ fechaNac+ "\n";
        datos += "Genero: "+ this.getGenero()+ "\n";
        datos += "Email: "+ this.getEmail()+ "\n";
        datos += "Telefono: "+ this.getTelefono()+ "\n";
        datos += "Direccion: "+ this.getDireccion()+ "\n";
        
        return datos;
        
    }
    
    public void guardarEnDisco() throws Exception {
        String nombreArchivo = "Personas.dat";
        Properties propiedadesSistema = System.getProperties();
        String directorioUsuario = propiedadesSistema.getProperty("user.home");
        directorioUsuario = directorioUsuario + File.separator + "agendajava_dat";
        File carpetaDatos = new File(directorioUsuario);
        if (carpetaDatos.exists() == false) {
            carpetaDatos.mkdir();
        }
        File archivoDatosPersona = new File(carpetaDatos, nombreArchivo);
        FileInputStream lectorDeArchivo = null;
        HashMap<String, Persona> lista = null;
        try {
            if (archivoDatosPersona.exists() == true) {
                lectorDeArchivo = new FileInputStream(archivoDatosPersona);
                ObjectInputStream lectorDeObjetos = new ObjectInputStream(lectorDeArchivo);
                lista = (HashMap<String, Persona>) lectorDeObjetos.readObject();
                lectorDeObjetos.close();
                lectorDeArchivo.close();
            }

        } catch (ClassNotFoundException error) {
            throw new Exception("Error al guardar la persona\n " + "No se puede ubicar a una de las clases del programa\n" + "Detalles: " + error.getMessage());

        } catch (IOException error) {
            throw new Exception("Error al guardar la persona\n " + "No se puede leer del archivo la lista " + "de personas existentes" + "Detalles: " + error.getMessage());
        }
        if (lista == null) {
            lista = new HashMap<String, Persona>();
            lista.put(this.id, this);
        } else if (lista.isEmpty() == true || lista.containsKey(this.id) == false) {

            lista.put(this.id, this);
        } else {
            throw new Exception("La Persona con Id " + this.id + " ya fue registrada en la agenda");
        }
        try {
            FileOutputStream escritorDeArchivo = new FileOutputStream(archivoDatosPersona);
            ObjectOutputStream escritorDeObjetos = new ObjectOutputStream(escritorDeArchivo);
            escritorDeObjetos.writeObject(lista);
            escritorDeObjetos.close();
            escritorDeArchivo.close();
        } catch (IOException error) {
            throw new Exception("Error al guardar la persona\n " + "No se puede escribir la iformacion en el archivo de datos\n" + "Detalles: " + error.getMessage());
        }
    }

    public static Persona BuscarPersona(String id) throws Exception {

        Persona personaEncontrada = null;
        String nombreArchivo = "Personas.dat";
        Properties propiedadesSistema = System.getProperties();
        String directorioUsuario = propiedadesSistema.getProperty("user.home");
        directorioUsuario = directorioUsuario + File.separator + "agendajava_dat";
        File carpetaDatos = new File(directorioUsuario);
        if (carpetaDatos.exists() == false) {
            throw new Exception("la persona " + id + "no se encuentra en la agenda");
        } else {
            File archivoDatosPersona = new File(carpetaDatos, nombreArchivo);
            FileInputStream lectorDeArchivo = null;
            HashMap<String, Persona> lista = null;
            if (archivoDatosPersona.exists() == true) {
                throw new Exception("la persona " + id + " no se encuentra en la agenda");
            } else {
                try {
                    lectorDeArchivo = new FileInputStream(archivoDatosPersona);
                    ObjectInputStream lectorDeObjetos = new ObjectInputStream(lectorDeArchivo);
                    lista = (HashMap<String, Persona>) lectorDeObjetos.readObject();
                    lectorDeObjetos.close();
                    lectorDeArchivo.close();
                } catch (ClassNotFoundException error) {
                    throw new Exception("Error al guardar la persona\n " + "No se puede ubicar a una de las clases del programa\n" + "Detalles: " + error.getMessage());
                } catch (IOException error) {
                    throw new Exception("Error al guardar la persona\n " + "No se puede leer del archivo la lista " + "de personas existentes" + "Detalles: " + error.getMessage());
                }
                if (lista == null) {
                    throw new Exception("la persona " + id + " no se encuentra en la agenda");
                } else if (lista.isEmpty() == true || lista.containsKey(id) == false) {
                    throw new Exception("la persona " + id + " no se encuentra en la agenda");
                } else {
                    personaEncontrada = lista.get(id);
                }
            }

        }
        return personaEncontrada;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public BufferedImage getFoto() {
        return foto;
    }

    public void setFoto(BufferedImage foto) {
        this.foto = foto;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + "\n, nombre=" + nombre + "\n, apellido=" + apellido + "\n, genero=" + genero + "\n, fechaNacimiento=" + fechaNacimiento + "\n, email=" + email + "\n, telefono=" + telefono + "\n, direccion=" + direccion + "\n, foto=" + foto + "\n, password=" + password + '}';
    }
    
}
