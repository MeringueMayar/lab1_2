package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sharedkernel.Money;

import java.math.BigDecimal;

public class StandardTaxPolicy implements TaxPolicy {
    public Tax getTax(RequestItem requestItem) {
        Money net = requestItem.getTotalCost();
        BigDecimal ratio = BigDecimal.valueOf(0.23);
        String desc = "23%";
        Money taxValue = net.multiplyBy(ratio);
        return new Tax(taxValue, desc);
    }
}
