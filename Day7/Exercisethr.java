import java.util.Scanner;

public class Exercisethr {

   public static int greatest(int a, int b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        int result = greatest(a, b);
        System.out.println("The greatest of "+a+" and "+b+ " is: "+result);
    } 
}
