package tEST;

import java.util.Scanner;

public class HasnextDemo {
    public static void main(String[] args) {
        System.out.println("输入");
//        System.out.println("输入");
        Scanner in = new Scanner(System.in);
        String dead="0";
        while (!in.hasNext(dead)){
            String s = new String(in.next());
            System.out.println(s);
        }
    }
}
