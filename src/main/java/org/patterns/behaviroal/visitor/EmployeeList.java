package org.patterns.behaviroal.visitor;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList implements Employee{

    List<Employee> employeeList = new ArrayList<Employee>();


    public EmployeeList(){
        Manager manager = new Manager();
        HumarResourcer hr = new HumarResourcer();
        SalesMan salesMan = new SalesMan();
        employeeList.add(hr);
        employeeList.add(manager);
        employeeList.add(salesMan);
    }

    public int getPrice() {
        return employeeList.stream().mapToInt(Employee::getPrice).sum();
    }

    @Override
    public void accept(Visitor visitor) {
        employeeList.forEach(e -> e.accept(visitor));
        visitor.visit(this);
    }
}
