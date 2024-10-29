interface Resizable{
    void resizeWidth(int width);
    void resizeHeight(int height);}
class Rectangle implements Resizable{
    private int width;
    private int height;
    public Rectangle(int width, int height){
        this.width=width;
        this.height=height; }
    public void resizeWidth(int width){
        this.width=width;
    }
    public void resizeHeight(int height){
        this.height=height;
    }
    public void display(){
        System.out.println("Rectangle Width:"+width);
        System.out.println("Rectangle Height:"+height);
    }
}

public class testinterface {
    public static void main(String[] args) {
        String title0="Lab 7 program - Resizable Interface";
        String title1="Develop a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized.";
        String title2="Create a class Rectangle that implements the Resizable interface and implements the resize methods.";
        System.out.println(title0+"\n"+title1+"\n"+title2);
        Rectangle r1=new Rectangle(5,10);
        System.out.println("\nOriginal Rectangle:");
        r1.display();
        r1.resizeWidth(8);
        r1.resizeHeight(12);
        System.out.println("\nResized Rectangle:");
        r1.display();
    }

}