/*
Assumptions: only coins, no pennies, no half dollars
Input must be in groups of 5 cents at smallest and prices must be in groups of 5 cents at smallest
 */
package vendingmachine;

/**
 *
 * @author GW9999
 */
public class Money {
    private int numNickel = 100;
    private int numDime = 100;
    private int numQuarters = 100;
    private int numLoonies = 100;
    private int numToonies = 100;
    private int usedNickel;
    private int usedDime;
    private int usedQuarter;
    private int usedLoonie;
    private int usedToonie;
    
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
     * Returns the amounts of change
     */
    public String toString (){
        return "Toonies: " + usedToonie + "Loonies: " + usedLoonie + "Quarters: " + usedQuarter 
                + "Dimes: " + usedDime + "Nickels: " + usedNickel;
    }
}
