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
        VendingMachine vm = new VendingMachine();
        Money m = new Money();
        int toonie, loonie, quarter, dime, nickel, index;
        double input;
        //output list of snacks
        for (int count = 0; count <= 15; count++) {
            System.out.printf("%d %s %.2f%n", (count + 1), vm.snackArray[count].getName(),
                    vm.snackArray[count].getBoughtPrice());
        }
        do {
            System.out.print("Please enter the index of the snack you want: ");
            index = keyboard.nextInt();
        } while (vm.checkAvailability(index - 1) == false);
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
        input = 2.0*toonie + 1.0*loonie + 0.25*quarter + 0.1*dime + 0.05*nickel;
        if (m.compare(input,vm.snackArray[index - 1].getBoughtPrice())<0)
            System.out.println("You have not entered enough money");
        } while (m.compare(input, vm.snackArray[index - 1].getBoughtPrice()) < 0);
        //determine change
        vm.makeSelection(index - 1);
        m.add(toonie, loonie, quarter, dime, nickel);
        m.determine(input, vm.snackArray[index - 1].getBoughtPrice());
        System.out.println(m);
    }
}
