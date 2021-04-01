package Interface;

public class Pig extends Animal implements Jumpping{
    public Pig(){

    }
    public Pig(String name,int age){
        super(name,age);
    }
    @Override
    public void jump() {
        System.out.println("猪会跳高");
    }

    @Override
    public void eat() {
        System.out.println("猪很能吃");
    }

}
