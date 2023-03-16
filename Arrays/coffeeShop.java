import java.util.Scanner;

public class coffeeShop {
    public static void main(String[]args){
        Scanner s = new Scanner (System.in);

        int [] price = {3,4};
        int [] quantity ={10,10};

        System.out.printf("Coffee : quantity = %d price = %d%n",quantity[0],price[0]);
        System.out.printf("Dount: quantity = %d price = %d%n",quantity[1],price[1]);

        System.out.print("How many coffee? ");
        int coscof = s.nextInt();

        System.out.print("How many dount? ");
        int cosdou = s.nextInt();

        int coffeeprice =(coscof*price[0]);
        int dountprice = (cosdou*price[1]);
        
        double total = (coffeeprice + dountprice) * 1.15;

        
        if (total>0.0)
        System.out.printf("your total = %.1f",total);
    }
    
}
