import java.util.*;
public class SbCompare {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("King");
        StringBuilder bs = new StringBuilder("Kong");

        int one = sb.length();
        int two = bs.length();
        if(one == two){
            System.out.println("Both string are equal");
        } else {
            System.out.println("Not equal");
        }

        if(sb == bs){
            System.out.println("They are the same string");
        } else {
            System.out.println("They are the different String.");
        }

    }    
}
