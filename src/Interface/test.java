package Interface;

import java.util.Calendar;
import java.util.Date;

public class test {
    public static void main(String[] args) {
        Pig pig =new Pig();
        pig.eat();
        pig.jump();
        System.out.println("-------------");
        Animal animal= new Pig();
        animal.setAge(18);
        animal.setName("莉莉");
        System.out.println(animal.getAge()+animal.getName());
        animal.getName();
        animal.eat();
        System.out.println("---------");
        Jumpping jumpping=new Pig();
        jumpping.jump();
        System.out.println("---------");
        pig.setAge(18);
        pig.setName("莉莉");
        System.out.println(pig.getName()+","+pig.getAge());
        Integer intger =Integer.valueOf(100);
        Integer integer1= Integer.valueOf("100");
        System.out.println(intger);
        System.out.println(integer1);
        Date date=new Date( );
        date.getTime();
        System.out.println("----------");
        Calendar c =Calendar.getInstance();
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH)+1;
        int day=c.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+day);
    }
}
