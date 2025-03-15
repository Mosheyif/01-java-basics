package exceptions;

public class Main {

    public static void main(String[] args) {
        try {
            Pet dog = new Dog("Snoopy", "John");
            dog.saySomething();
            String specyName = null;
            new Dog(specyName, "John"); // this will throw an exception
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}
