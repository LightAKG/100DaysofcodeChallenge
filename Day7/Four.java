import java.util.*;
public class Four {
    // Write a function that takes in the radius as input and returns the circumference of a circle.
    public double circumference(int r){
        return 2 * Math.PI * r;
    }   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for radius:");
        int r = sc.nextInt();

        Four res = new Four();
        double result = res.circumference(r);
        System.out.println("The circumference of a cirle which is having radius " +r+ " is " +result);
    }
    
}
