package org.example.payment;

public class PaymentProcessor implements PaymentMethod{

    public void processPayment(String paymentType) {
        if (paymentType.equals("credit")) {
            // Lógica para procesar el pago con tarjeta de crédito
        } else if (paymentType.equals("paypal")) {
            // Lógica para procesar el pago con PayPal
        }
    }

    @Override
    public void processPayment() {
    }
}
