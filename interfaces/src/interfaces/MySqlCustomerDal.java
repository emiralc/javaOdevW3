package interfaces;

public class MySqlCustomerDal implements ICustomerDal, interfaces.IRepository {
    @Override
    public void add() {
        System.out.println("My Sql eklendi");
    }
}
