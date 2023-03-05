package exceptions;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello!");
        try {
            Pet dog = new Dog("Snoopy", "John");
            dog.saySomething();
            dog = new Dog(null, "John"); // this will throw an exception
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}
