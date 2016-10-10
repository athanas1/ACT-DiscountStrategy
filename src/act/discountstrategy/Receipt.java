/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act.discountstrategy;

import java.text.NumberFormat;

/**
 *
 * @author athanas1
 */
public class Receipt {

    private Customer customer;
    private LineItem[] lineItem = new LineItem[0];
    private NumberFormat nf = NumberFormat.getCurrencyInstance();
    private double arrayIndex = 0;

    public Receipt(String customerId, DataStore db) {
        customer = db.findCustomerById(customerId);
    }

    public final void addLineItem(String prodId, int qty, DataStore db) {
        LineItem[] temp = new LineItem[lineItem.length + 1];
        System.arraycopy(lineItem, 0, temp, 0, lineItem.length);
        temp[temp.length - 1] = new LineItem(prodId, qty, db);
        lineItem = temp;
        arrayIndex++;

    }

    public String getReceipt() {
        String lineItems = new String();
        for (int i = 0; i < arrayIndex; i++) {
            lineItems += lineItem[i].getLineItem() + "\n\n";
        }
        String string;
        string = "\t\t\t\t\tKohl's Department Store"
                + "\n" + "Customer ID# and Name" + customer.getCustomerId()
                + ": " + customer.getFirstName() + " " + customer.getLastName() + "\n\n\n"
                + "ID\t\tName\t\tQuantity\t\tDiscount\t\tTotal\n"
                + lineItems + "\t\t\t\t\t\tTotal   " + "\t\t\t" +nf.format(getTotal());

        return string;

    }

    private double getTotal() {
        double total = 0;
        for (int i = 0; i < arrayIndex; i++) {
            total += lineItem[i].getSubTotal();
        }
        return total;
    }
}

//    private void addItemToLineItems(LineItem item) {
//    
//    }
//
//    public final String getReceiptData() {
//        StringBuilder sBuilder;
//        sBuilder = new StringBuilder("\n" + customer.getFirstName() + " " + customer.getLastName());
//        LineItem[] items = getLineItems();
//        for (LineItem i : items) {
//            sBuilder.append(i.getLineItem());
//        }
//        sBuilder.append("\n");
//        sBuilder.append("Total before: ").append(nf.format(getSubTotal()));
//        sBuilder.append("\n");
//        sBuilder.append("You saved: ").append(nf.format(getAmountSaved()));
//        sBuilder.append("\n");
//        sBuilder.append("Your grand total is: ").append(nf.format(getTotal()));
//
//        String BuildertoString = sBuilder.toString();
//        return BuildertoString;
//    }
//
//    public final double getAmountSaved() {
//        total = 0.0;
//        for (LineItem item : lineItems) {
//            total += item.getDiscountAmount();
//        }
//        return total;
//    }
//
//    public final double getSubTotal() {
//        total = 0.0;
//        for (LineItem i : lineItems) {
//            total += i.getSubTotal();
//        }
//        return total;
//    }
//
//    public final double getTotal() {
//        return getSubTotal() + getAmountSaved();
//    }
//
//    public LineItem[] getLineItems() {
//        return lineItems;
//    }
//// needs to be validated
//
//    public void setLineItems(LineItem[] lineItems) {
//        // needs validation
//        this.lineItems = lineItems;
//    }
//
//}
