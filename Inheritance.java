class CellPhone {
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void call() {
        System.out.println("Calling");
    }

    public void message() {
        System.out.println("Messaging");
    }
}

class Smartphone extends CellPhone {

    public void music() {
        System.out.println("Playing music");
    }

    public void click() {
        System.out.println("Clicking photos");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        CellPhone phone1 = new Smartphone();
        Smartphone phone2 = new Smartphone();

        phone1.setPhoneNumber("1234567890");

        System.out.println("Phone Number: " + phone1.getPhoneNumber());

        phone1.call();
        phone1.message();

        phone2.music();
        phone2.click();
    }
}
