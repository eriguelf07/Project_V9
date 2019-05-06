package packer;

/**
 *
 * @author Frank Eriguel - 91030193
 */
public class Depot {
    private String name;
    private Address address;
/**
 * Initializes variables
 * @param name String
 * @param address address
 */
    public Depot(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    /**
     * getName
     * @return name String
     */
    public String getName() {
        return name;
    }
    /**
     * getCoordinates
     * @return this.address.getCoordinates
     */
    public Coordinates getCoordinates() {
        return this.address.getCoordinates();
    }
    
    public String toString() {
        return this.getName();
    }
    
}
