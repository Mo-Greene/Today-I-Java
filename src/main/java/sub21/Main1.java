package sub21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(5);
        integerList.add(4);
        integerList.add(12);
        integerList.add(3);

        System.out.println(integerList);

        Collections.sort(integerList);
        System.out.println(integerList);

        System.out.println(integerList.size());
        integerList.remove(4);      //인덱스의 5번째가 삭제됨
        System.out.println(integerList);

        for (int i = 0; i < integerList.size(); i++){
            System.out.println(integerList.get(i));
        }
        for (int current : integerList) {
            System.out.println(current);
        }
    }
}
