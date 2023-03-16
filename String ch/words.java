//raghad althiyabi رغد الذيابي

import java.util.Scanner;

public class words 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner (System.in);

        System.out.println("Enter a word");
        String word=s.next();
  
        String part1 = word.substring(0, 5);// we change 4 to 5
        String part2 = word.substring(5);

        
        System.out.println(part1.toUpperCase());//change it from (toUpperCase(patr1)) to what shown write now 
        System.out.println(part2.toLowerCase());//change it from (toLowerCase(patr2)) to what shown write now
       
        


    }
    
       
}