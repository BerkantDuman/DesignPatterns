package org.patterns.behaviroal.visitor;

public class Main {

    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();
        System.out.println("Before: " + employeeList.getPrice());
        SalaryVisitor salaryVisitor = new SalaryVisitor();
        employeeList.accept(salaryVisitor);
        System.out.println("After: " + employeeList.getPrice());
    }
}
