/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.bottega.ecommerce.sales.domain.invoicing;

import java.math.BigDecimal;
import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 *
 * @author karko
 */
public class DefaultTaxPolicy {

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

        Tax tax = new Tax(taxValue, desc);
        return tax;
    }

}
