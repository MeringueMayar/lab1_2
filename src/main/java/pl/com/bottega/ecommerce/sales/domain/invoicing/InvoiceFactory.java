package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

public class InvoiceFactory {
	public Invoice createInvoice (Id invoiceId, ClientData client) {
		if (invoiceId == null || client == null)
			return null;
		else {
			return new Invoice(Id.generate(), client);
		}
	}
}
