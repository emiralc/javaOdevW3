public class Cylinder extends Shape {

    public void calculate(int r,int h){
        volume= (int) (3.14*r*r*h);
        System.out.println("Volume of Cylinder: "+volume);
    }
}
