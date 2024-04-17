package de.shd.schulung5;

public class Bauklotz {

    private String form;
    private String farbe;
    private int counter;

    /*
    //Standard Konstruktor
    public Bauklotz(){

        this.form = "Brücke";
        this.farbe = "rot";

    }
    */

    //Parametrisierter Konstruktor
    public Bauklotz(String form, String farbe) {
        this.form = form;
        this.farbe = farbe;
        counter++;
    }

    public String getForm(){
        return form;
    }

    public void setForm(String form){
        this.form = form;
    }

    public String getFarbe(){
        return farbe;
    }

    public void setFarbe(String farbe){
        this.farbe = farbe;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public static boolean  equalStaticColor(String farbe1, String farbe2){

        return farbe1.equals(farbe2);

    }

    public static boolean  equalStaticForm(String form1, String form2){

        return form1.equals(form2);

    }

    public boolean equalObjectColor(String klotz1, String klotz2){

        return klotz1.equals(klotz2);

    }

    public boolean equalObjectForm(String klotz1, String klotz2){

        return klotz1.equals(klotz2);

    }

}
