package ru.java.oop.example.shop.interfaces;

import java.util.ArrayList;

public interface DepartmentInterface {

    String getName();

    ArrayList<EmployeeInterface> getEmployeeList();

    ArrayList<GoodsInterface> getGoodsList();

}
