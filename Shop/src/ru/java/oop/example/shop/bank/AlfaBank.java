package ru.java.oop.example.shop.bank;

public class AlfaBank extends AbstractBank {

    public AlfaBank(String name, String creditDescription) {
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


}
