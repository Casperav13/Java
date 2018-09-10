package ru.java.oop.example.shop.client;

import ru.java.oop.example.shop.interfaces.GoodsInterface;
import ru.java.oop.example.shop.interfaces.VisitorInterface;

public abstract class AbstractVisitor implements VisitorInterface {

    private String name;

    public AbstractVisitor() {
    }

    public AbstractVisitor(String name) {
        this.name = name;
    }

    @Override
    public void buy(GoodsInterface goods){
        System.out.println("buy "+goods.getName());
    }



    @Override
    public void returnGoods(GoodsInterface goods){

    }

    @Override
    public String getName() {
        return name;
    }



}
