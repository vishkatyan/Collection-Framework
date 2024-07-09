import java.util.Map;
import java.util.TreeMap;


public class LearnTreeMap {
    public static void main(String[] args) {
        Map<Integer, Integer> numbers = new TreeMap<>();
        numbers.put(1, 1);
        numbers.put(2, 2);
        numbers.put(3, 3);
        numbers.putIfAbsent(4, 4);
        System.out.println(numbers);

        // to iterate over map
        for (Map.Entry<Integer, Integer> e: numbers.entrySet()){
            System.out.println("Pair is: "+e);
            System.out.println("Key: "+e.getKey());
            System.out.println("Value: "+e.getValue());
        }
    }
}
