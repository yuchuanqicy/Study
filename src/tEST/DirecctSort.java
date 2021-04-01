package tEST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DirecctSort {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (!input.hasNext("0")) {
            arrayList.add(input.nextInt());
        }
        System.out.println("初始化序列为：" + arrayList);
        System.out.println("初始化序列长度："+arrayList.size());
        Sort(arrayList);
        System.out.println(arrayList);
    }

    public static void Sort(List arrayList) {
        for (int i = 1; i <arrayList.size(); i++) {
            int temp= (int) arrayList.get(i);
            int j=i-1;
            for (;j>=0&&(int)arrayList.get(j)>temp;j--){
                Collections.swap(arrayList,j+1,j);
            }
            Collections.swap(arrayList,j+1,i);
            System.out.println(temp);
        }
    }
}
