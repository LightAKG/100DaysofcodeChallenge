import java.util.*;
public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        char userChoice;
    
        do{
            System.out.println("Enter a number: ");
            int number = sc.nextInt();

            if(number > 0){
                positiveCount++;
            } else if ( number < 0){
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.println("Do you want to enter another number? (Y/N): ");
            userChoice = sc.next().charAt(0);
        } while (userChoice == 'y' || userChoice == 'Y');

        System.out.println("Count of postive number: "+ positiveCount);
        System.out.println("Count of negative number: "+ negativeCount);
        System.out.println("Count of Zero number: "+ zeroCount);

        sc.close();

    }
}
