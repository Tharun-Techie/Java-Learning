package ShilpaMamQuestions;
import java.util.HashMap;
import java.util.Map;

public class DemoTest {
    public static void main(String[] args) {

        HashMap<Integer, Double> map = new HashMap<>();
        map.put(1,7.1);
        map.put(2,7.3);
        map.put(3,5.6);
        map.put(4,7.4);
        map.put(5,7.6);
        map.put(6,7.7);
        map.put(7,8.2);

        System.out.println("map.entrySet(): "+map.entrySet());
        System.out.println("map.keySet(): "+map.keySet());
        System.out.println("map.values(): "+map.values());
        System.out.println(map.remove(6));
        System.out.println(map.size());

   for (Map.Entry<Integer, Double> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }


    }



}
