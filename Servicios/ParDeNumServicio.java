 package Servicios;

import Entidades.ParDeNumeros;

public class ParDeNumServicio {
    
    public void mostrarValores(ParDeNumeros par){
        System.out.printf("El primer numero es: %f, y el segundo numero es: %f", par.getN1(), par.getN2());
        System.out.println();
    }
    
    public void devolverMayor(ParDeNumeros par){
        if(par.getN1() > par.getN2()){
            System.out.println("El numero mas grande es el primero");
        } else System.out.println("El numero mas grande es el segundo");
    }
    
    public void calcularPotencia(ParDeNumeros par){
        int n1 = (int) Math.round(par.getN1());
        int n2 = (int) Math.round(par.getN2());
        double res;
        
        double max = Math.max(n1, n2);
        double min = Math.min(n1, n2);
        
        res = Math.pow(max, min);
        
        System.out.println("El resultado de la potencia es: " + res);
    }
    
    public void calcularRaiz(ParDeNumeros par){
        double abs1 = Math.abs(par.getN1());
        double abs2 = Math.abs(par.getN2());
        double res;
        
        double min = Math.min(abs1, abs2);
        
        res = Math.sqrt(min);
        
        System.out.println("La raiz cuadrada del menor numero es: " + res);
    }
}
