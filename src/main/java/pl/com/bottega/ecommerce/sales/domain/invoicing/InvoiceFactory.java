package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

public class InvoiceFactory {
    public static BasicInvoice createBasicInvoice(ClientData client){
        return new BasicInvoice(Id.generate(), client);
    }
}
