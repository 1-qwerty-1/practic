import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        int cons = 0;

        int[] arr = new int[10];
        for (int i=0; i<10; i++){
            if (scanner.hasNextInt()){
                cons = scanner.nextInt();
            }
            arr[i] = cons;
            sum += arr[i];
            cons = 0;
        }
        System.out.println(sum);
        int j = 0;
        while (j<10){
            sum += arr[j];
            j++;
        }
        System.out.println(sum);
        int k = 0;
        do{
            sum += arr[k];
            k++;
        }while (k<10);
        System.out.println(sum);
    }
}
