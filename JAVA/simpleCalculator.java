import java.util.Scanner;

public class simpleCalculator {
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static int div(int a,int b){
        return a/b;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a= sc.nextInt();
        System.out.print("Enter b:");
        int b= sc.nextInt();

        System.out.println("Choices \n 1. Add \n 2. Sub \n 3.Mul \n 4. Div");
        int c = sc.nextInt();

        switch (c) {
            case 1:
                System.out.println(add(a,b));
                break;
            case 2:
                System.out.println(sub(a,b));
                break;
            case 3:
                System.out.println(mul(a,b));
                break;
            case 4:
                System.out.println(div(a,b));
                break;
            default:
                System.out.println("Enter a valid choice");
                break;
        }
        sc.close();
    }
}
