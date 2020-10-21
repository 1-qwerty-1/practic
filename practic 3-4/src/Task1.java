import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");
        c1.setRadius(scanner.nextDouble());
        System.out.println(c1);
        System.out.println("Enter square: ");
        c2.setSquare(scanner.nextDouble());
        System.out.println(c2);
    }
}