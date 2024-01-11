import java.util.*;
public class SbReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        StringBuilder bus = new StringBuilder(str);

        for(int i=0; i< bus.length(); i++){
            if(bus.charAt(i) == 'e'){
                bus.setCharAt(i, 'i');                
            }
            System.out.println(bus);
        }

        // System.out.println(bus);
        // bus.setCharAt(0, 0);
    }
}
