package pl.com.bottega.ecommerce.sales.domain.invoicing;

public interface Invoice {
    void addItem(InvoiceLine item);
}
