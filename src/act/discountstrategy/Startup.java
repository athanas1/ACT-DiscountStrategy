/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act.discountstrategy;

/**
 *
 * @author athanas1
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // register object
      Register register = new Register(/*If multiple stores needed put store here*/);
      DataStore dataStore = new InMemoryDatabase();
      //start new sale
      //String for customer number because more flexible
      register.startNewSaleForCustomerId("C100",dataStore);
      register.addProductToSale("A101",2);
      register.addProductToSale("B200",1);
      register.addProductToSale("P400",3);
      register.endSale();
    }

    
}
