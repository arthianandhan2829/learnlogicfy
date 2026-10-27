class Parent{
    public Parent(){
        System.out.println("Non-Param Parent");
    }
    public Parent(int x){
        System.out.println("Param Parent " + x);
    }
    public Parent(int x,int y) {
        System.out.println("Param Parent " + x + " "+y);
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Non-Param Child");
    }
    public Child(int y) {
        System.out.println("Param Child");
    }
    public Child(int x , int y){
        super(x, y);
        System.out.println("2 Param Child "+y);
    }
}
public class Parent1{
    public static void main(String args[]){ 
        Child c = new Child(10,20);
    }
}
