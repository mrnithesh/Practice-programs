import java.util.Scanner;

public class prac2{
    public static void main(String [] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter A: ");
        int a = s.nextInt();
        System.out.println("Enter B :");
        int b = s.nextInt();
        System.out.println("Enter C :");
        int c = s.nextInt();

        if ((a>=b) && (a>=c)){
            System.out.println("A is greater");
        }
        else if ((b>=a) && (b>=c)){
            System.out.println("B is greater");
        }
        else {
            System.out.println("C is greater");
        }




        // if ((a%400==0)|| (a%4==0 && a%100!=0)){
        //     System.out.println("Leap year");
        // }
        // else {
        //     System.out.println("Non Leap year");
        // }
        // s.close();
    }
}
