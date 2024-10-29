import java.util.Scanner;
public class tables2 {
        public static void main(String[] args) {
            int i, n = 10, j;
            System.out.println("Enter the input of   ");
            Scanner c = new Scanner(System.in);

            int a = c.nextInt();
            System.out.println("Enter the input of   ");
            Scanner d = new Scanner(System.in);
            int b = d.nextInt();

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