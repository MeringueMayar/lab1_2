package pl.com.bottega.ecommerce.sales.domain.taxing;

import pl.com.bottega.ecommerce.sales.domain.invoicing.RequestItem;
import pl.com.bottega.ecommerce.sharedkernel.Money;

import java.math.BigDecimal;

public class USATaxPolicy implements TaxPolicy {

    @Override
    public Tax calculateTax(RequestItem requestItem) {
        Money net = requestItem.getTotalCost();
        BigDecimal ratio = null;
        String desc = null;

        switch (requestItem.getProductData().getType()) {
            case DRUG:
                ratio = BigDecimal.valueOf(0.02);
                desc = "5% (D)";

                break;
            case FOOD:
                ratio = BigDecimal.valueOf(0.01);
                desc = "7% ";
                break;
            case STANDARD:
                ratio = BigDecimal.valueOf(0.33);
                desc = "23%";
                break;

            default:
                throw new IllegalArgumentException(requestItem.getProductData().getType() + " not handled");
        }

        Money taxValue = net.multiplyBy(ratio);

        return new Tax(taxValue, desc);
    }
}
