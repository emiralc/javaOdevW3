public class Sphere extends Shape {

    public void calculate(int r,int h){
        volume= (int) ((4/3)*3.14*r*r*r);
        System.out.println("Volume of Sphere: "+volume);
    }
}
