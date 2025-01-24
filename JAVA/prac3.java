import java.util.Scanner;

public class prac3{
    public static void main(String [] args){
        int result = 0;
        for (int i = 0; i <= 100; i++){
            if (i%2==0){
                result+=i;
            }
        }
        System.out.println(result);
        // int i=0;
        // while (i<=100){
        //     System.out.println(i);
        //     i++;
        // }
        // Scanner s= new Scanner(System.in);
        // System.out.println("Enter a number");
        // int a= s.nextInt();
        // for (int i=0; i<=20;i++){
        //     System.out.println(i +"*"+a + "=" + (i*a));
        // }


    }
}