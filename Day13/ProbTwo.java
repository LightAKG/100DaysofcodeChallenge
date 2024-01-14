class Student{
    public int roll_no;
    public String name;
    
    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class ProbTwo {

    public static void main(String[] args) {
        int array[] = {10,20,30,40,50};
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
        
        
        Student[] arr;
        //Create a new object of type student and initialize it with the values 101 "
        arr = new Student[5];
        arr[0] = new Student(1, "aman");
        arr[1] = new Student(2, "Vaibhav");
        arr[2] = new Student(3, "laxmi");
        arr[3] = new Student(4, "Muskan");
        
        for(int i=0; i<arr.length; i++){
            System.out.print("Element at "+ i + " : " + arr[i].roll_no + " " +arr[i].name);
        }
    }  
}
