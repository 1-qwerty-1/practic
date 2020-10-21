import java.util.Arrays;

public class Rand {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int tmp = 0;
        boolean iter = true;

        for (int k=0; k<10; k++){
            arr[k] = (int) (Math.random()*100);
            System.out.print(arr[k]);
            System.out.println(" ");
        }

        while (iter) {
            iter = false;
            for (int i = 1; i<10; i++) {
                if (arr[i] < arr[i - 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tmp;
                    iter = true;
            }
        }
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
