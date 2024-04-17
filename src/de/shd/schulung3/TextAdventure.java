package de.shd.schulung3;

import de.shd.java.course.util.ConsoleHelper;

public class TextAdventure {

    static int stupidCount = 0;
    static int shinyGem = 0;

    public static void main(String[] args) {

        /** Map: /////////////////////////////////////
                 /Tree/ /Tree/ /Tree/ /Tree/ /  EXIT /
                 /Tree/ /Tree/ /Tree/ /Weg4/ /Monster/
                 /Weg7/ /Tree/ /Weg2/ /Weg3/ /  Tree /
                 /Weg6/ /Weg5/ /Weg1/ /Tree/ /  Tree /
                 /Tree/ /Tree//Start/ /Tree/ /  Tree /
                 /////////////////////////////////////

                (Out of bounds = Tree)
         */




        start();



    }


    public static void start(){

        System.out.println("You wake up in a creepy dark forest not able to see any way out of it, you choose to just go for it and try to search for an exit to end this nightmare.");

        String direction = ConsoleHelper.readString("Which direction do you want to go?");


        //Directions
        if ("north".equals(direction)){
            weg1();
        }
        else if ("east".equals(direction) || "south".equals(direction) || "west".equals(direction)){
            tree();
            start();
        }
        else {
            System.out.println("Not a possible input.");
            start();
        }

    }

    //Baum
    public static void tree(){

        stupidCount++;
        if (stupidCount < 5) {
            System.out.println("You see Trees, a lot of Trees and no way to fight your way through them (better choose another way).");
        }
        else if (stupidCount == 5) {
            System.out.println("You've run into trees 5 times by now and i think its starting to hurt, you might wanna watch where you're going.");
        }
        else if (stupidCount == 10) {
            System.out.println("This is the 10th tree you've ran into by now and your Nose already started bleeding, you might wanna watch out before getting a traumatic brain injury.");
        }
        else if (stupidCount == 20) {
            System.out.println("You feel kinda dizzy and your head starts bleeding, one or two more and you're done.");
        }
        else if (stupidCount == 21){
            System.out.println("Your head is bleeding very hard and you feel very dizzy, its not looking too good for you buddy.");
        }
        else if (stupidCount == 22){
            System.out.println("You fall to the ground and you'r eyes slowly close, you don't wake up again YOU DIED");
            System.exit(0);
        }

    }

    public static void weg1(){

        System.out.println("You,ve found a Way but now the paths separate, you can either go north where a weird smell is coming from, or go west which looks like its leading deeper into the woods.");

        String direction = ConsoleHelper.readString("Which direction do you want to go?");

        //Directions
        if ("north".equals(direction)){
            weg2();
        }
        else if ("east".equals(direction)){
            tree();
            weg1();
        }
        else if ("south".equals(direction)){
            start();
        }
        else if ("west".equals(direction)){
            weg5();
        }
        else {
            System.out.println("Not a possible input.");
            weg1();
        }

    }
    public static void weg2(){

        System.out.println("You walk towards the stench and can smell it more and more but cant really identify where its coming from, the only direction you see is yourself beeing able to walk to is east so you might as well go there.");

        String direction = ConsoleHelper.readString("Which direction do you want to go?");

        //Directions
        if ("north".equals(direction) || "west".equals(direction)){
            tree();
            weg2();
        }
        else if ("east".equals(direction)){
            weg3();
        }
        else if ("south".equals(direction)){
            weg1();
        }
        else {
            System.out.println("Not a possible input.");
            weg2();
        }

    }
    public static void weg3(){

        System.out.println("You walk further and suddenly hear a loud scream that could only come from an animal and lots of crows start flying over your head, away from the direction you're heading, do you want to go further to north or piss your pants?");

        String direction = ConsoleHelper.readString("Which direction do you want to go?");

        //Directions
        if ("north".equals(direction)){
            weg4();
        }
        else if ("east".equals(direction) || "south".equals(direction)){
            tree();
            weg3();
        }
        else if ("west".equals(direction)){
            weg2();
        }
        else {
            System.out.println("Not a possible input.");
            weg3();
        }

    }
    public static void weg4(){

        System.out.println("The smell is so horrible and persistent now, you can barely breath at all. You look east and see a huge shadowy figure in the distance and it seems like it sees you too (guess its too late to turn back).");

        String direction = ConsoleHelper.readString("Do you approach the Beast?");

        //Directions
        if ("north".equals(direction) || "west".equals(direction)){
            tree();
            weg4();
        }
        else if ("east".equals(direction)){
            monster();
        }
        else if ("south".equals(direction)){
            System.out.println("You try to turn around and run but the creature instantly picks up that you're running away and in the blink of an eye it catches you and you die without knowing what happened GAME OVER.");
            System.exit(0);
        }
        else {
            System.out.println("Not a possible input.");
            weg4();
        }

    }

