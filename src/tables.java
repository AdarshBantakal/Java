public class tables {
    public static void main(String[] args) {
        int i, n = 10, j;
        int a=3,b=20;
        System.out.println(" ");
        for (j = a; j <= b; j++) {
            for (i = 1; i <= n; i++) {
                int e = j * i;
                System.out.println(j + "X" + i + "=" + e);

            }
            System.out.println(" ");
        }
    }
}
