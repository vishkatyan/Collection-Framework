import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {
    // stores elements in one after another order
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(23);
        set.add(44);
        set.add(90);
        set.add(9);
        set.add(4);
        System.out.println(set);
        set.remove(90);
        System.out.println(set);
        System.out.println(set.contains(100));
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
    }
}
