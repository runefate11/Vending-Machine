package vendingmachine;

// variables to create: array of snacks, array of quantities
// methods: return snacks, make selection, change inventory
public class VendingMachine {

    // below is suppose to be an array of objects snacks
    Snack[] snackArray = new Snack[16];
    
    
    // constructor
    public VendingMachine() {
        snackArray[0] = new Snack("", "", 1.00, 1.00, 4);
        snackArray[1] = new Snack("", "", 1.00, 1.00, 4);
        snackArray[2] = new Snack("", "", 1.00, 1.00, 4);
        snackArray[3] = new Snack("", "", 1.00, 1.00, 4);
        snackArray[4] = new Snack("", "", 1.00, 1.00, 4);
        snackArray[5] = new Snack("", "", 1.00, 1.00, 4);
        snackArray[6] = new Snack("", "", 1.00, 1.00, 4);
        snackArray[7] = new Snack("", "", 1.00, 1.00, 4);
    }

    // input is one of the snacks in the array list
    public void makeSelection() {

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
