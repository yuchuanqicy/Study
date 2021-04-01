import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList <Integer> list =new ArrayList();
        System.out.println(list);
//        list.add("迪丽热巴");
        for(int i=1;i<10;i++){
//            Integer num=10;
            boolean success = list.add(i);
            System.out.println(success);
        }
        System.out.println(list);
//        System.out.println(list.indexOf(9));
        System.out.println(list.size());
        System.out.println("------------");
//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
