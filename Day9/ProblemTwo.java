import java.util.*;
public class ProblemOne {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String names[] = new String[size];

        System.out.println("Enter the elements of the array.");

        for(int i=0; i<size; i++){
            names[i] = sc.nextLine();   
        }

        for(int i=0; i<size; i++){
            System.out.println(names[i]);
        }
    }


}
