class Pen{
    String color;
    String type; //ballpoint; gel

    public void write(){
        System.out.println("Writing Something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.age);
        System.out.println(this.name);
    }

    // Student() {   //1. non-parametrized constructor
    //     System.out.println("Constructor called");
    // }

    Student(String name, int age){ //parametrized constructor
        this.name = name;
        this.age = age;
    }

    // copy constructor- it makes copy of one object and insert into another.
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}

// java doesnt have destructor because it has garbage collector.


class Oops {
    // public static void main(String[] args) {
    //     Pen pen1 = new Pen();
    //     pen1.color = "blue";
    //     pen1.type = "gel";

    //     Pen pen2 = new Pen();
    //     pen2.color = "black";
    //     pen2.type = "ballpoint";
        
    //     pen1.printColor();
    //     pen2.printColor();
    // }

    public static void main(String[] args) {
        // Student s1 = new Student("aman", 23);
        // s1.name = "aman";
        // s1.age = 12; 


        // s1.printInfo();
        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 22;


        Student s2 = new Student(s1);
        s2.printInfo();
    }
}
