package de.shd.schulung6;

public class FinalExample {

    public static void main(String[] args) {

        final int zahl = 5;
//        zahl = 6;

        final Item item = new Item(5);
//        item = new Item(6);
//        item = null;
        item.setValue(10);

        HealingPotion healingpotion = new HealingPotion("small potion", 26);
        System.out.println(healingpotion);

        BauklotzRecord bauklotz1 = new BauklotzRecord(BauklotzFarbe.ROT, BauklotzForm.BRUECKE);
        BauklotzRecord bauklotz2 = new BauklotzRecord(BauklotzFarbe.BLAU, BauklotzForm.PYRAMIDE);
        BauklotzRecord bauklotz3 = new BauklotzRecord(BauklotzFarbe.GELB, BauklotzForm.QUADER);
        BauklotzRecord bauklotz4 = new BauklotzRecord(BauklotzFarbe.BLAU, BauklotzForm.BRUECKE);
        BauklotzRecord bauklotz5 = new BauklotzRecord(BauklotzFarbe.ROT, BauklotzForm.PYRAMIDE);
        System.out.println(bauklotz1);
        System.out.println(bauklotz2);
        System.out.println(bauklotz3);
        System.out.println(bauklotz4);
        System.out.println(bauklotz5);

        WeaponRecord schwert = new WeaponRecord(WeaponType.SCHWERT, "Schwert", 10);
        WeaponRecord axt = new WeaponRecord(WeaponType.AXT, "Axt", 20);
        WeaponRecord bogen = new WeaponRecord(WeaponType.BOGEN, "Bogen", 25);
        WeaponRecord morgenstern = new WeaponRecord(WeaponType.MORGENSTERN, "Morgenstern", 30);
        WeaponRecord zweihaender = new WeaponRecord(WeaponType.ZWEIHAENDER, "Zweihänder", 40);

        System.out.println(schwert.getTotalDamage());
    }

}
