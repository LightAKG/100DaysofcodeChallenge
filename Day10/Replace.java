import java.util.*;
public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String things = sc.nextLine();

        String replace = things.replace('e','i');
        System.out.println(replace);
    }
}
