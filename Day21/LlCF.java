import java.util.*;

public class LlCF {
    // linkedlist operations with collection framework    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("This");
        list.addLast("list");
        System.out.println(list);

        // if i only write list.add("shif") then it add the element at last by default

        System.out.println(list.size());

        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i)+ " -> ");
        }
        System.out.println("Null");

        // to find the specific value from the list
        // for(int i = 0; i < list.size(); i++){
        //     if(list.get(i) == "is"){
        //         System.out.println(list.get(i));
        //     } else {
        //         System.out.println("Not found");
        //     }
        // }

        //to delete an element from first or last
        // list.removeFirst();
        // list.removeLast();
        // System.out.println(list);


        list.remove(2);
        System.out.println(list);

    }
}
