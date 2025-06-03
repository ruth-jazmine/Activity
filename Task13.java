class Vhcl {
    protected String mk;
    protected String mdl;
    protected int yr;

    public Vhcl(String mk, String mdl, int yr) {
        this.mk = mk;
        this.mdl = mdl;
        this.yr = yr;
    }
}

class Car extends Vhcl {
    private int numofDrs;

    public Car(String mk, String mdl, int yr, int numofDrs) {
        super(mk, mdl, yr); // Call the Vehicle constructor
        this.numofDrs = numofDrs;
    }

    public void displayDeets() {
        System.out.println("Car Details:");
        System.out.println("Make: " + mk);
        System.out.println("Model: " + mdl);
        System.out.println("Year: " + yr);
        System.out.println("Number of Doors: " + numofDrs);
    }
}

public class Task13 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022, 4);
        myCar.displayDeets();
    }
}
