import java.util.Scanner ;
public class price {
    public static void main (String []args){

        Scanner s = new Scanner (System.in);

        int count = 0 ;


        while (count < 3){
            
        System.out.print("enter the name and the price of product : ");
        String str = s.nextLine();



        int space = str.indexOf(" ");


        String productn = str.substring(0,space);
        String productpr = str.substring(space+1);

        double price = Double.parseDouble(productpr);

        double discount = price - (price * (0.25));

        System.out.printf("%s %n %.2f %n",productn,discount);
    count ++ ;}




    }
}
