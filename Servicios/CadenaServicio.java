package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    Scanner consola = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {
        System.out.println("Ingrese la frase");
        String frase = consola.next();

        return new Cadena(frase);
    }

    public void mostrarVocales(Cadena text) {
        int vocal = 0;
        for (int i = 0; i < text.getLongitud(); i++) {
           String letra = text.getFrase().substring(i, i+1);
            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
                vocal++;
            }
        }
        System.out.printf("La frase tiene %d vocales", vocal);
    }

    public void invertirFrase(Cadena text) {
        for (int i = text.getLongitud(); i > 0; i--) {
            String letra = text.getFrase().substring(i - 1, i);
            System.out.print(letra);
        }
        System.out.println();
    }

    public void vecesRepetido(Cadena text) {
        System.out.println("Ingresa el caracter a buscar");
        char letra = consola.next().charAt(0);
        int cont = 0;

        for (int i = 0; i < text.getLongitud(); i++) {
            if (text.getFrase().charAt(i) == letra) {
                cont++;
            }
        }
        System.out.printf("La letra %s se cuentran %d veces en la frase", letra, cont);
    }
    
    
    public void compararLongitud(Cadena text){
        int longi = text.getLongitud();
        System.out.println("Ingrese una nueva frase para comparar");
        String frase = consola.next();
        
        if (frase.length() > longi) {
            System.out.println("La frase ingresada es MAYOR a la frase guardada anteriormente");
        } else System.out.println("La frase ingresada es MENOR a la frase guardada anteriormente");
    }
    
    
    public void unidFrase(Cadena text){
        System.out.println("Ingrese un nueva frase para unir con la anterior");
        String nueva = consola.next();
        
        System.out.println(text.getFrase() + " " + nueva);
    }
    
    
    public void reemplazar(Cadena text){
        System.out.println("Ingrese un caracter para colocar en lugar de la letra A");
        String carac = consola.next();
        
        String nueva = text.getFrase().replaceAll("a", carac);
        System.out.println(nueva);
    }
    
    public boolean contiene(Cadena text){
        System.out.println("Ingresa una letra a busar");
        String letra = consola.next();
        
        return text.getFrase().contains(letra);
    }
}
