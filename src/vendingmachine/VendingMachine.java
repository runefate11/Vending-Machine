package vendingmachine;

// variables to create: array of snacks, array of quantities
// methods: return snacks, make selection, change inventory
public class VendingMachine {

    // below is suppose to be an array of objects snacks
    Snack[] snackArray = new Snack[16];

    /**
     * This is the array of the snacks
     */
    public VendingMachine() {
        snackArray[0] = new Snack("Doritos", "", 1.00, 1.00, 4);
        snackArray[1] = new Snack("Lays", "", 1.00, 1.00, 4);
        snackArray[2] = new Snack("Ruffles", "", 1.00, 1.00, 4);
        snackArray[3] = new Snack("Cheetos", "", 1.00, 1.00, 4);
        snackArray[4] = new Snack("Skittles", "", 1.00, 1.00, 4);
        snackArray[5] = new Snack("M&M", "", 1.00, 1.00, 4);
        snackArray[6] = new Snack("Starbursts", "", 1.00, 1.00, 4);
        snackArray[7] = new Snack("Twisters", "", 1.00, 1.00, 4);
    }

    /**
     * Tells if the snack is available. If it is available, it reduces the
     * stock by 1
     * @param snackIndex the user input choosing
     * @return gives the user the snack or tells that there is none available
     */
    public String makeSelection(int snackIndex) {
        if (snackArray[snackIndex].getNumOfItem() <= 0) {
            return "Snack not available. Please make another selection.";
        } else {
            snackArray[snackIndex].setNumOfItem(snackArray[snackIndex].getNumOfItem() - 1);
            return "Here is your " + snackArray[snackIndex].getName() + ".";
        }
    }
}
