
public class ArrSum {
    public static void main(String[] args) {
        int array[] = { 10, 5, 7, 2, 8};
        int sum = calculateArraySum(array);
        System.out.println(" The sum of all elements of array is: "+sum );

    }

    static int calculateArraySum(int[] array){
        if(array == null || array.length == 0){
            throw new IllegalArgumentException("Array is empty.");
        }

        int sum = 0;

        for(int i=0; i<array.length; i++){
            sum += array[i];
        }

        return sum;
    }
}
