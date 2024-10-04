package exceptionHandling;

public class TestClass {
    public static void main(String[] args) {
        try{
            throw new MyException2(("Throwing my Exception"));
        } catch (MyException2 ex){
            System.out.println("Caught");

            System.out.println(ex.getMessage());
        }
    }
}
