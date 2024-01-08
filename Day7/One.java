package DaySeven;
import java.util.*;
public class One {
    // Enter 3 numbers from the user & make a function to print their average.
    public float average(int a, int b, int c){
        float avg;
        avg = (a + b + c) / 3.0f;
        return avg;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        One oneInstance = new One();
        float avg = oneInstance.average(a,b,c);
        System.out.println("The average of "+a+ "," +b+ ","+c+ "is:" +avg);
        }
    }

