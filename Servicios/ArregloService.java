package Servicios;

import java.util.Arrays;

public class ArregloService {

    public void inicializarA(double[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 50 + 1);
        }
    }

    public void mostrar(double[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void ordenar(double[] a) {
        Arrays.sort(a);
        double[] numerosDouble = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            numerosDouble[i] = a[a.length -1 -i];
        }
        System.out.println(Arrays.toString(numerosDouble));
    }
    
    public void inicializarB(double[] a, double[] b){
        System.arraycopy(a, 0, b, 0, 10);
        Arrays.fill(b, 10, 20, 0.5);
    }
}
