package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    Scanner consola = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre");
        String nombre = consola.next();
        
        System.out.println("Ingrese la fecha de nacimiento");
        System.out.print("Ingrese el dia >> ");
        int dia = consola.nextInt();
        System.out.print("Ingrese el mes >> ");
        int mes = consola.nextInt();
        System.out.print("Ingrese el año >> ");
        int anio = consola.nextInt();
        Date fechaNacimiento = new Date(anio - 1900, mes, dia);
        
        return new Persona(nombre, fechaNacimiento);
    }
    
    public void calcularEdad(Persona per) {
        Date actual = new Date();
        int dif = actual.getYear() - per.getFechaNacimiento().getYear();
        System.out.printf("Usted tiene %d años \n", dif);
    }
    
    public void menorQue(Persona per) {
        System.out.println("Ingrese la edad");
        int edad = consola.nextInt();
        
        Date actual = new Date();
        
        if ((actual.getYear() - per.getFechaNacimiento().getYear()) < edad) {
            System.out.println("Es menor a la edad ingresas");
        } else System.out.println("Es mayor que la edad ingresada");
    }
    
    public void mostrarPersona(Persona per) {        
        System.out.println("El nombre de la persona es: " + per.getNombre());
        System.out.printf("La fecha de nacimiento es: %d/%d/%d ", per.getFechaNacimiento().getDay(), per.getFechaNacimiento().getMonth(), per.getFechaNacimiento().getYear());
    }
        
}
