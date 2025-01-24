import java.util.Scanner;

public class prac2{
    public static void main(String [] args){
        Scanner s= new Scanner(System.in);
        System.out.println("1. Add 2. Sub 3. Mul 4. Div");
        System.out.print("Enter your choice");
        int choice = s.nextInt();
        System.out.println("Enter A: ");
        int a = s.nextInt();
        System.out.println("Enter B :");
        int b = s.nextInt();
        switch (choice){
            case 1:
                System.out.println("The result is " + add(a,b));
                break;
            case 2:
                System.out.println("The result is "+ sub(a,b));
                break;
            case 3:
                System.out.println("The result is "+ mul(a,b));
                break;
            case 4:
                if (b==0){
                    System.out.println("Division error");
                    break;
                }
                System.out.println("The result is"+ div(a,b));
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        // System.out.println("Enter C :");
        // int c = s.nextInt();


        // if ((a>=b) && (a>=c)){
        //     System.out.println("A is greater");
        // }
        // else if ((b>=a) && (b>=c)){
        //     System.out.println("B is greater");
        // }
        // else {
        //     System.out.println("C is greater");
        // }

        // if ((a%400==0)|| (a%4==0 && a%100!=0)){
        //     System.out.println("Leap year");
        // }
        // else {
        //     System.out.println("Non Leap year");
        // }
        // s.close();
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static int div(int a, int b){
        return a/b;
    }
}
