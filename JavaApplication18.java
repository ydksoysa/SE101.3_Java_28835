
package javaapplication18;


public class JavaApplication18 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            int arr[]=new int[5];
            arr[5]=10;
            System.out.println("value is "+arr[5]);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e1)
                {
                System.out.println(e1.getMessage());
                }
    }
    
}
