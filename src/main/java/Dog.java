public class Dog {
    // instance variables
    private String name;
    private String breed;
    private int weight;

    /**
     * Constructor that creates a Dog object.
     *
     * @param name the name of the dog
     * @param breed the breed of the dog
     * @param weight the weight of the dog
     */
    public Dog(String name, String breed, int weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }
    /**
     * Gets the dog's name.
     *
     * @return returns the dog's name
     */
    public String getName() {
        return this.name;
    }
    public String getBreed() {
        return this.breed;
    }

     /**
     * Method to get the weight of the dog
     * @return Returns the value of weight
     */
    public int getWeight() {
        return this.weight;
    }

     /**
     * Sets the value of name
     * @param name Name of the dog
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the value of breed
     * @param breed Breed of the dog
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }
    /**
     * Sets the value of weight
     * @param weight Weight of the dog
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
