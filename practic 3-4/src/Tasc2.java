import java.util.Scanner;

public class Tasc2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Human man = new Human();

        System.out.println("Enter parameters: ");


        man.getHair().setColor(scanner.nextLine());
        man.getHair().setLength(scanner.nextInt());
        scanner.nextLine();
        man.getEye().setColor(scanner.nextLine());
        man.setHight(scanner.nextInt());
        man.setWeight(scanner.nextInt());

        System.out.println(man);
    }
}