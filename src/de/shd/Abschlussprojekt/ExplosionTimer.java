package de.shd.Abschlussprojekt;

import java.util.Timer;
import java.util.TimerTask;

public class ExplosionTimer {

    private Timer timer;

    //Timer erstellen und starten
    public void timerInit(int delay) {
        //timer erstellen
        timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Your "); //Nachricht bei auslaufen des Timers
                System.exit(0); //Beenden des Programms wegen Auslauf der Zeit
            }
        };
        timer.schedule(task, delay); //Timer starten
    }

    public void timerStop (){
        timer.cancel();
    }

}
