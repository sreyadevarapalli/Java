package OOPS_Programs.Inheritance;
//using interface
interface Device {

    void powerOn();
}

interface Internet {

    void connectInternet();
}

class Mobile implements Device, Internet {

    public void powerOn() {
        System.out.println("Mobile Powered On");
    }

    public void connectInternet() {
        System.out.println("Mobile Connected to Internet");
    }
}

class Tablet extends Mobile {

    void browse() {
        System.out.println("Browsing Internet");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {

        Tablet t = new Tablet();

        t.powerOn();
        t.connectInternet();
        t.browse();
    }
}
