import java.util.Scanner;
public class nlp2
{
    public static void main(String[] args) {
         
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a word");
        String sentence = s.next();

        switch( sentence.substring(0,5) ){

          case "Hyper" :
            case "hyper":System.out.println("prefix means over, more, beyond");break;

            case "Trans":
            case "trans":System.out.println("prefix means across, through");break;

            case "Micro":
            case "micro": System.out.println("prefix means very small");break;
            
            case "Inter":
            case "inter":System.out.println("prefix means between,among");
            break;
            default: System.out.println("unknown prefix");
        }
       
        
        
      }
    }//add braces




