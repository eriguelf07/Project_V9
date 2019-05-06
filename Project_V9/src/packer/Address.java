package packer;

/**
 *
 * @author Frank Eriguel - 91030193
 */
public class Address {
    private String street;
    private String suburb;
    private String city;
    private String postcode;
    private Coordinates coordinates;
/**
 * Initializes variables
 * @param street string
 * @param suburb string
 * @param city string
 * @param postcode string
 * @param coordinates coordinates
 */
    public Address(String street, String suburb, String city, String postcode, Coordinates coordinates) {
        this.street = street;
        this.suburb = suburb;
        this.city = city;
        this.postcode = postcode;
        this.coordinates = coordinates;
    }
/**
 * toString
 * @return street + "\n" +
                suburb + "\n" +
                city + "\n" +
                postcode;
 */
    public String toString() {
        return 
                street + "\n" +
                suburb + "\n" +
                city + "\n" +
                postcode;
    }
    /**
     * getCoordinates
     * @return the coordinates
     */
    public Coordinates getCoordinates() {
        return coordinates;
    }

    
}
