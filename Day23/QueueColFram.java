import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueColFram {
        public static void main(String[] args) {
            // we can implement collection framework in 2 methods
            // Queue<Integer> q = new LinkedList<>();  //first
            Queue<Integer> q = new ArrayDeque<>();   //second
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);

            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
        }
}
