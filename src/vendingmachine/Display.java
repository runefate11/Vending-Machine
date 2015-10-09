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
public class Display {
    public VendingMachine vend;
    
    public Display (VendingMachine vm){
        vend = vm;
    }
    public String Selection (int snackIndex){
        return vend.makeSelection(snackIndex);
    }
}
