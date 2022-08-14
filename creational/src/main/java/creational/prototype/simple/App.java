package creational.prototype.simple;

import java.util.List;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee = new Employee();
        employee.loadData();
        System.out.println(employee.getEmployeeList());
        Employee employee1 = (Employee) employee.clone();
        List<String> employeeList = employee.getEmployeeList();
        employeeList.add("Selin");
        employeeList.add("Turan");
        System.out.println(employeeList);
        System.out.println(employeeList.hashCode() == employee.getEmployeeList().hashCode());
    }
}
