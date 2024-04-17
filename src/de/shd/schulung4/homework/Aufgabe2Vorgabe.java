package de.shd.schulung4.homework;

public class Aufgabe2Vorgabe {

    public static void main(String[] args) {

        boolean b = binaereSucheIterativ(new int[]{1,2,3,4,5,6,7,8,9,10}, 5);
        System.out.println(b);

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
