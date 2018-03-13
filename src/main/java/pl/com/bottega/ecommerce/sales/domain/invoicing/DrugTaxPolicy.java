package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sharedkernel.Money;

import java.math.BigDecimal;

public class DrugTaxPolicy implements TaxPolicy {
    public Tax getTax(RequestItem requestItem) {
        Money net = requestItem.getTotalCost();
        BigDecimal ratio = BigDecimal.valueOf(0.05);
        String desc = "5% (D)";
        Money taxValue = net.multiplyBy(ratio);
        return new Tax(taxValue, desc);
    }
}
