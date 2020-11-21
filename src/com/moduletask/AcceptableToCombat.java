package com.moduletask;

import com.moduletask.exceptions.CannotReportExceptions;
import com.moduletask.exceptions.NotAcceptableToCombatException;

public interface AcceptableToCombat {
    void toCombat() throws NotAcceptableToCombatException;
    void report() throws CannotReportExceptions;
}
