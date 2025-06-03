interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            // put gorilla food into cage
            System.out.println("Gorilla Feeding Time.");
            return true;
        } else {
            System.out.println("Not Gorilla Feeding Time.");
            return false;
        }
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Gorilla Grooming Time.");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Pet Gorilla at your own risk.");
    }
}

public class Task16 {
    public static void main(String[] args) {
        Gorilla g = new Gorilla();

        g.feed(true);   // Gorilla Feeding Time.
        g.groom();      // Gorilla Grooming Time.
        g.pet();        // Pet Gorilla at your own risk.
    }
}
