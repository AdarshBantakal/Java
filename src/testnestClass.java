class Outer{
    void display(){
        System.out.println("Outer class display method");
    }
    class inner{
        void display(){
            System.out.println("inner class display method");
        }
    }
}
public class testnestClass {
    public static void main(String[] args) {
        String title0= "Lab 8 program - Nested Class";
        String title1="Develop a Java program to create an outer class with a function display:";
        String title2= "Create another class inside the outer class named inner with a funtion called display";
        String title3= "Call the two function in the main class";
        System.out.println(title0+"\n"+title1+"\n"+title2+"\n"+title3+"\n");
        Outer o1=new Outer();
        o1.display();
        Outer.inner i1= o1.new inner();
        i1.display();
    }

}