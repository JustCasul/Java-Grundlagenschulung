package de.shd.schulung1;

public class ANDandOR {

    public static void main(String[] args) {

        //&& Und Operator
        boolean benIsCool = true;
        boolean benIsTall = false;
        boolean benIsCoolAndTall = benIsCool && benIsTall;

        // -> || Oder Operator
        boolean benIsCoolOrTall = benIsCool || benIsTall;
        if(benIsCoolOrTall) {
            System.out.println("");
        }

    }

}
