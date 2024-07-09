import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
    // stores elements in random format (implements hashing behind the scene)
    public static void main(String[] args) {
        Set<StudentCustomSet> st = new HashSet<>();
        st.add(new StudentCustomSet(1,"Vish"));
        st.add(new StudentCustomSet(2,"Kanishka"));
        st.add(new StudentCustomSet(3,"Ram"));
        st.add(new StudentCustomSet(4,"Shivam"));
        st.add(new StudentCustomSet(3,"Shyam"));
        System.out.println(st);
//        Set<Integer> set = new HashSet<>();
//        set.add(23);
//        set.add(44);
//        set.add(90);
//        set.add(9);
//        set.add(4);
//        System.out.println(set);
//        set.remove(90);
//        System.out.println(set);
//        System.out.println(set.contains(100));
//        System.out.println(set.size());
//        set.clear();
//        System.out.println(set);

    }
}
