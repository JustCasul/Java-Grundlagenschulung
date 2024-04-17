package de.shd.schulung3.otherthings;

import java.util.TimerTask;
import java.util.Timer;



public class timer extends TimerTask {

    private int countDown;
    private Timer t;


    public static void main(String[] args) {
        new timer(20);
    }

    public timer(int countDown){
        this.countDown = countDown;
        t = new Timer();
        t.scheduleAtFixedRate(this, 0, 1000);
    }

    public void run(){
        countDown--;
        System.out.println(countDown);
        if(countDown<=0){
            System.out.println("vorbei");
            t.cancel();
        }

    }

}
