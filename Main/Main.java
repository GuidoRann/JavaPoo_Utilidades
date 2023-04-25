package Main;

import Entidades.*;
import Servicios.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in).useDelimiter("\n");
     
        // ------------------------ Ejercicio 1 -------------------------------------
        /*  
        CadenaServicio nc = new CadenaServicio();
        Cadena text = nc.crearCadena();
        int op = 0;
        
        do {
            System.out.println("Ingrese la opcion que desea realizar");
            System.out.println("""
                               1- Mostrar cantidad vocales.
                               2- Invertir frase.
                               3- Cuantas veces se encuentra tu letra.
                               4- Comparar longitud.
                               5- Unir frases.
                               6- Reemplazar letra A.
                               7- Contiene tu letra?.
                               8- Salir.
                               """);
            op = consola.nextInt();

            switch (op) {
                case 1:
                    nc.mostrarVocales(text);
                    System.out.println();
                    break;
                case 2:
                    nc.invertirFrase(text);
                    System.out.println();
                    break;
                case 3:
                    nc.vecesRepetido(text);
                    System.out.println();
                    break;
                case 4:
                    nc.compararLongitud(text);
                    System.out.println();
                    break;
                case 5:
                    nc.unidFrase(text);
                    System.out.println();
                    break;
                case 6:
                    nc.reemplazar(text);
                    System.out.println();
                    break;
                case 7:
                    if (nc.contiene(text)) {
                        System.out.println("La letra se encontró en la frase");
                    } else System.out.println("La letra NO se encontró en la frase");
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Hasta pronto...");
                    System.out.println();
                    break;
                default:
                    System.out.println("Opcion no encontrada");;
                    System.out.println();
            }
        } while (op != 8);
        */
       
        // ------------------------ Ejercicio 2 -------------------------------------
        /* 
        ParDeNumServicio ps = new ParDeNumServicio();
        ParDeNumeros ej = new ParDeNumeros();
        
        ps.mostrarValores(ej);
        System.out.println();
        ps.devolverMayor(ej);
        System.out.println();
        ps.calcularRaiz(ej);
        System.out.println();
        ps.calcularPotencia(ej);
        */
       
       // ------------------------ Ejercicio 3 -------------------------------------
       /*
       double [] a = new double [50];
       double [] b = new double [20];
       
       ArregloService as = new ArregloService();
        System.out.println("Inicio A");
       as.inicializarA(a);
        System.out.println("Mostra A");
       as.mostrar(a);
        System.out.println("Ordenar A");
       as.ordenar(a);
        System.out.println("Inicializando B");
       as.inicializarB(a, b);
        System.out.println("Mostrando B");
       as.mostrar(a);
       as.mostrar(b);
       */
       
       // ------------------------ Ejercicio 4 -------------------------------------
       
       
    }

}