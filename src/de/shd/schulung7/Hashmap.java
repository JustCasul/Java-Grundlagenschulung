package de.shd.schulung7;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

    public static void main(String[] args) {

        Item dagger = new Item("Klinge von Drakthaar", "Waffe", 3.14, 3000);
        Item liandrys = new Item("Liandry's Mask", "Helm", 1.3, 3100);
        Item gargoyles = new Item("Gargoyle's Stoneplate", "Harnisch", 10.5, 3200);
        Item ionianBoots = new Item("Boots of Ionia", "Schuhe", 3, 1100);
        Item anathemas = new Item("Anathema's Chains", "Handschuhe", 2.4, 3000);

        Map<String, Item> typeToItemMap = new HashMap<>();
        typeToItemMap.put(dagger.getType(), dagger);
        typeToItemMap.put(liandrys.getType(), liandrys);
        typeToItemMap.put(gargoyles.getType(), gargoyles);
        typeToItemMap.put(ionianBoots.getType(), ionianBoots);
        typeToItemMap.put(anathemas.getType(), anathemas);

        for (Item item: typeToItemMap.values()) {
            System.out.println(item.getName() + " " + item.getType() + " " + item.getWeigth() + " " + item.getPrice());
        }

        for (String string : typeToItemMap.keySet()){
            System.out.println(string);
        }

        for (Map.Entry<String, Item> entry: typeToItemMap.entrySet()){
            System.out.println(entry.getKey()+ ": " + entry.getValue().getName());
        }

        Item swiftnessBoots = new Item("Boots of Swiftness", "Schuhe", 7.35, 600);
        typeToItemMap.put(swiftnessBoots.getType(), swiftnessBoots);

        for (Item item: typeToItemMap.values()) {
            System.out.println(item.getName() + " " + item.getType() + " " + item.getWeigth() + " " + item.getPrice());
        }

        for (String string : typeToItemMap.keySet()){
            System.out.println(string);
        }

        for (Map.Entry<String, Item> entry: typeToItemMap.entrySet()){
            System.out.println(entry.getKey()+ ": " + entry.getValue().getName());
        }

    }

}
