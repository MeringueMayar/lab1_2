package pl.com.bottega.ecommerce.sales.domain.invoicing;

public class TaxPolicyFactory {
    public TaxPolicy getPolicy(RequestItem requestItem) {
        switch (requestItem.getProductData().getType()) {
            case DRUG:
                return new DrugTaxPolicy();
            case FOOD:
                return new FoodTaxPolicy();
            case STANDARD:
                return new StandardTaxPolicy();

            default:
                throw new IllegalArgumentException(requestItem + " not handled");
        }
    }
}
