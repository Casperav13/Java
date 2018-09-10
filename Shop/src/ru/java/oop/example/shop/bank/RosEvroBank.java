package ru.java.oop.example.shop.bank;

public class RosEvroBank extends AbstractBank {



    public RosEvroBank(String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    public void checkInfo() {
        super.checkInfo();
    }

    @Override
    public void giveCredit() {
        // доработанная реализация
    }


    // сбербанк умеет также рассматривать срочные заявки с помощью перегруженного метода
    public void checkInfo(boolean critical){

    }
}
