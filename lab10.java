package pkg2;
import pkg3.mypackage2;
import pkg3.mypackage3;
class MyPackage{
    public void display(){
        System.out.println("This msg is from MyPackage class within pkg2");
    }
}
public class lab10{
    public static void main(String[] args) {
        System.out.println("Package");
        MyPackage mypack1 = new MyPackage();
        mypackage2 mypack2 = new mypackage2();
        mypackage3 mypack3 = new mypackage3();
        mypack1.display();
        mypack2.display();
        mypack3.display();

    }
}

