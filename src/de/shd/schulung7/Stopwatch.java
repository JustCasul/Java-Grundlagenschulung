package de.shd.schulung7;

import java.time.Duration;

public class Stopwatch {

    private long startTimeMillis;

    public void start(){

        startTimeMillis = System.currentTimeMillis();

    }

    public void stopAndPrint(){

        System.out.println(formatTime(System.currentTimeMillis() - startTimeMillis));

    }

    private String formatTime(long durationInMillis){

        final Duration duration = Duration.ofMillis(durationInMillis);
        return String.format("Zeit: %d:%02d.%03d", duration.toMinutes(), duration.toSecondsPart(), duration.toMillisPart());

    }

}
