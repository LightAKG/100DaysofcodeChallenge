package DayTwelve;

public class SelectionSort {
    //Selection sort = it runs iteration, in first iteration it takes the smallest number and placed it in first position. it runs iteration until all the numbers are sorted.

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3, 7, 4, 2, 8};
        
        // time complexity = O(n^2)
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] =  arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
}
