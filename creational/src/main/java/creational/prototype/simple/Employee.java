package creational.prototype.simple;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {
    private final List<String> employeeList;

    public Employee() {
        employeeList = new ArrayList<String>();
    }

    public Employee(List<String> employeeList) {
        this.employeeList = employeeList;
    }

    public void loadData() {
        //read all employees from database and put into the list
        employeeList.add("Simon");
        employeeList.add("Alexis");
        employeeList.add("Sancho");
    }

    public List<String> getEmployeeList() {
        return employeeList;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        List<String> empList = new ArrayList<String>(this.getEmployeeList());
        return new Employee(empList);
    }
}
