public class Factorial {
    public static void main(String [] arg)
        {
            int rez = fac(5);
            if (rez > 0){
                System.out.println(rez);
            }
            else {
                System.out.println("This number has no factorial");
            }
        }
        public static int fac(int n){
            int f = 1;
            if (n > 1){
                for (int i=1; i<=n;i++) f*=i;
            }
            if (n < 0){
                return -1;
            }
            return f;
        }
}
