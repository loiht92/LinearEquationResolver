import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a :");
        double a = scanner.nextDouble();

        System.out.println("b :");
        double b = scanner.nextDouble();

        System.out.println("c :");
        double c = scanner.nextDouble();

        if (a != 0 && b == 0) {
            double equation = -b / a;
            System.out.println("Nghiem cua phuong trinh la : " + equation);
        } else {
            if (a==0 && b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}
