// raghad althiyabi رغد الذيابي
import java.util.Scanner ;
public class URL
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a URL");
        String urla = sc.next();

        
        System.out.println("Enter a URL");
        String urlb = sc.next();

        
        System.out.println("Enter a URL");
        String urlc = sc.next();

        System.out.println("------------------------------");

        String a1 = urla.substring(0,urla.indexOf(":"));
        String b1 = urla.substring(urla.indexOf(".") + 1 ,  urla.lastIndexOf (".")); 
        String c1 = urla.substring(urla.lastIndexOf(".")+1);
        System.out.printf(" %5s | %15s | %5s \n", a1,b1,c1);


        String a2 = urlb.substring(0,urlb.indexOf(":"));
        String b2 = urlb.substring(urla.indexOf(".")+2 ,  urlb.lastIndexOf (".")); 
        String c2 = urlb.substring(urlb.lastIndexOf(".")+1 );
        System.out.printf(" %5s | %15s | %5s \n", a2,b2,c2);



        String a3 = urlc.substring(0,urlc.indexOf(":"));
        String b3 = urlc.substring(urlc.indexOf(".") +1 ,  urlc.lastIndexOf (".")); 
        String c3 = urlc.substring(urlc.lastIndexOf(".")  +1);
        System.out.printf(" %5s | %15s | %5s \n", a3,b3,c3);

        System.out.println("--------------------------------");


    }
} 

