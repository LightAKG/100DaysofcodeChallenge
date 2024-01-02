import java.util.*;
class Comparison{
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        // In one if statment is there then we can write like this - if(a == b) System.out.println("Equal");
        
        System.out.println("Enter First Number");
        int a = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();

        if(a == b) {
            System.out.println("Equal");
        } else if( a > b) {
            System.out.println("First Number is greater that second.");
        } else {
            System.out.println("First number is Lesser.");
        }
    }
}
