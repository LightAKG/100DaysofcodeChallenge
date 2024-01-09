import java.util.*;
public class TwoD {
 
    // defining two-D array
    // type[][] arrayName = new type[rows][columns];
    // int[][] numbers = new int[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        //rows
        for(int i=0; i<rows; i++){
            //columns 
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<rows; i++){
            for( int j=0; j<cols; j++){
                System.out.println(numbers[i][j]+ " ");
            }
        }
    }
}
