package tEST;

import java.util.ArrayList;
import java.util.List;

public class ThreadRun {
    public static void main(String[] args) {
        Thread thread = new Thread(()->pong());
        thread.run();
        System.out.println("ping");
        System.out.println("-------------");
        List<String> a=null;
        test(a);
        System.out.println(a.size());
    }
    public static void pong(){
        System.out.println("pong");
    }
    public static void test(List a){
        a=new ArrayList<String>();
        a.add("abc");
    }
}
