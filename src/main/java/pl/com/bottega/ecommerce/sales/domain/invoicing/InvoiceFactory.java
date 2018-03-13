package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

public class InvoiceFactory {

    public Invoice createInvoice(ClientData clientData) {
        Id invoiceId = Id.generate();
        return new Invoice(invoiceId, clientData);
    }

}
