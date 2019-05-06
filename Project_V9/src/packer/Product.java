package packer;

/**
 *
 * @author Frank Eriguel - 91030193
 */
public class Product {

    private String name;
    private int weight;
    private boolean hazardous;
    private boolean fragile;

    public Product(String name, int weight, boolean hazardous, boolean fragile) {
        this.name = name;
        this.weight = weight;
        this.hazardous = hazardous;
        this.fragile = fragile;
    }

    /**
     * getWeight
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * getName
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * isHazardous
     * @return the hazardous
     */
    public boolean isHazardous() {
        return hazardous;
    }

    /**
     * isFragile
     * @return the fragile
     */
    public boolean isFragile() {
        return fragile;
    }
/**
 * toString
 * @return this.getName
 */
    public String toString() {
        return this.getName();
    }
    /**
     * equals
     * @param o float
     * @return false if products are not equal
     */
    public boolean equals(Object o) {
        if (!(o instanceof Product)) {
            return false;
        }
        Product p = (Product)o;
        return p.getName().equals(this.getName());
    }
    
}
