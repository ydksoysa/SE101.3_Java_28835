
package javaapplication19;


public class JavaApplication19 {

    
    public static void main(String[] args) {
        
        // TODO code application logic here
        try
                {
                  File file=new File("home.txt");
                  Scanner scanner=new Scanner(file);
                  while(scanner.hasNextLine())
                  {
                      String line=scanner.nextLine();
                      System.out.println(line);
                  }
                  scanner.close();
                  
                }
        catch(FileNotFoundException e)
                {
                    System.out.println("File not Found");
                }
    }
    
}
