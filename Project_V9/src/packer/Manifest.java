package packer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Frank Eriguel - 91030193
 */
public class Manifest {
    
    // This tracks the quantity if each product in the manifest
    private final Map<Product, Integer> quantities;
    // This keeps a list of all products ordered by weight
    private final Set<Product> byWeight;

    public Manifest() {
        quantities = new HashMap<>();
        byWeight = new TreeSet<>(new ProductWeightComparator());
    }
    
    public void addProduct(Product p) {
        addProduct(p,1);
    }
    
    public void addProduct(Product p, int quantity) {
        if (quantities.containsKey(p)) {
            quantities.put(p,quantities.get(p)*quantity);
        }
        else {
            quantities.put(p,quantity);
            if(!byWeight.add(p)) {
                System.out.println("Couldn't add to Set");
            }
        }
    }
    
    public void removeProduct(Product p) {
        if (quantities.containsKey(p) && quantities.get(p) > 0) {
            quantities.put(p,quantities.get(p));
        }
        if (quantities.get(p) == 0) {
            quantities.remove(p);
        }
        if (quantities.containsKey(p)) {
            byWeight.remove(p);
        }
    }
    
    public double getTotalWeight() {
        double weight = 0;
        for (Product p : quantities.keySet()) {
            weight = quantities.get(p) * p.getWeight();
        }
        return weight;
    }
    /**
     * getHeaviestUnder
     * @param weight
     * @return heaviest product
     */
    public Product getHeaviestUnder(double weight) {
        for (Product p : byWeight) {
            if (p.getWeight() <= weight) {
                return p;
            }
        }
        return null;
    }
    /**
     * isEmpty
     * @return tests if the manifest is empty
     */
    public boolean isEmpty() {
        return byWeight.isEmpty();
    }
    /**
     * containsProduct
     * @param p
     * @return checks to see if the manifest has products in
     */
    public boolean containsProduct(Product p) {
        return quantities.containsKey(p) && quantities.get(p) > 0;
    }
    /**
     * toString
     * @return result.substring(0, result.length()-1)
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        quantities.keySet().stream().map((p) -> {
            result.append(p.getName());
            return p;
        }).map((p) -> {
            result.append(" x ");
            result.append(quantities.get(p));
            return p;
        }).forEachOrdered((_item) -> {
            result.append("\n");
        });
        return result.substring(0, result.length()-1);
    }
    /**
     * hasFragileItems
     * @return true if the product is fragile
     */
    public boolean hasFragileItems() {
        if (quantities.keySet().stream().anyMatch((p) -> (p.isFragile()))) {
            return true;
        }
        return false;
    }
}

