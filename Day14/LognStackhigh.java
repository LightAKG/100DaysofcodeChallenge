
public class LognStackhigh {
    // print x^n(stack height = log n)

    public static int calcPower(int x, int n){
        if(n == 0){
            return 1;
        } 

        if( x == 0){
            return 0;
        }

        //if n is even 
        if(n % 2 == 0){
            return calcPower(x, n/2) * calcPower(x, n/2);
        } else {
            return calcPower(x, n/2) * calcPower(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int x = 3, n = 4;
        int ans = calcPower(x, n);
        System.out.println("Result: " + ans);
    }
}
