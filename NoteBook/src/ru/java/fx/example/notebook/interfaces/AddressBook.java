package ru.java.fx.example.notebook.interfaces;

import ru.java.fx.example.notebook.objects.Person;

public interface AddressBook {

    // добавить запись
    void add(Person person);

    // внести измененные значения (подтвердить измененные данные)
    void update(Person person);

    // удалить запись
    void delete(Person person);

}
