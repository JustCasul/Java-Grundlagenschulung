package de.shd.schulung6;

public enum BauklotzForm {
    QUADER("quader", "cuboid", "q"),
    PYRAMIDE("pyramide", "pyramid", "p"),
    BRUECKE("brücke", "bridge", "b");

    private final String name;

    private final String[] alias;

    BauklotzForm(String name, String... alias){
        this.name = name;
        this.alias = alias;
    }

    public String getName() {
        return name;
    }

    public String[] getAlias() {
        return alias;
    }

    public static BauklotzForm getFormForName(String name){
        BauklotzForm[] formen = values();
        for (BauklotzForm form: formen) {
            for (String aliasName : form.alias) {
                if (name.equalsIgnoreCase(form.getName()) || aliasName.equalsIgnoreCase(name)){
                    return form;
                }
            }
        }
        return null;
    }

}
