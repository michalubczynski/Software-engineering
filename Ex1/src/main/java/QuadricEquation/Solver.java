package QuadricEquation;

import java.util.Scanner;

public class Solver {
    public Solver(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    double a,b,c;
    public double[] solve() {

        double[] results = null;
        double delta = delta(a,b,c);
        if(delta>0){
            results = new double [] {(-b - Math.sqrt(delta)) / (2*a),(-b + Math.sqrt(delta)) / (2*a)};
        }
        else if ( delta ==0){ results = new double [] {-b/(2*a)};}
    return results;
    }

    private double delta(double a, double b, double c) {return b*b -4 *a *c;   }
}
