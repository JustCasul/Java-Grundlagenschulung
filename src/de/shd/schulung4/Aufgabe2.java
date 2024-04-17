package de.shd.schulung4;

public class Aufgabe2 {

    public static void main(String[] args) {

        System.out.println(countBunnyEars(134));
        System.out.println(countBunnyEars2(13));

    }

    public static int countBunnyEars(int bunnies){

        if (bunnies > 0){

            return 2 + countBunnyEars(bunnies - 1);
        }
    return 0;
    }


    public static int countBunnyEars2(int bunnies){

        return bunnies + bunnies;

    }


}
