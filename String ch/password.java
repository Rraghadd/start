import java.util.Scanner;
public class password {
    public static void main (String[]args){
        Scanner s= new Scanner(System.in);
        
        System.out.printf("pass rules %n 1)pass must be at least 8%n 2)pass must not contain?%n3)pass must start with #%n");

        String st = s.next();

        boolean b1 = st.length() >= 8 ; 

        boolean b2 = st.indexOf('?')==-1 ; 

        boolean b3 = st.startsWith("#");

        System.out.println("--------------------------------------");
        System.out.printf("%8s|%10b%n","Rule1",b1);
        System.out.printf("%8s|%10b%n","Rule2",b2);
        System.out.printf("%8s|%10b%n","Rule3",b3);
        System.out.println("--------------------------------------");      
    }
    
}
