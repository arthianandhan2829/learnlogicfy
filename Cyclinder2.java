class Cylinder{
    private int h;
    private int r;
    public Cylinder(){
        h=1;
        r=1;
    }
    public Cylinder(int s){
        h = s;
        r = 1;
    }
    public Cylinder(int n, int m){
        h = n;
        r = m;
    }
    public int getH(){
        return h;
    }
    public int getR(){
        return r;
    }
    public void setH(int h){
        this.h=h;
    }
    public void setR(int r){
        this.r=r;
    }
    float areaCylinder(){
        return 3.14f*r*r;
    }
    float volCylinder(){
        return 3.14f*r*r*h;
    }
    float cirCylinder(){
        return 2*r*3.14f;
    }
}
public class Cyclinder2{
    public static void main(String args[]){
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(10);
        Cylinder c3 = new Cylinder(10,20);
        System.out.println(c1.areaCylinder());
        System.out.println(c2.areaCylinder());
        System.out.println(c3.areaCylinder());
        System.out.println(c1.volCylinder());
        System.out.println(c2.volCylinder());
        System.out.println(c3.volCylinder());
        System.out.println(c1.cirCylinder());
        System.out.println(c2.cirCylinder());
        System.out.println(c3.cirCylinder());

    }

}