package Entidades;


public class ParDeNumeros {
    private double n1;
    private double n2;

    public ParDeNumeros() {
        this.n1 = (int) (Math.random() * 25 + 1);
        this.n2 = (int) (Math.random() * 25 + 1);
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    
}
