public class Calculator {

    public static int add(int a, int b){
        return a+b;
    }

    public static int add2(int a, int b) throws IllegalArgumentException{
        if(a > b){
            throw new IllegalArgumentException("My exception.");
        }
        return a + b;
    }

    public static String operator = "add";
    public static String operator2 = "minus";
}
