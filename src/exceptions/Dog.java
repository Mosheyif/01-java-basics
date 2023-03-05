package exceptions;

/**
 * Dogs!!
 */
public class Dog extends Pet {

    private String specyName;

    /**
     *
     * @param specyName the name of the species
     */
    public Dog (String specyName, String owner) throws DogException {
        super(specyName, owner);
        // ctor Animal
        if (specyName == null)
            throw new DogException("Dog specy name cannot be null");
    }

    @Override
    public void saySomething() {
        System.out.println("bark bark!");
    }

}
