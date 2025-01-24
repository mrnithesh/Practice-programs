import java.util.Scanner;

public class reversenumber {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int a= s.nextInt();
        int result=0;
        while (a>0) {
            result= result*10 + (a%10);
            a/=10;
        }
        System.out.println(result);
        s.close();
    }
}
