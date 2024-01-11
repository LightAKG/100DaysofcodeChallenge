
public class Bitmanipulation {
    // There are four bit manipulation technique
    // 1. get bit
    // get the 3rd bit (position = 2) of a number n. (n = 0101)
    // bit mask: 1<<i;
    // Operation: AND
    // 1 << 2
    // 0001 << 2
    // 0100

    // 2. set bit
    // 3. clear bit
    // 4. update bit   

    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;

        if((bitMask & n) == 0){
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }
    }



}
