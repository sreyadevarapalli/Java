package OOPS_Programs.Polymorphism;



class Payments {

    void pay() {
        System.out.println("Processing Payment");
    }
}

class CreditCard extends Payments {

    @Override
    void pay() {
        System.out.println("Payment made using Credit Card");
    }
}

class UPI extends Payments {

    @Override
    void pay() {
        System.out.println("Payment made using UPI");
    }
}

class NetBanking extends Payments {

    @Override
    void pay() {
        System.out.println("Payment made using Net Banking");
    }
}

public class Payment {

    public static void main(String[] args) {

        Payments p;

        p = new CreditCard();
        p.pay();

        p = new UPI();
        p.pay();

        p = new NetBanking();
        p.pay();
    }
}