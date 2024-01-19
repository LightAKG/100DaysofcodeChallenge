
public class MazePath {

    public static int countPaths ( int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }

        if(i == n-1 && j == n-1){
            return 1;
        }

        //move downwards
        int downPaths = countPaths(i+1, j, m, n);

        //move right
        int rightPaths = countPaths(i, j+1, m, n);
        return downPaths + rightPaths;
    }

    public static void main (String args[]){
        int n = 3, m = 3;
        int totatPaths = countPaths(0, 0, n, m);
        System.out.println("Total number of paths are : " + totatPaths);
    }
}
