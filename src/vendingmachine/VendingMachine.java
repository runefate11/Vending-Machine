package vendingmachine;

// variables to create: array of snacks, array of quantities
// methods: return snacks, make selection, change inventory
//Devanjith
public class VendingMachine {

    // below is suppose to be an array of objects snacks
    Snack[] snackArray = new Snack[16];

    /**
     * This is the array of the snacks.
     */
    public VendingMachine() {
        snackArray[0] = new Snack("Doritos", "For the bold. Does not contain nuts.", 1.00, 1.45, 4);
        snackArray[1] = new Snack("Lays", "Betcha can't eat just one. Does not contain nuts.", 1.00, 2.00, 4);
        snackArray[2] = new Snack("Ruffles", "RRRuffles Have Ridges! Does not contain nuts.", 1.00, 2.00, 4);
        snackArray[3] = new Snack("Cheetos", "It ain't easy bein' cheesy. Contain nuts.", 1.00, 2.00, 4);
        snackArray[4] = new Snack("Skittles", "Taste the rainbow. Does not contain nuts.", 1.00, 2.00, 4);
        snackArray[5] = new Snack("M&M", "Melts in your mouth, not in your hand. Contains nuts.", 1.00, 2.00, 4);
        snackArray[6] = new Snack("Starbursts", "Unexplainably juicy. Does not contain nuts.", 1.00, 2.00, 4);
        snackArray[7] = new Snack("Twizzlers", "The twist you can't resist. Does not contain nuts.", 1.00, 2.00, 4);
        snackArray[8] = new Snack("KitKat", "Have a break, have a Kit Kat. Does not contain nuts.", 1.00, 2.00, 4);
        snackArray[9] = new Snack("Snickers", "You aren't you when you're hungry. Contains nuts.", 1.00, 2.00, 4);
        snackArray[10] = new Snack("Mars", "Put some play in your day. Contains nuts.", 1.00, 2.00, 4);
        snackArray[11] = new Snack("Oh Henry!", "Oh hungry? Contains nuts.", 1.00, 2.00, 4);
        snackArray[12] = new Snack("Trident", "The great taste that is good for your teeth. Does not contain peanuts.", 1.00, 2.00, 4);
        snackArray[13] = new Snack("Hubba Bubba", "A WHOLE NEW KINDA BUBBLE! Does not contain peanuts.", 1.00, 2.00, 4);
        snackArray[14] = new Snack("5", "Stimulate your senses. Does not contain peanuts.", 1.00, 2.00, 4);
        snackArray[15] = new Snack("Juicy Fruit", "The gum with the fascinating artificial flavor. Does not contain nuts.", 1.00, 2.00, 4);
    }

    /**
     * reset number of items to 4
     */
    public void resetStockOfSnacks() {
        for (int count = 0; count <= 15; count++) {
            snackArray[count].setNumOfItem(4);
        }
    }

    /**
     * Checks if snack is available,
     *
     * @param snackIndex users choice of snack
     * @return false being not available true being available
     */
    public boolean checkAvailability(int snackIndex) {
        if (snackArray[snackIndex].getNumOfItem() == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void makeSelection(int snackIndex) {
        snackArray[snackIndex].setNumOfItem(snackArray[snackIndex].getNumOfItem() - 1);
    }

}
