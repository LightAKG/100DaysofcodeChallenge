import java.util.*;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //using algo - we can reverse a number
        int rev = 0;
        while(num != 0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        System.out.println("Reverse Number is "+rev);
    }
}
