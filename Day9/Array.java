import java.util.Scanner;
public class Array {
    // defining an array 
    // type[]  arrayName = new type[size];
    public static void main(String[] args) {
        //1.  int[] marks = new int[3];
        // 2. int marks[] = new int[3];
        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 92;
        // System.out.println(marks[0]);

        // for(int i=0; i<=2; i++){
        //     System.out.println(marks[i]);
        // }
        

        // When we know the size of an array 
        // type[] arrayName = {1,2,3,4,5,6};
        // int marks[] = {97,98,99};
        //  for(int i=0; i<=2; i++){
        //      System.out.println(marks[i]);
        //  }

        // Here user will put the size of the array.
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int numbers[] = new int[size];
        
        // for(int i=0; i<size; i++){
            //     numbers[i] = sc.nextInt();
            // }
            
            // for(int i=0; i<size; i++){
                //     System.out.println(numbers[i]);
                // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];


        System.out.println("Enter the elements of the array:");
        for(int i=0; i<size; i++){
            System.out.println("Enter elements "+ (i+1 )+ ":");
            array[i] = sc.nextInt();
        }

        for(int i=0; i<size; i++){
            System.out.println(array[i] + " ");
        }

        sc.close();
    }
}
