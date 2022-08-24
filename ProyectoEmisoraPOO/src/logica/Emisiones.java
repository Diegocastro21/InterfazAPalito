package logica;
public class Emisiones  {

    private String fecha ;
    private String horaInicio;
    private String duracion;
    private boolean repeticion;


    public Emisiones(String fecha, String horaInicio, String duracion, boolean repeticion) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.duracion = duracion;
        this.repeticion = repeticion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public boolean isRepeticion() {
        return repeticion;
    }

    public void setRepeticion(boolean repeticion) {
        this.repeticion = repeticion;
    }

    @Override
    public String toString() {
        return "Emisiones{" +
                "fecha=" + fecha +
                ", horaInicio=" + horaInicio +
                ", duracion='" + duracion + '\'' +
                ", repeticion=" + repeticion +
                '}';
    }
}
