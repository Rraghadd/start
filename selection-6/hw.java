import java.util.Scanner;

public class hw {
    public static void main(String[]args){
        Scanner s = new Scanner (System.in);

        System.out.print("Enter rectangle hight and width : ");
        int h = s.nextInt();
        int w = s.nextInt();

        if (h >= 1 && w >=1 ){

            System.out.print("Enter a point with two coordinates:");
            int x = s.nextInt();
            int y = s.nextInt();

            if (x<= h/2 && y <= w/2){

                System.out.printf("point (%d, %d) is in the rectangle .",x , y);}
                else{
                    System.out.printf("point (%d, %d) is not in the rectangle.",x , y);

                }


            }

        }


    }
