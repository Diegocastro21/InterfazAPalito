package logica;

public class Trabajadores {
    private String nombre;
    private String cedula;
    private TipoTrabajador tipotrabajador;

    public Trabajadores(String nombre, String cedula, TipoTrabajador tipotrabajador) {
        this.nombre = nombre;
        this.cedula = cedula;
        //validarTrabajoUnico(tipotrabajador);
        this.tipotrabajador = tipotrabajador;

    }

    public boolean validarTrabajoUnico(TipoTrabajador tipotrabajo){
        if (this.tipotrabajador.equals(tipotrabajo)) {
            System.out.println("E R R O R \n NO SE PERMITEN TRABAJOS DIFERENTES");
            System.out.println(nombre);
            return false;
        } else {
            return true;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public TipoTrabajador getTipotrabajador() {
        return tipotrabajador;
    }

    public void setTipotrabajador(TipoTrabajador tipotrabajador) {
        this.tipotrabajador = tipotrabajador;
    }

    @Override
    public String toString() {
        return "Trabajadores{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", tipotrabajador=" + tipotrabajador +
                '}';
    }
}
