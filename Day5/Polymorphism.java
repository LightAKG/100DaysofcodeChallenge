public class Polymorphism {
    // poly = many
    // morphism = forms

    // using same function for different purpose - polymorphism

    //function overloading - when a same function performs different
}

class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name +" "+ age);
    }
}

public class Poly{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 32;

        s1.printInfo(s1.age);
    }
}
