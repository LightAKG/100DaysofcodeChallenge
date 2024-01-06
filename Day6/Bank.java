package bank;

class Account {
    public String name;
    protected String email;
    private String password;

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}

public class Bank {
//  in java there are four access identifier
// 1.public  2.private  3.protected  4.Default

// To access Private we have to use getters and setters
public static void main(String args[]){
    Account account1 = new Account();
    account1.name = "Dash";
    account1.email = "Dbby@gmail.com";
    account1.setPassword("abcd"); 
    System.out.println(account1.getPassword());
}
}


// #what is encapsulation?
// It promotes the binding of data and methods in a single unit. In Java, encapsulation can be achieved through the creation of private fields and public methods. These private fields can be accessed only by the methods of the same class. This creates a protective layer around the fields and makes it difficult for outside code to access them directly.

// what is abstraction
// Data hiding is the process of protecting members of class from unintended changes whereas, abstraction is hiding the implementation details and showing only important/useful parts of the user.
