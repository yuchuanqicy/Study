import java.util.Scanner;
import java.util.Random;
public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int num =random.nextInt(100)+1;

        while (true){
            int gessnum=scanner.nextInt();
            if(gessnum>num){
                System.out.println("你猜的數字太大了");
                }else if (gessnum <num){
                System.out.println("你输入的数字太小了");
            }else{
                System.out.println("你输入对了");
                break;
            }

            }
        System.out.println("Game Over");
    }
}
