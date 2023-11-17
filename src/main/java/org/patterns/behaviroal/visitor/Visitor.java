package org.patterns.behaviroal.visitor;

public interface Visitor {

    void visit(HumarResourcer humarResourcer);

    void visit(SalesMan salesMan);

    void visit(Manager manager);

    void visit(EmployeeList employeeList);
}
