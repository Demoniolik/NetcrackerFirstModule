package com.moduletask;

import com.moduletask.exceptions.CannotReportExceptions;
import com.moduletask.exceptions.NotAcceptableToCombatException;

public class Solder extends Human {

    private String whoIDependOn;
    private String role;

    public Solder(String name, int age, String whoIDependOn) {
        super(name, age);
        this.role = "Solder";
        this.whoIDependOn = whoIDependOn;
    }

    @Override
    public void report() throws CannotReportExceptions {
        super.report();
        System.out.println("I am " + role + " my name is" + name + ", depend on - " + whoIDependOn);
    }

    @Override
    public void toCombat() throws NotAcceptableToCombatException {
        super.toCombat();
        System.out.println("I am ready to combat");
    }
}
