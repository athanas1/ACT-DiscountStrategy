/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act.discountstrategy;

/**
 *
 * @author Alex
 */
public class FlatAmtDiscount implements DiscountStrategy {
private double discountRate = 1.50;

    public FlatAmtDiscount(double discountRate) {
        setDiscountRate(discountRate);
    }

    
    @Override
    public double getDiscountAmt(double unitPrice, int qty) {
    return unitPrice * (qty*discountRate);}

    @Override
    public double getDiscountRate() {
     return discountRate;}

    @Override
    public void setDiscountRate(double discountRate) {
    this.discountRate = discountRate;}
    
}
