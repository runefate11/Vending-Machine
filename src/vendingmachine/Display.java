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

public static void main (String [] args){
    Scanner keyboard = new Scanner (System.in);
    VendingMachine vm = new VendingMachine();
    int toonie, loonie, quarter, dime, nickel, index;
    for (int count = 0; count <= 15; count++){
        System.out.printf("%d %s %.2f%n",(count + 1), vm.snackArray[count].getName(),
                vm.snackArray[count].getBoughtPrice());
    }
    System.out.print("Please enter the index of the Snack you want: ");
    index = keyboard.nextInt();
    if (vm.checkAvailability(index) == true)
        vm.makeSelection(index);
        System.out.printf("This item costs %.2f", vm.snackArray[index - 1].getBoughtPrice());
        
}
}