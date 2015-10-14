/*
Assumptions: only coins, no pennies, no half dollars
Input must be in groups of 5 cents at smallest and prices must be in groups of 5 cents at smallest
 */
package vendingmachine;

/**
 *
 * @author GW9999
 * Gregory Wong
 */
public class Money {
    //These variables track how many of each coin there is
    private int numNickel = 100;
    private int numDime = 100;
    private int numQuarters = 100;
    private int numLoonies = 100;
    private int numToonies = 100;
    //These variables track how much of each coin will be outputted for change
    private int usedNickel;
    private int usedDime;
    private int usedQuarter;
    private int usedLoonie;
    private int usedToonie;
    //Total change to be returned
    boolean changePossible = true;
    //Tracks net profits
    private double profit = 0;
    /**
     * Checks if the user inputs enough money
     * @param input - amount of money the user inputted into the machine
     * @param price - (+) value means the user has enough money
     *                (-) value means the user didn't input enough money
     * @return 
     */
    public double compare (double input, double price){
        return input - price;
    }
    
    /**
     * determines how many of each coin is to be used in order to give the change
     * @param input - amount of money the user inputted into the machine
     * @param price - the cost of the item
     */
    public void determine (double input, double price){
        input -= price;
        //run through each denomination and determine how much of each coin can be used
        if ((int)(input/2.0) <= numToonies)
            usedToonie = (int)(input/2.0);
        else
            usedToonie = numToonies;
        input -= 2.0*usedToonie;
        numToonies -= usedToonie;
        if ((int)(input/1.0) <= numLoonies)
            usedLoonie = (int)(input/1.0);
        else
            usedLoonie = numLoonies;
        input -= 1.0*usedLoonie;
        numLoonies -= usedLoonie;
        if ((int)(input/0.25) <= numQuarters)
            usedQuarter = (int)(input/0.25);
        else
            usedQuarter = numQuarters;
        input -= 0.25*usedQuarter;
        numQuarters -= usedQuarter;
        if ((int)(input/0.10) <= numDime)
            usedDime = (int)(input/0.10);
        else
            usedDime = numDime;
        input -= 0.10*usedDime;
        numDime -= usedDime;
        if ((int)(input/0.05) <= numNickel)
            usedNickel = (int)(input/0.05);
        else
            usedNickel = numNickel;
        input -= 0.05*usedNickel;
        numNickel -= usedNickel;
        //Check if change is possible
        if (input > 0){
            changePossible = false;
            numToonies += usedToonie;
            numLoonies += usedLoonie;
            numQuarters += usedQuarter;
            numDime += usedDime;
            numNickel += usedNickel;
        }
        else
            changePossible = true;
    }
    /**
     * Calculates profit from each item and adds to net profit
     * @param bought Price that item was purchased from supplier for
     * @param sold   Selling price
     */
    public void profit (double bought, double sold){
        profit += (bought - sold);
    }
    /**
     * Adds the number of coins the user inputted to the total number of coins
     * @param toonie - adds number of toonies
     * @param loonie - adds number of loonies
     * @param quarter - adds number of quarters
     * @param dime - adds number of dimes
     * @param nickel  - adds number of nickels
     */
    public void add (int toonie, int loonie, int quarter, int dime, int nickel){
        numToonies += toonie;
        numLoonies += loonie;
        numQuarters += quarter;
        numDime += dime;
        numNickel += nickel;
    }
    @Override
    /**
     * Returns the amount of change
     * Response will vary depending 
     */
    public String toString (){
        if (changePossible == true){
        return "Change due. Toonies: " + usedToonie + "Loonies: " + usedLoonie + "Quarters: " + usedQuarter 
                + "Dimes: " + usedDime + "Nickels: " + usedNickel;
        }
        else
            return "Sorry. There is not enough change. We will refund you.";
    }
}
