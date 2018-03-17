package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public interface TaxPolicy {
    
    public void calculateTax(ProductType productType, Money net) throws IllegalArgumentException;
    
    public Money getAmount();
    
    public String getDescription();
    
}
