
public class Linkedl {
    
    Node head; 
    private int size;

    Linkedl() {
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add - first, last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //adding in last
    public void lastNode(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //delete can be done in two ways
    // 1. we delete head by shifting the head to second element then first element remove/delete.
    // 2. we delete last node by shifting the second last data to point to null

    //deleting from the beginning(delete first)
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty.");
            return;
        }
        size--;
        head = head.next;
    }

    //deleting from the last
    public void deleteLast() {
        if(head == null){
            System.out.println("The list is empty.");
            return;
        }

        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null ){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }


    //printing the list
    public void printList(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Linkedl list = new Linkedl();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        
        list.lastNode("List");
        list.printList();
        
        System.out.println(list.getSize());
        
        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
        
        list.printList();
    }
}
