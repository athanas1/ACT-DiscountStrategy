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
public class Receipt {
    private Customer customer;
    private DataStore dataStore;
    private LineItem[] lineItems;
    
    public Receipt(String customerId,DataStore dataStore) {
        this.dataStore=dataStore;
        customer = dataStore.findCustomerById(customerId);
    }
    
    
    private void addItemToLineItems(LineItem item){
        LineItem[]temp = new LineItem[lineItems.length + 1];
        
        System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
//        for(int i=0; i < lineItems.length; i++){
//            temp[i] = lineItems[i];
//        }

        temp[temp.length-1] = item;
        lineItems = temp;
        temp = null;
    }
}
