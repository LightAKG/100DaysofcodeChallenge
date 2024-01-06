abstract class Feature {
    abstract void walk();
    Feature(){
        System.out.println("You are a animal.");
    }
    public void eats(){
        System.out.println("Animals eats");
    }
}

class Horse extends Feature{
    Horse(){
        System.out.println("created a horse.");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Hen extends Feature{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Animal{
  public static void main(String[] args) {
    Horse horse = new Horse();
    horse.walk();
  }
}

// When you declare constructor inside inheritance then it will run all the constructor which is known as chaining of constructor.