    public static void weg5(){

        System.out.println("You choose the 'good smelling way' and as you're walking along trying to find an exit you see small particles on the floor that look like glitter pointing towards west, follow them or turn back?");

        String direction = ConsoleHelper.readString("Which direction do you want to go?");

        //Directions
        if ("north".equals(direction) || "south".equals(direction)){
            tree();
            weg5();
        }
        else if ("east".equals(direction)){
            weg1();
        }
        else if ("west".equals(direction)){
            weg6();
        }
        else {
            System.out.println("Not a possible input.");
            weg5();
        }

    }
    public static void weg6(){

        System.out.println("You walk and walk until you see something shining in the distance, what could that be?.");

        String direction = ConsoleHelper.readString("Which direction do you want to go?");

        //Directions
        if ("north".equals(direction)){
            weg7();
        }
        else if ("east".equals(direction)){
            weg5();
        }
        else if ("south".equals(direction) || "west".equals(direction)){
            tree();
            weg6();
        }
        else {
            System.out.println("Not a possible input.");
            weg6();
        }

    }
    public static void weg7(){

        System.out.println("You walk towards the shining light and see a mountain of beatiful white crystals, you put one in your pocket and notice how you start feeling lighter as if you just relived a lot of fear and pressure. But an exit is still not in sight, and it seems like uyou can only go back and choose the other way.");
        shinyGem++;
        String direction = ConsoleHelper.readString("Which direction do you want to go?");

        //Directions
        if ("north".equals(direction) || "west".equals(direction) || "east".equals(direction)){
            tree();
            weg7();
        }
        else if ("south".equals(direction)){
            weg6();
        }
        else {
            System.out.println("Not a possible input.");
            weg7();
        }

    }

    public static void monster(){

        if (shinyGem >= 1){
            System.out.println("You apporach the beast and look down to see the crystal in your pocket shining brighter and brighter, you look up again and... nothing, the Beast vanished, seems like youre pretty lucky for finding that crystal. Anyways, you look around and see that north of you is a little bit of light shining through the trees, might that be the exit?");
        }
        else {
            System.out.println("You approach the Beast slowly, and... it launches at you at a speed your eyes can't register, its over, the Beast is gone? You look down and see... rEd... you died faster then you could comprehend (atleast it was painless?) GAME OVER.");
            System.exit(0);
        }

        String direction = ConsoleHelper.readString("Which direction do you want to go?");

        //Directions
        if ("north".equals(direction)){
            exit();
        }
        else if ("east".equals(direction) || "south".equals(direction)){
            tree();
            monsterEmpty();
        }
        else if ("west".equals(direction)){
            System.out.println("Theres no sence in going back now.");
            monsterEmpty();
        }
        else {
            System.out.println("Not a possible input.");
            weg7();
        }


    }

    public static void monsterEmpty(){

        System.out.println("You're so close to the exit!");

        String direction = ConsoleHelper.readString("Which direction do you want to go?");

        if ("north".equals(direction)){
            exit();
        }
        else if ("east".equals(direction) || "south".equals(direction)){
            tree();
            monsterEmpty();
        }
        else if ("west".equals(direction)){
            System.out.println("Theres no sence in going back now.");
            monsterEmpty();
        }
        else {
            System.out.println("Not a possible input.");
            weg7();
        }

    }

    public static void exit(){

        System.out.println("You did it, you found your way out of the maze and didn't die form the beast (or ran into trees until you died) GOOD JOB! YOU WON!");
        System.exit(0);

    }


}
