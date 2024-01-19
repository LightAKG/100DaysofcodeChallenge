//Place tiles of size 1*m in a floor of size n*m

public class PlaceTiles {
    
    public static int placeTile(int n, int m){
        if(n == m){
            return 2;
        }

        if(n < m){
            return 1;
        }

        //place vertically
        int vertPlacements = placeTile(n-m, m);

        //Place Horizontally
        int horPlacements = placeTile(n-1, m);

        return vertPlacements + horPlacements;
    }

    public static void main(String[] args) {
        int n = 3, m=3;
        System.out.println(placeTile(n, m));

    }
}
