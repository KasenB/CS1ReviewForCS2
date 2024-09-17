// CoffeeDrink object class

class CoffeeDrink {

    int numberOfCups;
    String flavor;
    boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public CoffeeDrink(int paramNumberOfCups, String paramFlavor, boolean paramHasWhippedCream) {
        // TODO
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
        flavor = paramFlavor;
        numberOfCups = paramNumberOfCups;
        hasWhippedCream = paramHasWhippedCream;

    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        // TODO
        // Make this method print order details.
        // Include information stored in each variable.
        if (hasWhippedCream == true){
            System.out.println("Your drink has whipped cream");
        } else {
            System.out.println("your drink does not have whipped cream");
        }

    }
}
