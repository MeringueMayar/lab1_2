package pl.com.bottega.ecommerce.sales.domain.invoicing;

public class TaxStrategy {
    public TaxType decideOnTaxType (RequestItem item) {
        switch (item.getProductData().getType()) {
            case DRUG:
                return new DrugTax();
            case FOOD:
                return new FoodTax();
            case STANDARD:
                return new StandardTax();

            default:
                throw new IllegalArgumentException(item.getProductData().getType() + " not handled");
        }

    }
}
