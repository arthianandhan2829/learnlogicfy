class Circles{
    int radius;
    double area(){
        return 3.14*radius*radius;
    }
}
class Rectange{
    int length;
    int breadth;
    double area(){
        return length*breadth;
    }
}
class Student{
    String name;
    int fees;
    int marks1;
    int marks2;
    double average(){
        return (marks1 + marks2) / 2.0;
    }
}
class Account{
    String name;
    int accountNo;
    double balance;
    void deposit(double amount) {
        balance = balance + amount;
    }
    void withdraw(double amount){
        balance = balance - amount;
    }
}
class Car{
    String brand;
    int speed;
    void accelerate() {
        speed = speed + 10;
    }
    void brake() {
        speed = speed - 10;
    }
}
class TV {
    String brand;
    int volume;
    void increaseVolume() {
        volume = volume + 5;
    }
    void decreaseVolume() {
        volume = volume - 5;
    }
}
public class Oops {
    public static void main(String args[]) {
        Circles c=new Circles();
        c.radius=4;
       System.out.println(c.area());
       Rectange r =new Rectange();
       r.length=4;
       r.breadth=4;
       System.out.println(r.area());
        Student s = new Student();
        s.name = "Tamil";
        s.fees = 50000;
        s.marks1 = 80;
        s.marks2 = 90;
        System.out.println(s.average());
        Account a = new Account();
        a.name = "Enola";
        a.accountNo = 101;
        a.balance = 5000;
        a.deposit(2000);
        System.out.println(a.balance);
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.speed = 50;
        c1.accelerate();
        System.out.println(c1.speed);
        TV t = new TV();
        t.brand = "Sony";
        t.volume = 20;
        t.increaseVolume();
        System.out.println(t.volume);
    }
}
