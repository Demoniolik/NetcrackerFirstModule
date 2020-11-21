package com.moduletask;

import com.moduletask.exceptions.CannotReportExceptions;
import com.moduletask.exceptions.NotAcceptableToCombatException;

public class Human implements AcceptableToCombat {

    protected String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void toCombat() throws NotAcceptableToCombatException {

        final int AGE_ACCEPTABLE_TO_COMBAT = 21;
        if (age < AGE_ACCEPTABLE_TO_COMBAT) {
            throw new NotAcceptableToCombatException("This human + " + name + ", cannot be accepted to combat");
        }
    }

    @Override
    public void report() throws CannotReportExceptions {
        if (name == null || name.equals("")) {
            throw new CannotReportExceptions("Cannot report because person have no name");
        }
    }
}
