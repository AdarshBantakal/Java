

class DivByZeroException extends Exception{
    public DivByZeroException(String message) {
        super(message);
    }
}

public class lab9 {
    public static void main(String[] args) {
        System.out.println("Exception");
        int nr=10;
        int dr=1;
        int result;
        try {
            if(dr==0) {
                throw new DivByZeroException("division by zero not allowed");
            }
            result=nr/dr;
            System.out.println(result);
        }
        catch(DivByZeroException e1) {
            System.out.println(e1.getMessage());
        }
        catch(ArithmeticException e2) {
            System.out.println(e2.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}