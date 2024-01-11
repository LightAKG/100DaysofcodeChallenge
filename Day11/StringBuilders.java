import java.util.*;

public class StringBuilders {
    // when we perform more operation on string it becomes slow to optimize the use of string we use String Builder

    //When we want to use string builder class we have to declare a new objects of string builder class and import utilities.

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Manmohan");
        StringBuilder sets = new StringBuilder("Des");
        StringBuilder oppo = new StringBuilder("Reverse");
        System.out.println(sb);
        System.out.println(sets);
        System.out.println(oppo);


        //char at index 0  
        System.out.println(sb.charAt(0));

        //Set char at index
        sb.setCharAt(0, 'D');
        System.out.println(sb);

        //inserting new character and shifting the whole
        sb.insert(0, 'C');
        System.out.println(sb);
        sb.insert(1,'h');
        System.out.println(sb);
        sb.insert(2,'a');
        System.out.println(sb);

        //For deleting the extra char(it is non-inclusive means at the ending index if i write 2 then it deletes from 0 to 1 and not including 2)
        // sb.delete(startIndex, endingIndex);
        sb.delete(0, 3);
        System.out.println(sb);
        
        //in string Builder we can append the char at the end.
        sets.append("t");
        sets.append("r");
        System.out.println(sets.length());


        //Reverse a string 
        for(int i =0; i<oppo.length()/2; i++){
            int front = i;
            int back = oppo.length()-1-i;

            char frontChar = oppo.charAt(i);
            char backChar = oppo.charAt(back);

            oppo.setCharAt(front, backChar);
            oppo.setCharAt(back, frontChar);
        }
        System.out.println(oppo);
    }
}
