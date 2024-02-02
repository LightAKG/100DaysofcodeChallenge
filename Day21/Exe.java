//Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index
import java.util.*;

class Exe{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);

        System.out.println(list);
        
        for(int i=0; i<list.size(); i++){
            if(list.get(i) == 7){
                System.out.println("index of 7 is "+ i);
            }
        }
    }
}























// public class Exe {
//     Node head;
//     private int size;

//     Exe(){
//         size = 0;
//     }

//     public class Node{
//         String data;
//         Node next;

//         Node(String data){
//             this.data = data;
//             this.next = null;
//             size++;
//         }
//     }

//     //add first
//     public void addFirst(String data){
//         Node newNode = new Node(data);
//         newNode.next = head;
//         head = newNode;
//     }

//     public void addLast(String data){
//         Node newNode = new Node(data);

//         if(head == null){
//             head = newNode;
//             return;
//         }

//         Node lastNode = head;
//         while(lastNode.next != null){
//             lastNode = lastNode.next;
//         }

//         lastNode.next = newNode;
//     }

//     public void printList(){
//         Node currNode = head;

//         while(currNode != null){
//             System.out.print(currNode.data + " -> " );
//             currNode = currNode.next;
//         }
//         System.out.println("null");
//     }

//     public void removeFirst(){
//         if(head == null){
//             System.out.println("Empty List, Nothing to delete.");
//             return;
//         }
//         head = this.head.next;
//         size--;
//     }

//     public void removeLast(){
//         if(head == null){
//             System.out.println("Empty lsit, nothing to delete");
//             return;
//         }

//         size--;
//         if(head.next == null){
//             head = null;
//             return;
//         }

//         Node currNode = head;
//         Node lastNode = head.next;

//         while(lastNode.next != null){
//             currNode = currNode.next;
//             lastNode = lastNode.next;
//         }
//         currNode.next = null;
//     }

//     public int getSize(){
//         return size;
//     }

//     public static void main(String[] args) {
//         Exe list = new Exe();
//         list.addFirst("1");
//         list.addLast("5");
//         list.addLast("7");
//         list.addLast("3");
//         list.addLast("8");
//         list.addLast("2");

//         list.printList();

//         for(int i=0; i<list.getSize(); i++){
//             if("7" .equals(list.getDataAtIndex(i))){
//                 System.out.println(i);  
//             }
//         }
//     }


// }
