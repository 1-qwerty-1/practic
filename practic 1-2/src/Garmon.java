public class Garmon {
    public static void main(String[] args) {
        float sum = 0;
        float j = 0;

        float[] arr = new float[10];
        for (int i=0; i<10; i++){
            arr[i] = 1/(j+1);
            System.out.print(arr[i]);
            System.out.print(" ");
            sum += arr[i];
            j++;
        }
        System.out.println();
        System.out.println(sum);
    }
}
