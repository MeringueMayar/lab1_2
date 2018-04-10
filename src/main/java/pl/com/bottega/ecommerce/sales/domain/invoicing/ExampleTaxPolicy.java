package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sharedkernel.Money;

import java.math.BigDecimal;

import static pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType.DRUG;
import static pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType.FOOD;
import static pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType.STANDARD;

public class ExampleTaxPolicy implements TaxPolicy{
    @Override
    public Tax calculate(RequestItem item) {
        Money net = item.getTotalCost();
        BigDecimal ratio = null;
        String desc = null;

        switch (item.getProductData().getType()) {
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
                throw new IllegalArgumentException(item.getProductData().getType() + " not handled");
        }

        Money taxValue = net.multiplyBy(ratio);

        return new Tax(taxValue, desc);
    }
}
