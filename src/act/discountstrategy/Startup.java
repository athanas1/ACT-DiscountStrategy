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
      DataStore db = new InMemoryDatabase();
      OutputStrategy Coutput = new ConsoleOutput();
      OutputStrategy gui = new GuiOutput();
      //start new sale
      //String for customer number because more flexible
      register.startNewSaleForCustomerId("C100",db);
      register.addProductToSale("11",2,db);
      register.addProductToSale("22",1,db);
      register.addProductToSale("33",3,db);
      register.endSale(gui);
      register.endSale(Coutput);
      
    }

    
}
