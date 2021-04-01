package NewFiles;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
//        File file = new File("E://Test//JAVA.txt");
//        file.mkdir();
        FileOutputStream fis= new FileOutputStream("E://Test//java.txt");
        fis.write(97);
        fis.close();
        FileInputStream fileInputStream=new FileInputStream("E://Test//java.txt");
        int i=fileInputStream.read();
        System.out.println(i);
        fileInputStream.close();
    }
}
