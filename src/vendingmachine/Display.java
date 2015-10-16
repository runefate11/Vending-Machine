package vendingmachine;

import java.util.Scanner; // import for keyabord use

/**
 * Main Body program for the vending machine
 * By: Devanjith (1st half of functionality) and Gregory (2nd half)
 */
public class Display {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //create objects
        VendingMachine vm = new VendingMachine();
        Money m = new Money();

        // declare variables for inputting each denomination
        int toonie, loonie, quarter, dime, nickel, index;

        double input; //Total value of user money input
        int userChoice; //user's choice in a list of commands

        // loop thorugh the program until the user wants to stop using machine
        do {
            // display instructions
            System.out.println("");
            System.out.println("Please select what you would like to do below...");
            System.out.println("0 - reset number of coins to set amount");
            System.out.println("1 - refill all stock to max (4)");
            System.out.println("2 - view profit of this machine");
            System.out.println("3 - reset profit of this machine to 0");
            System.out.println("4 - purchase an item");
            System.out.println("5 - Stop using the machine");
            userChoice = keyboard.nextInt();

            if (userChoice == 0) { //user wants to set num of coins to standard amount
                m.resetStockOfCoins();
                System.out.println("The number of each coin is now set to 100.");
            } else if (userChoice == 1) { //user wants to set all stock of items to max(4)
                vm.resetStockOfSnacks();
                System.out.println("All items have been stocked up to 4.");
            } else if (userChoice == 2) { //user wants to see the profit
                System.out.printf("The profit of this machine is $%.2f \n", m.getProfit());
            } else if (userChoice == 3) { //user wants to reset profit to 0
                m.resetProfit();
                System.out.println("The profit of this machine has been reset to $0.00");
            } else if (userChoice == 4) { //user choose to purchase an item
                //output list of snacks and their descriptions
                for (int count = 0; count <= 15; count++) {
                    System.out.printf("%d - %s %.2f%n%s%n", (count + 1), vm.snackArray[count].getName(),
                            vm.snackArray[count].getSellPrice(),
                            vm.snackArray[count].getDescripAndHealthInfo());
                }
                //Ask user which snack they want and loops until an available snack is chosen
                do {
                    System.out.print("Please enter the index of the snack you want: ");
                    index = keyboard.nextInt();
                    if (vm.checkAvailability(index - 1) == false) {
                        System.out.println("Sorry, this item is out of stock");
                    }
                } while (vm.checkAvailability(index - 1) == false);
                //Get users money
                do {
                    System.out.println("The item you chose was " + vm.snackArray[index - 1].getName());
                    System.out.printf("This item costs %.2f \n", vm.snackArray[index - 1].getSellPrice());
                    System.out.print("Please enter the number of toonies: ");
                    toonie = keyboard.nextInt();
                    System.out.print("Please enter the number of loonies: ");
                    loonie = keyboard.nextInt();
                    System.out.print("Please enter the number of quarters: ");
                    quarter = keyboard.nextInt();
                    System.out.print("Please enter the number of dimes: ");
                    dime = keyboard.nextInt();
                    System.out.print("Please enter the number of nickels: ");
                    nickel = keyboard.nextInt();
                    //Calculate total value of input
                    input = 2.0 * toonie + 1.0 * loonie + 0.25 * quarter + 0.1 * dime + 0.05 * nickel;
                    //Ensure that user has entered enough money
                    if (m.compare(input, vm.snackArray[index - 1].getSellPrice()) < 0) {
                        System.out.println("You have not entered enough money.");
                        System.out.println("All money entered has been returned.");
                        System.out.println("Please try again.");
                        System.out.println("");
                    }
                } while (m.compare(input, vm.snackArray[index - 1].getSellPrice()) < 0);

                //add inputted coins to change stock
                m.add(toonie, loonie, quarter, dime, nickel);
                //determine the amount of change due
                m.determine(input, vm.snackArray[index - 1].getSellPrice());
                //check if change is possible
                if (m.changePossible == true) { //Determine profit from the item
                    m.profit(vm.snackArray[index - 1].getBoughtPrice(), vm.snackArray[index - 1].getSellPrice());
                    System.out.println("Here are your " + vm.snackArray[index - 1].getName());
                    //reduce inventory of snack
                    vm.makeSelection(index - 1);
                } else {//return money
                    m.subtract(toonie, loonie, quarter, dime, nickel);
                }
                //display the amount of change due or if change was possible
                System.out.println(m);
            }
        } while (userChoice != 5);
        System.out.println("Thank you for using this vending machine.");
    }
}
