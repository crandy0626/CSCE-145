// Christopher Randolph
// Frame class for Bicycle Lab

public class Frame {

    // ----------------------
    // Instance Variables
    // ----------------------
    private double size;        // 18.5–60 inclusive
    private String type;        // Diamond, Step-Through, Truss, Penny-Farthing

    public static final double DEFAULT_SIZE = 18.5;
    public static final String DEFAULT_TYPE = "Diamond";

    // ----------------------
    // Constructors
    // ----------------------
    public Frame() {
        this.size = DEFAULT_SIZE;
        this.type = DEFAULT_TYPE;
    }

    public Frame(double size, String type) {
        setSize(size);
        setType(type);
    }

    // ----------------------
    // Accessors
    // ----------------------
    public double getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    // ----------------------
    // Mutators
    // ----------------------
    public void setSize(double size) {
        if (size >= 18.5 && size <= 60)
            this.size = size;
        else
            this.size = DEFAULT_SIZE;
    }

    public void setType(String type) {
        if (type != null &&
            (type.equalsIgnoreCase("Diamond") ||
             type.equalsIgnoreCase("Step-Through") ||
             type.equalsIgnoreCase("Truss") ||
             type.equalsIgnoreCase("Penny-Farthing")))
            this.type = type;
        else
            this.type = DEFAULT_TYPE;
    }

    // ----------------------
    // Equals
    // ----------------------
    public boolean equals(Frame other) {
        return other != null &&
               this.size == other.size &&
               this.type.equalsIgnoreCase(other.type);
    }

    // ----------------------
    // toString
    // ----------------------
    @Override
    public String toString() {
        return "[Frame] Size: " + size + " Type: " + type;
    }
}
