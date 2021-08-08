public class PowerOf2 {
    public static void main(String[] args) {
        int n = 8;
        int powersOf2 = 1;
        for (int i=1; i<=n; i++)
        {
            powersOf2 = 2 * powersOf2;
        }
        System.out.println("Result is:"+powersOf2);
    }
}
