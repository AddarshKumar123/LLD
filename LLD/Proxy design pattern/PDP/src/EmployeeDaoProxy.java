public class EmployeeDaoProxy implements EmployeeDao{
    EmployeeDao employeeDaoObj;

    EmployeeDaoProxy(EmployeeDaoImpl employeeDaoImpl){
        this.employeeDaoObj=employeeDaoImpl;
    }

    @Override
    public void create(String client) throws Exception {
        if(client.equals("ADMIN")) {
            employeeDaoObj.create(client);
            return;
        }

        throw new Exception("ACCESS DENIED");

    }

    @Override
    public void delete(String client) throws Exception {
        if(client.equals("ADMIN")){
            employeeDaoObj.delete(client);
            return;
        }

        throw new Exception("ACCESS DENIED");
    }

    @Override
    public void get(String client) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")){
            employeeDaoObj.get(client);
            return;
        }

        throw new Exception("ACCESS DENIED");
    }
}
