public class CircularQ {

    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;
    }

    // Constructor for initializing the queue
    CircularQ(int n) {
        Queue.arr = new int[n];
        Queue.size = n;
    }

    public static boolean isEmpty() {
        return Queue.rear == -1 && Queue.front == -1;
    }

    public static boolean isFull() {
        return (Queue.rear + 1) % Queue.size == Queue.front;
    }

    // Enqueue
    public static void add(int data) {
        if (isFull()) {
            System.out.println("Full queue");
            return;
        }

        // First element added
        if (Queue.front == -1) {
            Queue.front = 0;
        }

        Queue.rear = (Queue.rear + 1) % Queue.size;
        Queue.arr[Queue.rear] = data;
    }

    // Dequeue
    public static int remove() {
        if (isEmpty()) {
            System.out.println("Empty queue");
            return -1;
        }

        int result = Queue.arr[Queue.front];

        // Single element condition
        if (Queue.rear == Queue.front) {
            Queue.rear = Queue.front = -1;
        } else {
            Queue.front = (Queue.front + 1) % Queue.size;
        }

        return result;
    }

    // Peek
    public static int peek() {
        if (isEmpty()) {
            System.out.println("Empty queue");
            return -1;
        }
        return Queue.arr[Queue.front];
    }

    public static void main(String[] args) {
        CircularQ q = new CircularQ(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
