import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.putIfAbsent("Four", 4);
        System.out.println(numbers);

        // to iterate over map
        for (Map.Entry<String, Integer> e: numbers.entrySet()){
            System.out.println("Pair is: "+e);
            System.out.println("Key: "+e.getKey());
            System.out.println("Value: "+e.getValue());
        }
    }
}
