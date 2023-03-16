import java.util.Scanner;
public class minimum 

// this program will find out the smallest number that user entered
{
    public static void main(String[] args) {
         
        Scanner s = new Scanner ( System.in);
        
        System.out.println("Enter three integers");
        int n1=s.nextInt();
        int n2=s.nextInt();
        int n3=s.nextInt();

        int min=n1;
        if (n2<min) 
            min=n2;
        if (n3<min)
            min=n3;
        System.out.println("The smallest number is " + min );
    

    }
    
       
}
