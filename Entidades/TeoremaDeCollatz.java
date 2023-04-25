package Entidades;

public class TeoremaDeCollatz {
    
    public static void main(String[] args) {
        int num = 2;
        do {
            int cont = 0;
            int i = num;
            System.out.println("i = " + i);
            do {
                if (i % 2 == 0) {
                    i = i/2;
                } else i = i*3+1;
              cont++;  
              System.out.println("cont = " + cont);
            } while (i != 1);
            
            num++;
            
        } while (true);
    }
    
}
