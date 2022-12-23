// abstract class
abstract class Abstraction {
    public String fname = "John";
    public String lname =  "Michaelson";
    public int age = 24;
    public abstract void study(); // abstract method created within the abstract class but does not have a body.
}

// Subclass (inherit from Main)
class Student_Abstraction extends Abstraction {
    public int graduationYear = 2018;
    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long. Also," +
                "this is a method accessed through myObj which is an object in the subclass called" +
                " Student_Abstraction which " +
                "extends or is a subclass of the main class called Abstraction." +
                " This is some really dope stuff here. This is the concept of abstraction basically.");
    } // the body of the abstract method is
    //contained here.
}
