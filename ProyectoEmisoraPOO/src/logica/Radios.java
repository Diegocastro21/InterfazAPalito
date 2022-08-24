package logica;

import java.util.ArrayList;
import java.util.List;

public class Radios {
    private String nombre;
    private String frecuenciaTransmision;
    private TipoTransmision tipoTransmision;
    private List<Emisiones> emisiones;

    public Radios(String nombre, String frecuenciaTransmision, TipoTransmision tipoTransmision, Emisiones emisiones) {
        this.emisiones = new ArrayList<>();
        this.nombre = nombre;
        this.frecuenciaTransmision = frecuenciaTransmision;
        this.tipoTransmision = tipoTransmision;
        this.emisiones.add(emisiones);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFrecuenciaTransmision() {
        return frecuenciaTransmision;
    }

    public void setFrecuenciaTransmision(String frecuenciaTransmision) {
        this.frecuenciaTransmision = frecuenciaTransmision;
    }

    public TipoTransmision getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(TipoTransmision tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public List<Emisiones> getEmisiones() {
        return emisiones;
    }

    public void setEmisiones(List<Emisiones> emisiones) {
        this.emisiones = emisiones;
    }

    @Override
    public String toString() {
        return "Radios{" +
                "nombre='" + nombre + '\'' +
                ", frecuenciaTransmision='" + frecuenciaTransmision + '\'' +
                ", tipoTransmision=" + tipoTransmision +
                ",\n Emision =" + this.emisiones +
                '}';
    }
}
