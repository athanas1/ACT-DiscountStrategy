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
//Line items needs Prod Name, Price, qty, subTotal, and Amount Discounted
public class LineItem {

    private Product product;
    private int qty;
    private NumberFormat nf = NumberFormat.getCurrencyInstance();

    public LineItem(String prodId, int qty, DataStore db) {
        this.product = db.findProductById(prodId);
        this.qty = qty;
    }

    // I might needs to make a format class to adhere to Single responsiility principle
    public String getLineItem() {
        String item = product.getProdId()
                + "\t\t" + product.getProdName()
                + "\t\t" + qty
                + "\t\t" + nf.format(product.getDiscountAmount(qty))
                + "\t\t" + nf.format(getSubTotal());

        return item;
    }
   // encapsulate this with get total so SubTotal is always there
    public final double getSubTotal() {
        return product.getUnitPrice() * qty - product.getDiscountAmount(qty);
    }
    
    public final double getTotal(){
        return getSubTotal() + product.getDiscountAmount(qty);
    }

//    public final double getDiscountAmount() {
//        return product.getDiscountStrategy().getDiscountAmt(product.getUnitPrice(), qty);
//
//    }
//        public final double getTotalBeforeDiscount(){
//        return getSubTotal() + getDiscountAmount();
//    }
    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        this.product = product;
    }

    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        this.qty = qty;
    }

}
