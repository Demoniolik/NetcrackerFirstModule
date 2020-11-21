package com.moduletask;

import com.moduletask.exceptions.CannotReportExceptions;
import com.moduletask.exceptions.NotAcceptableToCombatException;

public class Commander extends Human {

    private String whoIDependOn;
    private String role;
    private Solder[] soldersToLead;
    private int size;


    public Commander(String name, int age, String whoIDependOn) {
        super(name, age);
        final int MAX_VALUE_OF_SOLDERS = 3;
        this.soldersToLead = new Solder[MAX_VALUE_OF_SOLDERS];
        this.role = "Commander";
        this.whoIDependOn = whoIDependOn;
    }

    public void addSolder(Solder solder) {
        soldersToLead[size++] = solder;
    }

    @Override
    public void report() throws CannotReportExceptions {
        super.report();
        System.out.println("I am " + name + ", depend on - " + whoIDependOn);
    }

    @Override
    public void toCombat() throws NotAcceptableToCombatException {
        super.toCombat();
        System.out.println();
        System.out.println("I am ready to combat, but I will better to sit at headquarters");
    }
}
