import java.util.Scanner;
public class Eight {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base number:");
        int base = sc.nextInt();

        System.out.println("Enter Power number:");
        int power = sc.nextInt();

        double result = Math.pow(base, power);
        System.out.println(base+ "raised to the power" +power+ "is :" + result);

        sc.close();
    }
}
