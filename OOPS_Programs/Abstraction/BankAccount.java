package OOPS_Programs.Abstraction;



abstract class Bank {

    abstract void interestRate();
}

class SBI extends Bank {

    @Override
    void interestRate() {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}

class HDFC extends Bank {

    @Override
    void interestRate() {
        System.out.println("HDFC Interest Rate: 7%");
    }
}

public class BankAccount {

    public static void main(String[] args) {

        Bank b;

        b = new SBI();
        b.interestRate();

        b = new HDFC();
        b.interestRate();
    }
}