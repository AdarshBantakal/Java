import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class M12{
    public static void reverse2(String fname1, String fname2)throws IOException {
        File f1=new File(fname1);
        FileWriter fw1=new FileWriter(fname2);
        Scanner sc1=new Scanner(f1);
        String name="";
        String name_rev="";
        Tools t1=new Tools();
        while(sc1.hasNext()){
            name=sc1.nextLine();
            name_rev=t1.reverse(name);
            fw1.write(name_rev+"\n");
            System.out.println(name_rev);
        }
        fw1.close();

    }

    public static void main(String[] args) throws IOException {
        reverse2("names.txt","names_out.txt");
        reverse2("family.txt","family_out.txt");
    }

}