import java.util.*;

public class Strings {
    public static void main(String[] args) {
        
        //String declaration
        // String name = "tony";
        // String sentence = "His name is tony stark.";
        
        //Taking input string from user
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine(); 
        // String name = sc.nextLine(); //To take a whole line(sentence) from user.

        // String name = sc.next();   //To take single word from user
        // System.out.println("your name is :" +name);


        // String manipulation
        // 1.concatenation - adding two strings 
        String firstName = "Hello";
        String lastName = "World";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        // 2.String Length
        System.out.println(fullName.length());

        //3. charAt
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        //4.comparing two strings
        // if(variable1.compareTo(variable2))
        String name1 = "GArdians";
        String name2 = "galaxy";

        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        } else {
            System.out.println("String are not equal");
        }


        // 5.Substring
        String sentence = "Are you ready for this?";
        String word = sentence.substring(11, sentence.length());
        System.out.println(word);

        //Strings are immutable


    }
}
