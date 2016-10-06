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
public class NoDiscount implements DiscountStrategy {
    private final double DISCOUNT_RATE = 0;
    @Override
    public double getDiscountAmt(double unitPrice, int qty) {
        return DISCOUNT_RATE;
    }

    
    public final double getDiscountRate() {
    return DISCOUNT_RATE;
    }

  

}
