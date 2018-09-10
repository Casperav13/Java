package ru.java.oop.example.shop.service;

import ru.java.oop.example.shop.enums.ConsultResult;
import ru.java.oop.example.shop.interfaces.VisitorInterface;

public class Consultant extends AbstractEmployee {


    public Consultant() {
    }


    public Consultant(String name) {
        super(name);
    }

    public ConsultResult consult(VisitorInterface visitor){
        super.setFree(false);

        // здесь должна быть логика, купит или пойдет домой

        return ConsultResult.BUY;

    }


    public void send(){

    }


}
