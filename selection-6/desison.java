import java.util.Scanner;
public class desison{
public static void main (String []args){

    Scanner input =new Scanner (System.in);

    System.out.println("enter your level : ");
    int level = input.nextInt();

    

    switch (level){
        case 5 :
        System.out.println("elective :Advanced algebra");
        break;

        
        case 8 :


        System.out.println("enter your dep : ");
    String dep = input.next();
 
        switch(dep){

            case "cs" : 
                System.out.println("elective :Machine learning");
                break;

            case "is" :
                System.out.println("elective :e-commerce");
                break;

                default :
                System.out.println("elctive : web security");
  }break;
  default:
  System.out.println("no elective");
 

        
    }
   






}
}