import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offer(12);
        ad.offerFirst(10);
        ad.offerFirst(40);
        ad.offerLast(45);
        ad.offerLast(55);
        ad.offerLast(78);
        System.out.println(ad);
        System.out.println("PollFirst: "+ad.pollFirst());
        System.out.println("Poll: "+ad.poll());
        System.out.println("PollLast: "+ad.pollLast());
        System.out.println(ad);
        System.out.println("Peek: "+ad.peek());
        System.out.println("PeekFirst: "+ad.peekFirst());
        System.out.println("PeekLast: "+ad.peekLast());
    }
}
