/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    public double compare (double input, double price){
        //display will run a check
        //if reutnred value is negative, it should loop until the user inputs enough money
        return input - price;
    }
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
    public void add (int toonie, int loonie, int quarter, int dime, int nickel){
        numToonies += toonie;
        numLoonies += loonie;
        numQuarters += quarter;
        numDime += dime;
        numNickel += nickel;
    }
    @Override
    public String toString (){
        return "Toonies: " + usedToonie + "Loonies: " + usedLoonie + "Quarters: " + usedQuarter 
                + "Dimes: " + usedDime + "Nickels: " + usedNickel;
    }
}
