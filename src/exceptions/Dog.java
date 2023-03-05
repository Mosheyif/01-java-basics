package exceptions;

/**
 * Dogs!!
 */
public class Dog extends Pet {

    private String specyName;

    /**
     * ctor for Dog
     * @param specyName the name of the species
     * @param owner the owner of the dog
     * @throws DogException if specyName is null
     *
     */
    public Dog (String specyName, String owner) throws DogException {
        super(specyName, owner);
        // ctor Animal
        if (specyName == null)
            throw new DogException("Dog specy name cannot be null");
    }

    /** Dog says something
     * @see Pet#saySomething()
     */
    @Override
    public void saySomething() {
        System.out.println("bark bark!");
    }

}
