package NewFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("E:\\Test\\src\\NewFiles\\Demo.java");
        FileWriter fw = new FileWriter("E:\\Test\\demo.java");
        int ch;
        while ((ch= fr.read())!=-1){
            fw.write(ch);
        }
        fr.close();
        fw.close();
    }
}
