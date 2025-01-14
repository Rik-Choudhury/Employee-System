package backend;

import entity.Employee;
import entity.Laptop;

public class EmployeeOperations {

    Employee[] allEmployees = new Employee[100];
    Laptop[] allLaptop = new Laptop[100];
    int position = 0;


    public boolean insertEmployee(Employee employee) {

        if(employee != null)
        {
            allEmployees[position++] = employee;
            return  true;
        }
        else return false;
    }

    public int getPosition() {
        return position;
    }
    public Employee[] getAllEmployees() {
        return allEmployees;
    }




    public Employee allocateLaptop(int searchEmpId,Laptop laptop) {
        if(getEmployeeById(searchEmpId) != null){
           Employee e = getEmployeeById(searchEmpId);
           if(laptop!=null)
           {
               e.setLaptop(laptop);
               return e;
           }
           else return null;

        }
        else return null;
    }
    public Employee allocateProject(int searchEmpId,String project) {
        if(getEmployeeById(searchEmpId) != null){
            Employee e = getEmployeeById(searchEmpId);
            if(project!=null)
            {
                e.setProject(project);
                System.out.println("Project " +project+ " Allocated to " + searchEmpId + " successfully");
                return e;
            }
            else return null;

        }
        else return null;
    }






    public Employee getEmployeeById(int searchId) {

        for(int i = 0, y = position-1;true;i++,y--)
        {
            Employee e = allEmployees[i];
            if(e.getId() == searchId )
            {
                 return allEmployees[i];
            }
            if(allEmployees[y].getId() == searchId)
            {
                return allEmployees[y];
            }
        }

    }

    public Employee getEmployeeByLaptop(String sNO) {

        for(int i = 0, y = position-1;true;i++,y--)
        {

            if(allEmployees[i].getLaptop().getsNO().equals(sNO))
            {
                return allEmployees[i];
            }
            if(allEmployees[y].getLaptop().getsNO().equals(sNO))
            {
                return allEmployees[y];
            }
        }

    }
    public Employee getEmployeeByProject(String projectName) {
        for(int i = 0;true;i++)
        {

            if(allEmployees[i].getProject().equals(projectName))
            {
                return allEmployees[i];
            }


        }
    }


    public Laptop getEmployeeLaptopById(int id) {

        if(getEmployeeById(id) != null){
            return getEmployeeById(id).getLaptop();
        }
        else return null;
    }


}
