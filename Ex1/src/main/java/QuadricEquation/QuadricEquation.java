package QuadricEquation;

import java.util.Scanner;

public class QuadricEquation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj trzy wspolczynniki a,b,c");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        scanner.close();
    Solver solver = new Solver(a,b,c);
    double[] result = solver.solve();
    if(result == null){

        System.out.println("BRAK rozwiazan");
        //System.out.println(result);
    }
    else for(double d: result){
        System.out.println("Rozwiazanie dla x= "+d);
    }
    }
}
