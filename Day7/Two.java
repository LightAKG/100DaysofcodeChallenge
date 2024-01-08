import java.util.*;
public class Two {
    
    // Write a function to print the sum of all odd numbers from 1 to n.
    public int sumOdd(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i%2 == 1){
                System.out.println(i+",");
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to print the sum of odd numbers");
        int n = sc.nextInt();

        Two twoInstance = new Two();
        int result = twoInstance.sumOdd(n);

        System.out.println("The sum of odd numbers is: "+result);

    }


}
