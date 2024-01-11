import java.util.*;
public class EmailBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email:");

        String sem = sc.nextLine();
        StringBuilder email = new StringBuilder(sem);

        for(int i=0; i<email.length(); i++){
            if (email.charAt(i) == '@'){
                break;
            }
            System.out.println(email);


    }
}

}

