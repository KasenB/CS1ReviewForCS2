// CoffeeDrink object class

class Drink {

    int numberOfCups;
    String type;
    boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public Drink(int numberOfCups, String type, boolean hasWhippedCream) {
        // to-do done
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
        this.type = type;
        this.numberOfCups = numberOfCups;
        this.hasWhippedCream = hasWhippedCream;

    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        // to-do done
        // Make this method print order details.
        // Include information stored in each variable.
        System.out.print("You ordered " + numberOfCups + " cups of " + type);
        if (hasWhippedCream){
            System.out.println("with whipped cream.");
        }
        else {
            System.out.println("without whipped cream");
        }

    }
}
