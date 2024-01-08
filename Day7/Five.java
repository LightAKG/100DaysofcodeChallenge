import java.util.*;

public class Five {
    // Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

    public static String eligible(int age){
        if (age >= 18) {
            return "You are eligible for vote.";
        } else {
            return "You are not eligible for vote.";
        }
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        System.out.println(eligible(age));
        // Five info = new Five();
        // String result = info.eligible(age);

    }
}
