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
public class Product {
    private String prodName;
    private String prodId;
    private double unitPrice;
    private String description;
    private DiscountStrategy discountStrategy;

    public Product(String prodId, double unitPrice, String prodName, DiscountStrategy discountStrategy) {
        this.prodId = prodId;
        this.unitPrice = unitPrice;
        this.prodName = prodName;
        this.discountStrategy = discountStrategy;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        //validation
        this.prodId = prodId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        //validation 
        this.unitPrice = unitPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        //validation
        this.description = description;
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    
    
}
