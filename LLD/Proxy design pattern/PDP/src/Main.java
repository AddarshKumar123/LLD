public class Main {
    public static void main(String[] args) {

        try{
            EmployeeDao employeeDao=new EmployeeDaoProxy(new EmployeeDaoImpl());
            employeeDao.create("ADMIN");
            System.out.println("completed");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}