package pl.com.bottega.ecommerce.sales.domain.payment;

public interface Payment {
    Payment rollBack(PaymentFactory paymentFactory);
}
