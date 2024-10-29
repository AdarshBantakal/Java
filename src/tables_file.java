import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class tables_file {
    public static void main(String[] args) {
        File myfile =new File( "in.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
            //e.printStackTrace();
        }

        try {
            FileWriter fileWriter = new FileWriter("in.txt");
            fileWriter.write("5 \n20");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (Scanner scanner = new Scanner(myfile)) {
                int i, n = 10, j,a=0;

                if (scanner.hasNextInt()) {
                     a = scanner.nextInt();
                    System.out.println("Enter the input of   " + a);
                }

                if (scanner.hasNextLine()) {
                    scanner.nextLine(); // Move to next line
                }

                int b = 0;
                if (scanner.hasNextInt()) {
                    b = scanner.nextInt();
                    System.out.println(" input of   " + b);
                }

                System.out.println(" ");
                for (j=a;j<=b;j++) {
                    for (i = 1; i <= n; i++) {
                        int e = j * i;
                        System.out.println(j + "X" + i + "=" + e);
                    }
                    System.out.println(" ");
                }


        } catch (IOException e) {
            throw new RuntimeException(e);

        }

    }
}
