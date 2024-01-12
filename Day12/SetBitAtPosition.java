public class SetBitAtPosition {

    public static void main(String[] args) {
        int num = 5; 
        int position = 2; 

        int result = setBit(num, position);

        System.out.println("After setting bit at position " + position + ": " + result);
    }

    static int setBit(int num, int position) {
        if (position < 0 || position >= Integer.SIZE) {
            throw new IllegalArgumentException("Invalid bit position");
        }

        return num | (1 << position);
    }
}
