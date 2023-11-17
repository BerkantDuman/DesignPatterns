package org.patterns.behaviroal.visitor;

public class SalaryVisitor implements Visitor{


    @Override
    public void visit(HumarResourcer humarResourcer) {
        humarResourcer.setPrice(1000);
    }

    @Override
    public void visit(SalesMan salesMan) {
        salesMan.setPrice(999);
    }

    @Override
    public void visit(Manager manager) {
        manager.setPrice(20000);
    }

    @Override
    public void visit(EmployeeList employeeList) {
        System.out.println("All salaries calculated");
    }
}
