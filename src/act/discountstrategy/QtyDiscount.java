/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act.discountstrategy;

import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class QtyDiscount implements DiscountStrategy {

    //needed at least 5 items to get Qty Discount
    private double discountRate = 0.15;
    private int minQty = 5;

    public QtyDiscount(double discountRate, int minQty) {
        setDiscountRate(discountRate);
        setMinQty(minQty);
    }

    @Override
    public double getDiscountAmt(double unitPrice, int qty) {
        if (qty >= minQty) {
            return unitPrice * qty * discountRate;
        } else {
            return 0;
        }
    }

    @Override
    public double getDiscountRate() {
     return discountRate;}

    @Override
    public void setDiscountRate(double discountRate) {
    this.discountRate = discountRate;}

    public int getMinQty() {
        return minQty;
    }

    public void setMinQty(int minQty) {
        this.minQty = minQty;
    }

}
