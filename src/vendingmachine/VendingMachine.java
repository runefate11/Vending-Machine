package vendingmachine;

// variables to create: array of snacks, array of quantities
// methods: return snacks, make selection, change inventory
public class VendingMachine {

    // below is suppose to be an array of objects snacks
    Snack[] snackArray = new Snack[16];
    
    
    /**
     * 
     */
    public VendingMachine() {
        snackArray[0] = new Snack("Doritos", "For the bold.", 1.00, 1.00, 4);
        snackArray[1] = new Snack("Lays", "Betcha can't eat just one.", 1.00, 1.00, 4);
        snackArray[2] = new Snack("Ruffles", "RRRuffles Have Ridges!", 1.00, 1.00, 4);
        snackArray[3] = new Snack("Cheetos", "It ain't easy bein' cheesy", 1.00, 1.00, 4);
        snackArray[4] = new Snack("Skittles", "Taste the rainbow.", 1.00, 1.00, 4);
        snackArray[5] = new Snack("M&M", "Melts in your mouth, not in your hand.", 1.00, 1.00, 4);
        snackArray[6] = new Snack("Starbursts", "Unexplainably juicy.", 1.00, 1.00, 4);
        snackArray[7] = new Snack("Twisters", "The twist you can't resist.", 1.00, 1.00, 4);
        snackArray[8] = new Snack("KitKat", "Have a break, have a Kit Kat.", 1.00, 1.00, 4);
        snackArray[9] = new Snack("Snickers", "You aren't you when you're hungry.", 1.00, 1.00, 4);
        snackArray[10] = new Snack("Mars", "Put some play in your day.", 1.00, 1.00, 4);
        snackArray[11] = new Snack("Oh Henry!", "Oh hungry?", 1.00, 1.00, 4);
        snackArray[12] = new Snack("Trident", "The great taste that is good for your teeth.", 1.00, 1.00, 4);
        snackArray[13] = new Snack("Hubba Bubba", "A WHOLE NEW KINDA BUBBLE!", 1.00, 1.00, 4);
        snackArray[14] = new Snack("5", "Stimulate your senses.", 1.00, 1.00, 4);
        snackArray[15] = new Snack("Juicy Fruit", "The gum with the fascinating artificial flavor.", 1.00, 1.00, 4);
    }


    // input is one of the snacks in the array list
    public String makeSelection(int snackIndex) {
        snackArray[snackIndex].setNumOfItem(snackArray[snackIndex].getNumOfItem() - 1);
        return snackArray[snackIndex].getName();
    }

    // change the number of that snack
    // the input is the array pos corresponding to that snack
    public void changeInventory() {
        
    }

    // give snack to user
    // input is the array pos corresponding to it
    public void giveSnack() {

    }
    
}
