import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation pt1 = new QuadraticEquation();
        pt1.setA(1);
        pt1.setB(2);
        pt1.setC(3);
        System.out.println(pt1.disPlay());
        if (pt1.getDiscriminant() > 0) {
            System.out.println("Nghiệm 1: " + pt1.getRoot1());
            System.out.println("Nghiệm 2: " + pt1.getRoot2());
        } else if ( pt1.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        } else {
            System.out.println("Nghiệm chung: " + pt1.getRoot1());
        }
    }
}
