package sub21;

import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        //key , value
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "iphone");

        System.out.println(map);
        System.out.println(map.get(2)); // 값을 가져올때 key 로 가져옴 오오오

        map.remove(2);
        System.out.println(map);
        System.out.println(map.containsKey(2));             // key 값이 현재 존재하는지 여부 확인인듯
        System.out.println(map.containsValue("apple"));    // value 값이 존재하는지 여부 확인

        map.clear();
        System.out.println(map);
    }
}
