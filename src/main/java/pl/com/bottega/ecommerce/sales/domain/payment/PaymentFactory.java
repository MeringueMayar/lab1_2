package pl.com.bottega.ecommerce.sales.domain.payment;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public class PaymentFactory {	
	public Payment createPayment(Id aggregateId, ClientData client, Money amount) {
		if (aggregateId == null || client == null || amount == null)
			return null;
		else
			return new Payment(Id.generate(), client, amount);
	}
}
