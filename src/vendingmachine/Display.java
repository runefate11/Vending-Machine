package vendingmachine;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 348564469
 */
import java.util.Scanner;

public class Display {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //Summon objects
        VendingMachine vm = new VendingMachine();
        Money m = new Money();
        //Variables for inputting each denomination
        int toonie, loonie, quarter, dime, nickel, index;
        //Total value of user money input
        double input;
        //output list of snacks and their descriptions
        for (int count = 0; count <= 15; count++) {
            System.out.printf("%d %s %.2f%n%s%n", (count + 1), vm.snackArray[count].getName(),
                    vm.snackArray[count].getBoughtPrice(),
                    vm.snackArray[count].getDescripAndHealthInfo());
        }
        //Ask user which snack they want
        do {
            System.out.print("Please enter the index of the snack you want: ");
            index = keyboard.nextInt();
            if (vm.checkAvailability(index-1) == false)
                System.out.println("Sorry, this item is out of stock");
        } while (vm.checkAvailability(index - 1) == false);
        //Get users money
        do {
            System.out.printf("This item costs %.2f", vm.snackArray[index - 1].getBoughtPrice());
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
            if (m.compare(input, vm.snackArray[index - 1].getBoughtPrice()) < 0) {
                System.out.println("You have not entered enough money");
            }
        } while (m.compare(input, vm.snackArray[index - 1].getBoughtPrice()) < 0);
        //reduce inventory of snack
        vm.makeSelection(index - 1);
        //add inputted coins to change stock
        m.add(toonie, loonie, quarter, dime, nickel);
        //determine the amount of change due
        m.determine(input, vm.snackArray[index - 1].getBoughtPrice());
        //Determine profit from the item
        m.profit(vm.snackArray[index - 1].getBoughtPrice(), vm.snackArray[index - 1].getSellPrice());
        //display the amount of change due
        System.out.println(m);
    }
}
