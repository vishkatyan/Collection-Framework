import java.util.Set;
import java.util.TreeSet;
public class LearnTreeSet {
    //stores elements in sorted format
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
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
