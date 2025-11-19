// Christopher Randolph
// Bicycle class for Bicycle Lab

public class Bicycle {

    // ----------------------
    // Instance Variables
    // ----------------------
    private String make;       // non-null, default “none”
    private Wheel frontWheel;  // default Wheel()
    private Wheel backWheel;   // default Wheel()
    private Frame frame;       // default Frame()

    public static final String DEFAULT_MAKE = "none";

    // ----------------------
    // Constructors
    // ----------------------
    public Bicycle() {
        this.make = DEFAULT_MAKE;
        this.frontWheel = new Wheel();
        this.backWheel = new Wheel();
        this.frame = new Frame();
    }

    public Bicycle(String make, Wheel front, Wheel back, Frame frame) {
        setMake(make);
        setFrontWheel(front);
        setBackWheel(back);
        setFrame(frame);
    }

    // ----------------------
    // Accessors
    // ----------------------
    public String getMake() {
        return make;
    }

    public Wheel getFrontWheel() {
        return frontWheel;
    }

    public Wheel getBackWheel() {
        return backWheel;
    }

    public Frame getFrame() {
        return frame;
    }

    // ----------------------
    // Mutators
    // ----------------------
    public void setMake(String make) {
        if (make != null)
            this.make = make;
        else
            this.make = DEFAULT_MAKE;
    }

    public void setFrontWheel(Wheel frontWheel) {
        if (frontWheel != null)
            this.frontWheel = frontWheel;
        else
            this.frontWheel = new Wheel();
    }

    public void setBackWheel(Wheel backWheel) {
        if (backWheel != null)
            this.backWheel = backWheel;
        else
            this.backWheel = new Wheel();
    }

    public void setFrame(Frame frame) {
        if (frame != null)
            this.frame = frame;
        else
            this.frame = new Frame();
    }

    // ----------------------
    // Equals
    // ----------------------
    public boolean equals(Bicycle other) {
        return other != null &&
               this.make.equalsIgnoreCase(other.make) &&
               this.frontWheel.equals(other.frontWheel) &&
               this.backWheel.equals(other.backWheel) &&
               this.frame.equals(other.frame);
    }

    // ----------------------
    // toString
    // ----------------------
    @Override
    public String toString() {
        return "[Bicycle] Make: " + make +
               " Front Wheel: " + frontWheel +
               " Back Wheel: " + backWheel +
               " Frame: " + frame;
    }
}
