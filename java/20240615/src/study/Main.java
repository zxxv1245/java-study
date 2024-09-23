package study;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(5);

        Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()){
            Integer num = iterator.next();
            System.out.println(num);
        }
    }
}
