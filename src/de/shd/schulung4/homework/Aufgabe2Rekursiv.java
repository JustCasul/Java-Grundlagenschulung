package de.shd.schulung4.homework;

public class Aufgabe2Rekursiv {

    public static void main(String[] args) {

        boolean b = binarySearch(new int[]{1,2,3,4,6,7,8,10},1,10,5);
        System.out.println(b);

    }

    public static boolean binarySearch (int array[], int lowest, int highest, int n){

            if (highest >= lowest && lowest < array.length - 1) {
                int middle = lowest + (highest - lowest) / 2;
                if (array[middle] == n)
                    return true;
                if (array[middle] > n)
                    return binarySearch(array, lowest, middle - 1, n);
                return binarySearch(array, middle + 1, highest, n);
            }
            return false;
        }


}
