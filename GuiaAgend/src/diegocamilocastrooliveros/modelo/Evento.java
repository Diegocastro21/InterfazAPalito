/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegocamilocastrooliveros.modelo;

import java.awt.image.BufferedImage;
import java.util.Date;


public class Evento {
    //propiedades
    private String id;
    private String nombre;
    private Date fechaDeRegistro;
    private Date fechaDeInicio;
    private Date fechaDeFin;
    private String tipo;
    private String categoria;
    private String lugar;
    private Persona contacto;
    private BufferedImage imagenes[] = new BufferedImage[12];

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

    public Date getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    public void setFechaDeRegistro(Date fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public Date getFechaDeFin() {
        return fechaDeFin;
    }

    public void setFechaDeFin(Date fechaDeFin) {
        this.fechaDeFin = fechaDeFin;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Persona getContacto() {
        return contacto;
    }

    public void setContacto(Persona contacto) {
        this.contacto = contacto;
    }

    public BufferedImage[] getImagenes() {
        return imagenes;
    }

    public void setImagenes(BufferedImage[] imagenes) {
        this.imagenes = imagenes;
    }

    @Override
    public String toString() {
        return "Evento{" + "id=" + id + ", nombre=" + nombre + ", fechaDeRegistro=" + fechaDeRegistro + ", fechaDeInicio=" + fechaDeInicio + ", fechaDeFin=" + fechaDeFin + ", tipo=" + tipo + ", categoria=" + categoria + ", lugar=" + lugar + ", contacto=" + contacto + ", imagenes=" + imagenes + '}';
    }
    
    
}
