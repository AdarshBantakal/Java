import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class d_tables_file {
    public static void main(String[] args) {
        File inputfile =new File( "in.txt");
        File outputfile =new File( "out.txt");
        try {
            inputfile.createNewFile();
            outputfile.createNewFile();
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

        try (Scanner scanner = new Scanner(inputfile))

            {
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
            //fileWriter.write("");
                try(FileWriter fileWriter= new FileWriter(outputfile)) {
                    for (j = a; j <= b; j++) {
                        for (i = 1; i <= n; i++) {
                            int e = j * i;
                            fileWriter.write(j + "X" + i + "=" + e+"\n");
                        }
                        fileWriter.write("\n");
                        //System.out.println(" ");
                    }
                }catch (IOException e) {
                    throw new RuntimeException(e);
                }
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}