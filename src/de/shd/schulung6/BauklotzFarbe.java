package de.shd.schulung6;

public enum BauklotzFarbe {
    ROT("rot", "red", "r"),
    BLAU("blau", "blue", "b"),
    GELB("gelb", "yellow", "g");

    private final String name;

    private final String[] alias;

    BauklotzFarbe(String name, String... alias){
        this.name = name;
        this.alias = alias;
    }

    public String getName() {
        return name;
    }

    public String[] getAlias() {
        return alias;
    }

    public static BauklotzFarbe getFarbeForName(String name){
        BauklotzFarbe[] farben = values();
        for (BauklotzFarbe farbe: farben) {
            for (String aliasName : farbe.alias) {
                if (name.equalsIgnoreCase(farbe.getName()) || aliasName.equalsIgnoreCase(name)){
                    return farbe;
                }
            }
        }
        return null;
    }

}
