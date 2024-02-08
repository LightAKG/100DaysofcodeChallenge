public class QueueLinked {
    static class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
            next = null;
        }
    }    

    static class Queue{
        static Node head = null;
        static Node tail = null;
        
        public static boolean isEmpty(){
            return head == null & tail == null;
        }

        //enqueue
        public static void add(int data){
            Node newNode = new Node(data);
            if(tail == null){
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //dequeue
        public static void remove(){
            if(isEmpty()){
                System.out.println("Queue Underflow");
                return -1;
            }

            int front = head.data;
            if(head == tail){
                tail = null;
            }
            head = head.next;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return head.data;
        }
    }
}
