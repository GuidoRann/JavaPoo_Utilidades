package Entidades;

import java.util.Scanner;

public class MesSecreto {
    
//    private String[] meses = new String[12];
    String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String mesSecreto = meses[3];
    
    
    public void jugar(){
        Scanner consola = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Adivine el mes secreto");
        String mes = consola.next();
        
        while (!mes.equalsIgnoreCase(this.mesSecreto)) {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            mes = consola.next();
        }
        
        boolean r = mes.equalsIgnoreCase(this.mesSecreto);
        
        if (r) {
            System.out.println("¡Ha acertado!");
        }else System.out.println("Has perdido");
    }
    
}
