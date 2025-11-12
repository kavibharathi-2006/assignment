interface Payment {
    void pay(double amount);
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class PayPal implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via PayPal.");
    }
}

class Cash implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " in Cash.");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new PayPal();
        Payment p3 = new Cash();

        p1.pay(500);
        p2.pay(1200);
        p3.pay(300);
    }
}
