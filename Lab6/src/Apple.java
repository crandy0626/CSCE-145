// Apple.java
// Author: Christopher Randolph
// Represents an Apple with type, weight, and price.

public class Apple {
    private String type;
    private double weight;
    private double price;

    // Default values
    private static final String DEFAULT_TYPE = "Gala";
    private static final double DEFAULT_WEIGHT = 0.0;
    private static final double DEFAULT_PRICE = 0.0;

    // Valid types
    private static final String[] VALID_TYPES = {
        "Red Delicious", "Golden Delicious", "Gala", "Granny Smith"
    };

    // Default constructor
    public Apple() {
        this.type = DEFAULT_TYPE;
        this.weight = DEFAULT_WEIGHT;
        this.price = DEFAULT_PRICE;
    }

    // Parameterized constructor
    public Apple(String type, double weight, double price) {
        setType(type);
        setWeight(weight);
        setPrice(price);
    }

    // Accessors
    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    // Mutators
    public void setType(String type) {
        if (isValidType(type)) {
            this.type = type;
        } else {
            this.type = DEFAULT_TYPE;
        }
    }

    public void setWeight(double weight) {
        if (weight >= 0.0 && weight <= 2.0) {
            this.weight = weight;
        } else {
            this.weight = DEFAULT_WEIGHT;
        }
    }

    public void setPrice(double price) {
        if (price >= 0.0) {
            this.price = price;
        } else {
            this.price = DEFAULT_PRICE;
        }
    }

    // Helper method to validate type
    private boolean isValidType(String t) {
        if (t == null) return false;
        for (String valid : VALID_TYPES) {
            if (valid.equals(t)) return true;
        }
        return false;
    }

    // toString method
    public String toString() {
        return "Type: " + type + " Weight " + weight + " Price " + price;
    }

    // equals method
    public boolean equals(Apple other) {
        return this.type.equals(other.type) &&
               this.weight == other.weight &&
               this.price == other.price;
    }
}
