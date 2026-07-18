public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client) {
        System.out.println("create new object");
    }

    @Override
    public void delete(String client) {
        System.out.println("deleted object");
    }

    @Override
    public void get(String client) {
        System.out.println("Retrieve object");
    }
}
