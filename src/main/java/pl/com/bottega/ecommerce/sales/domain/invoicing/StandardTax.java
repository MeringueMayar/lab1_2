package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sharedkernel.Money;

import java.math.BigDecimal;

public class StandardTax implements TaxType {
    public Tax calculate(Money net) {
        return new Tax(net.multiplyBy(BigDecimal.valueOf(0.23)), "23%");
    }
}
