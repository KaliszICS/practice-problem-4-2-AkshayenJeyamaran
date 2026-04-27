/**
 * Class to define a car
 * @author Akshayen Jeyamaran
 * @version 1.0.0
 */
public class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    /**
     * Constructor for Car class
     * @param make Make of the car
     * @param model Model of the car
     * @param year Year the model was released
     * @param price Price paid for the car
     */
    public Car(String make, String model, int year, double price) {
        this.make = make; 
        this.model = model;
        this.year = year;
        this.price = price;
    }
    /**
     * Method to get make of the car
     * @return Make of the car
     */
    public String getMake() {
        return this.make;
    }
     /**
     * Method to get make of the car
     * @return Make of the car
     */
    public String getModel() {
        return this.model;
    }
     /**
     * Method to get year the car model released
     * @return Year of release of the car model
     */
    public int getYear() {
        return this.year;
    }
     /**
     * Method to get price of the car
     * @return Price paid for the car
     */
    public double getPrice() {
        return this.price;
    }
    /**
     * Sets value of make
     * @param make Make of the car
     */
    public void setMake(String make) {
        this.make = make;
    }
     /**
     * Sets value of model
     * @param make Model of the car
     */
    public void setModel(String model) {
        this.model = model;
    }
     /**
     * Sets value of year
     * @param make Year the model was released
     */
    public void setYear(int year) {
        this.year = year;
    }
     /**
     * Sets value of price
     * @param make Price paid for the car
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
