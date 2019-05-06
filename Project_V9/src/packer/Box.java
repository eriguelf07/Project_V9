package packer;

/**
 *
 * @author Frank Eriguel - 91030193
 */

public class Box {
    
    
    private Manifest contents;
    private Customer customer;
    private Depot depot; 
/**
 * Initializes variables
 * @param customer string
 * @param depot string
 */
    public Box(Customer customer, Depot depot) {
        this.customer = customer;
        this.depot = depot;
        contents = new Manifest();
    }
    /**
     * addProduct
     * @param product string
     */
    
    public void addProduct(Product product) {
        if (canFit(product)) {
            contents.addProduct(product, 1);
        }
    }
    
    
    
    public void addProduct(Product product, int quantity) {
        if (canFit(product,quantity)); {
            contents.addProduct(product, quantity);
        }
    }
   /**
    * getLabel
    * @return return label.toString
    */
    public String getLabel() {
        StringBuilder label = new StringBuilder();
        label.append(customer);
        label.append("\n");
        label.append(customer.getClosestAddressTo(depot));
        label.append("\n");
        label.append(contents.toString());
        label.append("\n");
        if (this.isFragile()) {
            label.append("FRAGILE\n");
        }
        return label.toString();
    }
    /**
     * toString
     * @return getLabel
     */
    public String toString() {
        return getLabel();
    }
    //Changed getWeight to Total Weight
    /**
     * getWeight
     * @return gets Total weight
     */
    public double getWeight() {
        return contents.getTotalWeight();
    }
    //COMMENTED ADDPRODUCT OUT BECAUSE ITS A DUPLICATE
    /*
    public void addProduct(Product product) {
        if (canFit(product)) {
            contents.addProduct(product, 1);
        }
    }*/
    //changed 40 to 20
    public boolean canFit(Product p) {
        return p.getWeight() < 20;
    }
    //changed 40 to 20
    public boolean canFit(Product p, int quantity) {
        return (p.getWeight() * quantity) < 20;
    }
    //changed 40 to 20
    public double remainingCapacity() {
        return 20 - this.getWeight();
    }
    
    public boolean isFragile() {
        return contents.hasFragileItems();
    }
    //changed return false to contents.hasFragileItems()
    public boolean isHazardous() {
        //if its hazardous its fragile kaboom!
        return contents.hasFragileItems();
    }
}
