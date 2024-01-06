class Student{
    String name;
    static String school;
}

public class Static {
    public static void main(String[] args) {
        Student.school = "JVM";
        Student student1 = new Student();   
        student1.name = "tony";
        System.out.println(student1);
    }
}


// We declare static keyword to those argument which needs to be common in all class or variable
