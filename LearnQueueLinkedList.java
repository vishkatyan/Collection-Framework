import java.util.LinkedList;
import java.util.Queue;
public class LearnQueueLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        queue.offer(48);
        System.out.println("Original Queue is: "+queue);
        System.out.println("Removed element is: "+queue.poll());
        System.out.println("New Queue is: "+queue);
    }
}
