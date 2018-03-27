package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import pl.com.bottega.ecommerce.sharedkernel.Money;

import java.math.BigDecimal;

import static pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType.DRUG;
public interface TaxStrategy {
    Tax calculateTax(Money net, ProductType type);
}
