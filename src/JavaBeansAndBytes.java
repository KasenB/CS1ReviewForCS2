import java.util.Random;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;

    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    // Constructor for CoffeeShop
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 1995;

        System.out.println("Welcome to " + name + "!");
        if (isOpen) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");

        // to-do done
        yearFounded = 2007;
        System.out.println("Jk. We were actually founded in " + yearFounded + ".");
        // Update the year founded and print the new yearFounded in a sentence

        // Calling methods
        randomDiscount();
        // to do done
        // Add parameter to specialOfTheDay (drink of your choice)
        specialOfTheDay("hot chocolate");
        countCups();
        baristasChoice();

        // TODO
        // Create two CoffeeDrink objects



        // TODO
        // Print out the order details


    }

    // Method to generate a random discount
    public void randomDiscount() {
        // TODO
        int randomDiscount = (int) (Math.random()*31);
        // Make this method generate a random integer discount (0-30%)
        // and print the result.
        System.out.println("Your random discount of the day is " + randomDiscount + "%!");
    }

    // Method with a parameter for the special of the day
    public void specialOfTheDay(String special) {
        // to do done
        // Make this method accept a parameter representing the day’s special.
        // Print the day's special.
        System.out.println("Today's special is " + special + ".");
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");

        // to do done
        // Write three different for loops that print the indicated numbers:

        // Print 1 to 5
//        for (int x = 1; x <= 5; x++){
//            System.out.print(x + " ");
//        }


        // Print 2, 5, 8, 11
        for (int x = 2; x <= 11; x = x + 3){
            System.out.print(x + ", ");
        }

        // Print 8 to 0
//        for (int x = 8; x >=0; x = x - 1){
//            System.out.print(x);
//        }

    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        // TODO
        // Make this method generate a random decimal between 0 and 1
        // and print one of four drink recommendations based on its value.
        double randNum = (double) Math.random();
        if ( randNum < 0.25) {
            System.out.println("You should get a black coffee");
        }
        else if (randNum < 0.5) {
            System.out.println("You should get an espresso");
        }
        else if (randNum < 0.75){
            System.out.println("You should get bottle of water");
        }
        else if (randNum < 1){
            System.out.println("You should go home");
        }
    }
}

