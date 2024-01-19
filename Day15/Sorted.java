

public class Sorted {
//check if an array is sorted or not (return true if sorted else return false)in increasing order.

public static boolean isSorted(int arr[], int idx){
    if(idx == arr.length-1){
        return true;
    }

    if(arr[idx] < arr[idx+1]){
        //arr is sorted till now
        return isSorted(arr, idx+1);
    } else {
        return false;
    }
}

    public static void main(String[] args) {
        int arr[] = {6,3,5};
        System.out.println(isSorted(arr, 0));
    }

}
