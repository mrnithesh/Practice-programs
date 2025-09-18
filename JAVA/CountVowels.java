import java.util.*;

public class CountVowels{
    public static void main(String args[]){
        String str ="avceiso";
        int res = 0;
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        for(char ch : str.toCharArray()){
            if (set.contains(ch)){
                res++;
            }
        }
        System.out.println(res);
    }
}