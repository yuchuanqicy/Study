import java.util.Arrays;

import static java.lang.StrictMath.ceil;


public class ArraytoString {
    public static void main(String[] args) {
        int str1[] = {1, 2, 3, 4};
        char str2[] = {'a', 'b', 'c'};
//        char[] dwqdw={'1','2'};
        String str5 = new String("ddddw");
        String str = Arrays.toString(str1);
        String str3 = Arrays.toString(str2);
        System.out.println(str);
        System.out.println(str3);
        System.out.println(str5);
        System.out.println("--------------------");
        double num1 = -10.8;
        double num2 = 5.9;
        int count=0;
        for (int i = (int) num1; i < num2; i++) {
            if (Math.abs(i) < 2 || Math.abs(i) > 6) {
//                int count = 0;
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
