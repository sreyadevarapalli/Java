package OOPS_Programs.Interface;
interface Payments {
    void pay();
}

class UPI implements Payments {

    @Override
    public void pay() {
        System.out.println("Payment through UPI");
    }
}

class CreditCard implements Payments {

    @Override
    public void pay() {
        System.out.println("Payment through Credit Card");
    }
}

public class Payment {

    public static void main(String[] args) {

        Payments p;

        p = new UPI();
        p.pay();

        p = new CreditCard();
        p.pay();
    }
}