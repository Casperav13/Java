package ru.java.oop.example.shop.service;

import ru.java.oop.example.shop.SalesRoom;
import ru.java.oop.example.shop.interfaces.DepartmentInterface;
import ru.java.oop.example.shop.interfaces.EmployeeInterface;

public class Administrator {

    private SalesRoom salesRoom;

    public Administrator(SalesRoom salesRoom) {
        this.salesRoom = salesRoom;
    }

    public Consultant getFreeConsultant(DepartmentInterface departmentInterface){
        for (EmployeeInterface employee : departmentInterface.getEmployeeList()){
            if (employee instanceof Consultant){
                if (employee.isFree()){
                    return (Consultant)employee;
                }
            }
        }

        return null;
    }


}
