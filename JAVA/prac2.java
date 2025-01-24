import java.util.Scanner;

public class prac2{
    public static void main(String [] args){
        Scanner s= new Scanner(System.in);
        int a = s.nextInt();
        if ((a%400==0)|| (a%4==0 && a%100!=0)){
            System.out.println("Leap year");
        }
        else {
            System.out.println("Non Leap year");
        }
        s.close();
    }
}
