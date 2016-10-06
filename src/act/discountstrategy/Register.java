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
public class Register {

    private Receipt receipt;
    private LineItem lineItem;

    public final void startNewSaleForCustomerId(String customerId,DataStore dataStore) {
        receipt = new Receipt(customerId,dataStore);
    }

    public final void addProductToSale(String prodId, int qty,DataStore dataStore) {
    }

    public final void endSale() {
    }

}
