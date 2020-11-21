package com.moduletask;

import com.moduletask.exceptions.CannotReportExceptions;
import com.moduletask.exceptions.NotAcceptableToCombatException;

public class General extends Human {

    private String whoIDependOn;
    private String role;
    private Commander[] commandersToLead;
    private int size;

    public General(String name, int age, String whoIDependOn) {
        super(name, age);
        final int MAX_VALUE_OF_COMMANDERS = 3;
        this.commandersToLead = new Commander[MAX_VALUE_OF_COMMANDERS];
        this.role = "General";
        this.whoIDependOn = whoIDependOn;
    }

    public void addCommander(Commander commander) {
        commandersToLead[size++] = commander;
    }

    @Override
    public void report() throws CannotReportExceptions {
        super.report();
        System.out.println("I am " + role + " my name is" + name + ", depend on - " + whoIDependOn);
    }

    @Override
    public void toCombat() throws NotAcceptableToCombatException {
        super.toCombat();
        System.out.println();
        System.out.println("I am ready to combat, but I will better to call commander to do the thing");
    }

}
