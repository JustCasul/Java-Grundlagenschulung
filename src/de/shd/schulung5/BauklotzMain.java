package de.shd.schulung5;

public class BauklotzMain {

    public static void main(String[] args) {

        Bauklotz roterKlotz = new Bauklotz("Brücke", "rot");
        Bauklotz blauerKlotz = new Bauklotz("Würfel", "blau");
        Bauklotz gruenerKlotz = new Bauklotz("Rechteck", "grün");
        Bauklotz lilaKlotz = new Bauklotz("Kreis", "lila");
        Bauklotz gelberKlotz = new Bauklotz("Parallelogram", "gelb");
        Bauklotz braunerKlotz = new Bauklotz("Pyramide", "braun");


        System.out.println(roterKlotz.getFarbe());
        System.out.println(roterKlotz.getForm());
        roterKlotz.setFarbe("blau");
        System.out.println(roterKlotz.getFarbe());
        roterKlotz.setForm("Kreis");
        System.out.println(roterKlotz.getForm());
        System.out.println(blauerKlotz.getFarbe());
        System.out.println(blauerKlotz.getForm());
        System.out.println(gruenerKlotz.getFarbe());
        System.out.println(gruenerKlotz.getForm());
        System.out.println(lilaKlotz.getFarbe());
        System.out.println(lilaKlotz.getForm());
        System.out.println(gelberKlotz.getFarbe());
        System.out.println(gelberKlotz.getForm());
        System.out.println(braunerKlotz.getFarbe());
        System.out.println(braunerKlotz.getForm());

        boolean rightStaticColor = Bauklotz.equalStaticColor(roterKlotz.getFarbe(),blauerKlotz.getFarbe());
        System.out.println(rightStaticColor);
        boolean falseStaticColor = Bauklotz.equalStaticColor(lilaKlotz.getFarbe(),gelberKlotz.getFarbe());
        System.out.println(falseStaticColor);

        boolean rightStaticForm = Bauklotz.equalStaticForm(roterKlotz.getForm(),lilaKlotz.getForm());
        System.out.println(rightStaticForm);
        boolean falseStaticForm = Bauklotz.equalStaticForm(roterKlotz.getForm(),blauerKlotz.getForm());
        System.out.println(falseStaticForm);

        /*
        boolean rightObjectColor = roterKlotz.equalObjectColor(this.getFarbe(),blauerKlotz.getFarbe());
        System.out.println(rightObjectColor);
        */

    }

}
