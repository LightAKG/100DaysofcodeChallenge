class Swap{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping value of a is "+a+ " and value of b is "+b);
        
        //logic 1 - using temp variable
        // int t = a;
        // a = b;
        // b = t;
        // System.out.println("After swapping value of a is "+a+ " and value of b is "+b);
        
        
        //logic 2 = using + and - without using 3rd variable
        // a = a + b;
        // b = a - b;
        // a = a - b;
        // System.out.println("After swapping value of a is "+a+ " and value of b is "+b);
        
        // logic 3 muliplication and division a is b should not be zero
        // a = a*b;
        // b = a/b;
        // a = a/b;
        // System.out.println("After swapping value of a is "+a+ " and value of b is "+b);

    }
}
