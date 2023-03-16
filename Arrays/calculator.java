import java.util.Scanner;
//program using THE quadratic formula to count 
public class calculator {
   public static void main (String []args){

      Scanner s = new Scanner (System.in);

      int[]arrays = new int [3];

      System.out.print("enter a: ");
      arrays[0] = s.nextInt();

      System.out.print("enter b: ");
      arrays[1]=s.nextInt();
      int b = -arrays[1];

      System.out.print("enter c: ");
      arrays[2] = s.nextInt();

      double squareRoot =  Math.sqrt(Math.pow(arrays[1],2) - (4*arrays[0]*arrays[2])); 

      double sol1 = ((b + squareRoot) / 2*arrays[0]);
      double sol2 = ((b - squareRoot) / 2*arrays[0]);
      System.out.printf("sol1=%f%nsol2=%f",sol1,sol2);
      
   }
}
