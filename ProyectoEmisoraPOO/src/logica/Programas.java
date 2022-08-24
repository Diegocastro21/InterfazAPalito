package logica;



public class Programas {
    private String nombre;
    private GeneroRadial genero;
    private Trabajadores conductores;
    private Trabajadores operadores;
    private Trabajadores productores;



    public Programas(String nombre, GeneroRadial genero, Trabajadores conductores, Trabajadores operadores, Trabajadores productores) {
        this.nombre = nombre;
        this.genero = genero;
        this.conductores = conductores;
        this.operadores = operadores;
        this.productores = productores;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GeneroRadial getGenero() {
        return genero;
    }

    public void setGenero(GeneroRadial genero) {
        this.genero = genero;
    }


    @Override
    public String toString() {
        return "Programas{" +
                "nombre='" + nombre + '\'' +
                ", genero=" + genero +
                ", conductores=" + conductores +
                ", operadores=" + operadores +
                ", productores=" + productores +
                '}';
    }
}
