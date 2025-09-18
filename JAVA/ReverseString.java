import java.util.*;
public class ReverseString{
    public static void main(String args[]){
        String str = "qwerty";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString());
    }
}