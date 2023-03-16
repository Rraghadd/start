
 import java.util.Scanner ;
 import java.util.Arrays ;
 //guessing game :) 
 
 public class Guess {
     public static void main (String []args) {
 
         Scanner in = new Scanner (System.in);
         int[] numbers = {13 ,7 ,23,2,29,3,5,71,11,41,17,19,53,73,31,37,97,43,47,59,61,79,67,83,89};
 
 Arrays.sort(numbers);
 System.out.println("enter 1st guess:");
 int first =in.nextInt();
 
 System.out.println("enter 2nd guess:");
 int second =in.nextInt();
 
 System.out.println(first+"found at index"+Arrays.binarySearch(numbers, first));
 
 System.out.println(second+"found at index"+Arrays.binarySearch(numbers, second));
 
 
     }
 }