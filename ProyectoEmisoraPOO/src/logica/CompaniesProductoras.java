package logica;
import java.util.Set;
import java.util.HashSet;
public class CompaniesProductoras {
    private static Set<String> nombres = new HashSet<>();
    private String nombre = "";
    private String numeroRFC;
    private String telefono;


    public CompaniesProductoras(String nombre, String numeroRFC, String telefono ) {

        //Esta seria la validacion de nombre unico
        //validarNombreUnico(nombre);
        this.setNombre(nombre);
        this.numeroRFC = numeroRFC;
        this.telefono = telefono;
    }
    public void setNombre(String nombre) {
        if (nombres.contains(nombre)) {
            throw new IllegalArgumentException( "NO SE PERMITEN NOMBRES IGUALES EN LAS COMPANIES PRODUCTORAS" );
        }
        nombres.add(nombre);
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }



    public String getNumeroRFC() {
        return numeroRFC;
    }

    public void setNumeroRFC(String numeroRFC) {
        this.numeroRFC = numeroRFC;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "CompaniesProductoras{" +
                "nombre='" + nombre + '\'' +
                ", numeroRFC='" + numeroRFC + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
