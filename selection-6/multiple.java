import java.util.Scanner;
public class multiple 
{
    public static void main(String[] args) {
         
        Scanner s = new Scanner ( System.in);
        
        System.out.println("Enter first number ");
        int n1=s.nextInt();

        System.out.println("Enter second number ");
        int n2=s.nextInt();
       
        boolean isMultiple = n1 % n2 == 0;
        if (isMultiple){
            System.out.print("first number " + n1 );
            System.out.println(" is multiple of " + n2 );}
        else
        System.out.println("it does not accept division!!!");

    

    }
    
       
}