public class helloWorld{
    public static void main(String args[]){
        System.out.println("Hello World!!");
        int a = 10;
        float b = 10.00f;
        char c = 'A';
        double d = 3.14;
        String e = "Something";
        boolean isJavaFun = true;

        if (isJavaFun){
            System.out.println(e);
            System.out.println("another output here " + a*b);
        }
        int [] nums = {10,20,43,55,69};
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}