package principal;

import logica.*;
import java.util.Date;
public class ClasePrincipal {
    public static void main(String[] args) {

        //consorcios
        Consorcios consorcios1 = new Consorcios("Republicano", "El dormio", "Tropicana");
        Consorcios consorcios2 = new Consorcios("La reina", "Sol", "DC mar");
        System.out.println(consorcios1 +"\n"+ consorcios2);
        //companiesProductoras
        CompaniesProductoras co1 = new CompaniesProductoras("Tropicana", "345", "57575757575");
        CompaniesProductoras co2 = new CompaniesProductoras("La Reina", "102", "31212312");
        CompaniesProductoras co3 = new CompaniesProductoras("Policia Nacional", "789", "35553");


        /*
        * No se permite el mismo nombre asi que al momemento de agregar un nombre
        * igual para las compaines productoras este lanzara una excepcion
        * CompaniesProductoras co4 = new CompaniesProductoras("Tropicana", "102", "31212312");
        * */
        Emisiones emi1 = new Emisiones("10 de mayo", "10:10 pm", "5 Horas", false);
        Emisiones emi2 = new Emisiones("12 de mayo", "12:30 pm", "2 Horas", true);

        System.out.println(co1 +"\n"+ co2 +"\n"+ co3);
        //radios con emisiones
        Radios ra1 = new Radios("Sin Tapujos", "12", TipoTransmision.AM
                , emi2);
        Radios ra2 = new Radios("Terror House", "56.6", TipoTransmision.FM
                , emi1);
        System.out.println(ra1 +"\n"+ ra2 );
        //trabajadores
        Trabajadores ta1 = new Trabajadores("Jancho buenavista", "1234313", TipoTrabajador.CONDUCTOR);
        Trabajadores ta2 = new Trabajadores("Mencho duraz", "1234313", TipoTrabajador.OPERADOR);
        Trabajadores ta3 = new Trabajadores("alvarado de la asuncion", "1234313", TipoTrabajador.PRODUCTOR);
        System.out.println(ta1 +"\n"+ ta2 +"\n"+ ta3);
        //Programa
        Programas pro1 = new Programas("Fuente", GeneroRadial.CULTURAL, ta1, ta3, ta2);
        System.out.println(pro1);






    }
}
