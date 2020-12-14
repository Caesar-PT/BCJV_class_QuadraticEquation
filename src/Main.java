import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập vào b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập vào c: ");
        double c = scanner.nextDouble();

        QuadraticEquation pt1 = new QuadraticEquation(a, b, c);
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
