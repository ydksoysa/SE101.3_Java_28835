
package javaapplication17;


public class JavaApplication17 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int x=10,y=0,z;
        try
        {
            z=x/y;
            System.out.println("Answer "+z);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
