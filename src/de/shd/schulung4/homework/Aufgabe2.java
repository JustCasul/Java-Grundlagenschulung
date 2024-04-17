package de.shd.schulung4.homework;

public class Aufgabe2 {

    public static void main(String[] args) {

    }

    public static boolean binaereSucheIterativ(int[] array, int n)
    {











        int links, mitte, rechts;
        links = 0;
        rechts = array.length - 1;
        while(links <= rechts)
        {
            mitte = (int)((rechts + links) / 2);
            if(array[mitte] == n){
                return true;
            }
            if(array[mitte] < n){
                links = mitte + 1;
            }
            if(array[mitte] > n){
                rechts = mitte - 1;
            }
        }
        return false;
    }

}
