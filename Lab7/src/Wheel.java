// Christopher Randolph
// Wheel class for Bicycle Lab

public class Wheel {

    // ----------------------
    // Instance Variables
    // ----------------------
    private double diameter;   // 16–55 inclusive, default 16
    private double width;      // 1–2.5 inclusive, default 1

    public static final double DEFAULT_DIAMETER = 16.0;
    public static final double DEFAULT_WIDTH = 1.0;

    // ----------------------
    // Constructors
    // ----------------------
    public Wheel() {
        // Default constructor
        this.diameter = DEFAULT_DIAMETER;
        this.width = DEFAULT_WIDTH;
    }

    public Wheel(double diameter, double width) {
        setDiameter(diameter);
        setWidth(width);
    }

    // ----------------------
    // Accessors
    // ----------------------
    public double getDiameter() {
        return diameter;
    }

    public double getWidth() {
        return width;
    }

    // ----------------------
    // Mutators
    // ----------------------
    public void setDiameter(double diameter) {
        if (diameter >= 16 && diameter <= 55)
            this.diameter = diameter;
        else
            this.diameter = DEFAULT_DIAMETER;
    }

    public void setWidth(double width) {
        if (width >= 1 && width <= 2.5)
            this.width = width;
        else
            this.width = DEFAULT_WIDTH;
    }

    // ----------------------
    // Equals
    // ----------------------
    public boolean equals(Wheel other) {
        return other != null &&
               this.diameter == other.diameter &&
               this.width == other.width;
    }

    // ----------------------
    // toString
    // ----------------------
    @Override
    public String toString() {
        return "[Wheel] Diameter: " + diameter + " Width: " + width;
    }
}
