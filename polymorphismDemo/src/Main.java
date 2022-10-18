public class Main {
    public static void main(String[] args) {
//        BaseLogger[] loggers=new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger()};
//        for(BaseLogger logger:loggers){
//            logger.log("Log mesajı");
//        }

        Shape[] shapes=new Shape[]{new Cube(),new Cylinder(),new Sphere(),new Pyramid()};
        for(Shape shape:shapes){
            shape.calculate(2,5);
        }

    }
}