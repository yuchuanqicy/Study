package tEST;
import java.util.Scanner;

public class Compar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String line=in.next();
            if(line.startsWith("0x")){
                line=line.substring(2);
            }
            Integer integer = Integer.valueOf(line, 16);
            System.out.println(integer);
        }

    }
}
