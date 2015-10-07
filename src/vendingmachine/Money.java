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
        usedToonie = (int)(input/2.0);
        input -= 2.0*usedToonie;
        numToonies -= usedToonie;
        usedLoonie = (int)(input/1.0);
        input -= 1.0*usedLoonie;
        numLoonies -= usedLoonie;
        usedQuarter = (int)(input/0.25);
        input -= 0.25*usedQuarter;
        numQuarters -= usedQuarter;
        usedDime = (int)(input/0.10);
        input -= 0.10*usedDime;
        numDime -= usedDime;
        usedNickel = (int)(input/0.05);
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
    public void subtract (int toonie, int loonie, int quarter, int dime, int nickel){
        numToonies -= toonie;
        numLoonies -= loonie;
        numQuarters -= quarter;
        numDime -= dime;
        numNickel -= nickel;
    }
    @Override
    public String toString (){
        return "Toonies: " + usedToonie + "Loonies: " + usedLoonie + "Quarters: " + usedQuarter 
                + "Dimes: " + usedDime + "Nickels: " + usedNickel;
    }
}
