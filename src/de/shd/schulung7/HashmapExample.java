package de.shd.schulung7;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {

    public static void main(String[] args) {

        Map<String, String> typeToItemMap = new HashMap<>();
        typeToItemMap.put("Helm", "Stahlhelm");
        typeToItemMap.put("Waffe", "Axt");
        typeToItemMap.put("Schmuck", "Juwelenring");
        typeToItemMap.put("Rüsung", "Netherite");

        final boolean hasHelm = typeToItemMap.containsKey("Helm");
        System.out.println(hasHelm);
        final String helm = typeToItemMap.get("Helm");
        System.out.println(helm);

        //Key = Name, Value = Wert

    }

}
