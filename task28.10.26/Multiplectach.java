public class Multiplectach{
    public static void main(String[] args) {
        try{
            int a=10;
            int b=0;
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        try{
            int arr[]={1,2,3};
            System.out.println(arr[4]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound");
        }
        finally {
            System.out.println("Program completed");
        }
    }
}
