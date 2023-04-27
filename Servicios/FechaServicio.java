package Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaServicio {
    
    public Date fechaNacimiento(){
        Scanner consola = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el dia");
        int dia = consola.nextInt();
        System.out.println("Ingrese el mes");
        int mes = consola.nextInt();
        System.out.println("Ingrese el año");
        int anio = consola.nextInt();
        
        return new Date(anio -1900, mes -1, dia);
    }
    
    public Date fechaActual(){
        return new Date();
    }
    
    public void diferencia(Date nacimiento, Date actual){
        int dif = nacimiento.getYear() - actual.getYear();
        
        System.out.printf("Hay %d años de diferencia", - dif);
    }
}
