import java.util.Scanner;

public class DogBook {
    public static void main(String[] args) {

//        Book book1 = new Book();
//        book1.author = "Dostoevskiy F.M.";
//        book1.name = "Crime and Punishment";
//        book1.year = 1866;
//        book1.page = 672;
//        System.out.println(book1);

        Scanner scanner = new Scanner(System.in);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog[] arr =  {dog1, dog2, dog3};
        for (int i=0; i<3; i++){
            System.out.println("Enter parameters:");
            arr[i].setName(scanner.nextLine());
            arr[i].setRace(scanner.nextLine());
            arr[i].setAge(scanner.nextInt());
            System.out.println(arr[i]);
            scanner.nextLine();
        }
        System.out.println(dog1.change());
    }
}
