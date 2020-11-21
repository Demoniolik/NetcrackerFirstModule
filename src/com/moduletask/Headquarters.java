package com.moduletask;

import com.moduletask.exceptions.CannotReportExceptions;

public class Headquarters {

    public static void main(String[] args) {

        Solder solder1 = new Solder("Name 1", 21, "Commander1");
        Solder solder2 = new Solder("Name 2", 18, "Commander1");
        Solder solder3 = new Solder("Name 3", 27, "Commander1");
        Solder solder4 = new Solder("Name 4", 25, "Commander2");
        Solder solder5 = new Solder("Name 5", 24, "Commander2");
        Solder solder6 = new Solder("Name 6", 32, "Commander2");

        Commander commander1 = new Commander("Commander 1", 45, "General1");
        commander1.addSolder(solder1);
        commander1.addSolder(solder2);
        commander1.addSolder(solder3);

        Commander commander2 = new Commander("Commander 2", 45, "General2");
        commander2.addSolder(solder4);
        commander2.addSolder(solder5);
        commander2.addSolder(solder6);

        General general1 = new General("General 1", 57, "No one");
        general1.addCommander(commander1);
        general1.addCommander(commander2);

        Human[] humans = new Human[] {
                solder1, solder2, solder3,
                solder4, solder5, solder6,
                commander1, commander2,
                general1
        };

        for (Human human : humans) {
            try {
                human.report();
            } catch (CannotReportExceptions cannotReportExceptions) {
                cannotReportExceptions.printStackTrace();
            }
        }

    }

}
