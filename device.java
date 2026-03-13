interface Switchable {
    public void turnOn();
    public void turnOff();
}

interface Connectable {
    public void connectWiFi();
}

class SmartLight implements Switchable, Connectable {

    public void turnOn() {
        System.out.println("Smart Light is ON.");
    }

    public void turnOff() {
        System.out.println("Smart Light is OFF.");
    }

    public void connectWiFi() {
        System.out.println("Smart Light connected to WiFi.");
    }
}

class SmartFan implements Switchable, Connectable {

    public void turnOn() {
        System.out.println("Smart Fan is ON.");
    }

    public void turnOff() {
        System.out.println("Smart Fan is OFF.");
    }

    public void connectWiFi() {
        System.out.println("smart fan connected to wifi");
    }
}

public class device {

    public static void main(String[] args) {

        Switchable device1 = new SmartLight();
        Connectable device2 = new SmartFan();

        device1.turnOn();
        device1.turnOff();

        device2.connectWiFi();

        SmartFan fan = new SmartFan();
        fan.turnOn();
        fan.connectWiFi();
    }
}
