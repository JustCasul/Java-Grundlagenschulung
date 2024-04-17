package de.shd.schulung4;

public class Aufgabe6Loesung {

    static void move( int n, String fromPeg, String toPeg, String usingPeg ) {



        if ( n > 1 ) {

            move( n - 1, fromPeg, usingPeg, toPeg );

            System.out.printf( "Bewege Scheibe %d von der %s zur %s.%n", n, fromPeg, toPeg );

            move( n - 1, usingPeg, toPeg, fromPeg );

        }

        else

            System.out.printf( "Bewege Scheibe %d von der %s zur %s.%n", n, fromPeg, toPeg );

    }



    public static void main( String[] args ) {

        move( 3, "Kupfersäule", "Goldsäule", "Silbersäule" );

    }

}


