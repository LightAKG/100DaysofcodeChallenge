import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class probOne {
    public static void main(String[] args) throws Exception {
        // StringBuilder str = new StringBuilder();
        // str.append("GOW");
        // System.out.println("String = "+ str.toString());

        // StringBuilder str1 = new StringBuilder("AAABBBCCCDDDEE");
        // System.out.println("String1 = "+ str1.toString());

        // StringBuilder str2 = new StringBuilder(10);
        // System.out.println("String2 Capacity = "+str2.capacity());

        // StringBuilder str3 = new StringBuilder(str1.toString());
        // System.out.println("String3 = "+str3.toString());

        StringBuilder st = new StringBuilder("Muskan loves me");
        System.out.println("String = "+ st.toString());

        StringBuilder reverseStr = st.reverse();
        System.out.println("Reverse String ="+reverseStr.toString());

        st.appendCodePoint(44);
        System.out.println("Modified StringBuilder = "+st);

        int capacity = st.capacity();
        System.out.println("CApacity of string builder = "+capacity);
    }
}
