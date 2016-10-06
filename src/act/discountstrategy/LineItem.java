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
//Line items needs Prod Name, Price, qty, subTotal, and Amount Discounted
public class LineItem {

    private Product product;
    private int qty;

    public LineItem(Product product, int qty) {
        this.product = product;
        this.qty = qty;
        getSubTotal();
    }
    // I might needs to make a format class to adhere to Single responsiility principle
    public String getLineItem(){
        
    }

    private final double getSubTotal() {
        return qty * product.getUnitPrice();
    }

    public final double getDiscountedTotal() {
        return product.getDiscountStrategy().getDiscountAmt(product.getUnitPrice(), qty);

    }

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