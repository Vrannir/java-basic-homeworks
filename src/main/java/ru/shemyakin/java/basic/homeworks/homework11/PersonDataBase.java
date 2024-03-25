package ru.shemyakin.java.basic.homeworks.homework11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonDataBase {
    private Map<Long, Person> dbase;
    private final Set<Position> setManager = new HashSet<>();

    public PersonDataBase() {
        this.dbase = new HashMap<>();
        this.setManager.add(Position.MANAGER);
        this.setManager.add(Position.DIRECTOR);
        this.setManager.add(Position.BRANCH_DIRECTOR);
        this.setManager.add(Position.SENIOR_MANAGER);
    }

    public void add(String name, Position position, Long id) {
        this.dbase.put(id, new Person(name, position, id));
    }

    public Person findById(Long id) {
        return dbase.get(id);
    }

    public boolean isManager(Person person) {
        return setManager.contains(person.getPosition());
    }

    public boolean isEmployee(Person person) {
        return !setManager.contains(person.getPosition());
    }

}
