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
public class InMemoryDatabase implements DataStore {
    private Customer[] customers = {
        new Customer("Jones","Sally","C100"),
        new Customer("Smith","Bob","C101"),
        new Customer("Doe","Bob","C102")
    };
    
    private Product[] products = {
        new Product("11", 29.95, "Brewer's Hat",  new PercentOffDiscount(.10)),
        new Product("22", 49.95, "Lady's Blouse", new FlatAmtDiscount(5.00)),
        new Product("33", 39.95,"Men's Black Belt", new NoDiscount())
    };
    
    @Override
    public final Customer findCustomerById(String custId){
        if (custId == null || custId.length() == 0) {
            //Throw exception for illegal customer ID
            return null;
        }
        Customer foundCustomer = null;
        
        for(Customer c : customers){
            if(custId.equals(c.getCustomerId())){
                foundCustomer = c;
                break;
            }
        }
        
        return foundCustomer;
    }
    @Override
    public final Product findProductById(String prodId){
        if (prodId == null || prodId.length() == 0) {
            //Throw exception for illegal product ID
            return null;
        }
        Product product = null;
        
        for(Product p : products){
            if(p.getProdId().equals(prodId)){
                product = p;
                break;
            }
        }
        return product;
    }
}
