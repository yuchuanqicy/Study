package tEST;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            long input=in.nextLong();
           getMethod(input);
            System.out.println(getMethod(input));
        }
    }

    private static String getMethod(long num) {
        StringBuilder stringBuilder=new StringBuilder();
        int d=2;
        while (!(num==1)){
            while (num%d==0){
                num=num/d;
                stringBuilder.append(d).append(" ");
            }
            d++;
        }
        return stringBuilder.toString();
    }
}
