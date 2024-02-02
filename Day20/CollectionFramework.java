import java.util.Collections;
import java.util.ArrayList;

public class CollectionFramework {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        //add element
        list.add(0);
        list.add(4);
        list.add(6);
        System.out.println(list);

        //Getting elements (Get)
        int element = list.get(1);
        System.out.println(element);
        
        //add element in between
        list.add(3,7);
        System.out.println(list);
        
        //set elements - to change an element of specific index
        list.set(0, 5);
        System.out.println(list);
        
        //delete element
        list.remove(3);
        System.out.println(list);
        
        //size
        int size = list.size();
        System.out.println(size);
        
        //loops
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);
        
    }
}

//collection framework - The Java Collections Framework is a comprehensive set of classes and interfaces that provides high-performance, reusable data structures and algorithms for storing, manipulating, and processing collections of objects. It is part of the Java Standard Edition (SE) library and is designed to simplify the development of Java applications by offering a unified architecture for handling groups of objects
// ArrayList    
// array- stores data in memory in continuous form, it has fixed size, it is stores primitive as well as object 
// arraylist - stores data in non-continuos form , it has alternate size variable , it stores object in heap.

// in array list we perform mainly five tasks - add, modify, get, delete/remove, Iterate/operations

// to use arraylist we have to import a package - arraylist
// if we want to store different types of data then we have to define its name
// Integer | Float | String | Boolean

// To create a list we have to declare
// ArrayList<Data type with first letter capital> variable_name = new Arraylist<>();

// ArrayList<Integer> list = new ArrayList<Integer>(); to create a list of integers, we can also create a list of integer in above format
