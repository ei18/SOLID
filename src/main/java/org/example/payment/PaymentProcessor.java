package org.example.payment;

public class PaymentProcessor {

    public void processPayment(String paymentType) {
        if (paymentType.equals("credit")) {
            // Lógica para procesar el pago con tarjeta de crédito
        } else if (paymentType.equals("paypal")) {
            // Lógica para procesar el pago con PayPal
        }
    }
}
