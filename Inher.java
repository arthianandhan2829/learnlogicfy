class CellPhone {
    void call() {
        System.out.println("Making a call");
    }
    void contacts() {
        System.out.println("Saving contacts");
    }
}
class SmartPhone extends CellPhone {
    void gps() {
        System.out.println("Using GPS");
    }
    void fingerprint() {
        System.out.println("Using fingerprint");
    }
}
public class Inher {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.call();
        s.contacts();
        s.gps();
        s.fingerprint();
    }
}