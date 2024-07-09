import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//        Queue<Integer> pq = new PriorityQueue<>(); --> Implements Queue Interface
        pq.offer(48);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        System.out.println("Original PQ: "+pq);
        pq.poll();
        System.out.println("New PQ: "+pq);
        pq.poll();
        System.out.println("New PQ: "+pq);

    }
}
