package logica;

public class Consorcios {
    private String nombre;
    private String radio;
    private String companyProductora;

    public Consorcios(String nombre, String radio, String companyProductora) {
        this.nombre = nombre;
        this.radio = radio;
        this.companyProductora = companyProductora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getCompanyProductora() {
        return companyProductora;
    }

    public void setCompanyProductora(String companyProductora) {
        this.companyProductora = companyProductora;
    }

    @Override
    public String toString() {
        return "Consorcios{" +
                "nombre='" + nombre + '\'' +
                ", radio='" + radio + '\'' +
                ", companyProductora='" + companyProductora + '\'' +
                '}';
    }
}
