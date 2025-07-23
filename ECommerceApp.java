package OOPS_Programs;
interface PaymentMode {
    void pay(double amount);
}

class UpiPayment implements PaymentMode {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI.");
    }
}

class CreditCardPayment implements PaymentMode {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class CashOnDelivery implements PaymentMode {
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " will be collected on delivery.");
    }
}

public class ECommerceApp {
	public static void main(String[] args) {
        PaymentMode payment;

        payment = new UpiPayment();
        payment.pay(1500.00);

        payment = new CreditCardPayment();
        payment.pay(3200.00);

        payment = new CashOnDelivery();
        payment.pay(2000.00);
    }

}
