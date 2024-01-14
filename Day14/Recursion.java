
public class Recursion {
    // A function that calls itself
    //print a number 5 to 1
    // for(int i=5; i>0; i--){system.out.println(i)}

    public static void printNum(int n){
        if(n == 6){
            return;
        }
        System.out.println(n);
        printNum(n + 1);

    }

    public static void main(String[] args) {
        int n = 1;
        printNum(n);
    }

}
