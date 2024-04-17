package de.shd.schulung7.Homework;

import java.util.*;

/**
 * <h2>Hausaufgabe: Inventar</h2>
 * <p>
 * Die Klasse Inventar hält eine Liste von {@link Item}. Aufgabe ist es, die Methoden zu implementieren. Ihr dürft euch gerne private Methoden
 * erstellen um euren Code besser zu strukturieren, falls dies für euch notwendig sein sollte.
 * </p>
 *
 * @author Christoph Gragert (cgr@shd.de)
 */
public class Inventory
{

   /**
    * Liste aller Items im Inventar.
    */
   private final List<Item> items;

   /**
    * Konstruktor zum Erzeugen eines Inventars.
    *
    * @param items alle Items, die im Inventar enthalten sind.
    */
   public Inventory(final List<Item> items) {
      this.items = items;
   }

   /**
    * <h2>Aufgabe 1: Gruppiere alle Items in einer Map (Punkte: 6)</h2>
    * <p>
    * Die Items sollen in einer Map nach ihrer {@link ValueGroup} gruppiert werden. Es werden folgende Gruppen unterschieden:
    *    <ul>
    *       <li>{@link ValueGroup#VALUABLE} - Wertvoll (alle Items die einen Wert 100 oder höher haben)</li>
    *       <li>{@link ValueGroup#WORTHLESS} - Wertlos (alle Items die einen Wert kleiner 10 haben)</li>
    *       <li>{@link ValueGroup#MEDIOCRE} - Mittelmäßig (alle restlichen Items)</li>
    *    </ul>
    * </p>
    */
   public Map<ValueGroup, List<Item>> groupItemsByValueGroup() {
      Map<ValueGroup, List<Item>> valueGroupToItems = new HashMap<>();

      for (Item i : items) {

         ValueGroup valueGroup = getValueGroup(i.getValue());
         List<Item> valueGroupItems = valueGroupToItems.get(valueGroup);

         if (valueGroupItems == null) {

            valueGroupItems = new ArrayList<>();

         }

         valueGroupItems.add(i);
         valueGroupToItems.put(valueGroup, valueGroupItems);

      }
      return valueGroupToItems;
   }

   private ValueGroup getValueGroup(int worth) {
      if (worth >= 100) {
         return ValueGroup.VALUABLE;
      }
      if (worth < 10) {
         return ValueGroup.WORTHLESS;
      }
      return ValueGroup.MEDIOCRE;
   }

   /**
    * <h2>Aufgabe 2: Namen aller Items als Komma-separierter Text (Punkte: 6)</h2>
    * <p>
    * Es sollen die Namen aller Items ausgegeben werden. Beispiel:
    * <pre>
    *       "Holzschwert, Stahlhelm, Lederstiefel, ..., Heiltrank"
    *    </pre>
    * <b>Wichtig:</b> Nach dem vor dem ersten und nach dem letzten Element darf KEIN Komma stehen!<br>
    * </p>
    * <p>
    * <b>Tipp:</b> Recherchiert, wie man String über ein Trennzeichen (Delimiter) zusammenfügen kann.
    * </p>
    */
   public String getNamesOfAllItemsAsCommaSeparatedString()
   {
      List<String> ItemName = new ArrayList<>();

      for (Item j : items) {
         ItemName.add(j.getName());
      }

      System.out.print(", " + ItemName);
      return String.join(", ", ItemName);

   }

   /**
    * <h2>Aufgabe 3: Keine doppelten Items (Punkte: 2)</h2>
    * Liefere eine Liste zurück, in der alle doppelten Items rausgefiltert wurden. Ein Item ist doppelt, wenn der Name und der ItemType gleich sind.
    */
   public List<Item> getUniqueItemsOnly()
   {
      Set<Item> uniqueItems = new HashSet<>(items);
      return new ArrayList<>(uniqueItems);
   }

   /**
    * <h2>Aufgabe 4: Rückgabe einer sortierten Liste. (Punkte: 6)</h2>
    * Liefere eine Liste von Namen aller Items zurück. Die Items sollen in Abhängigkeit des Parameters "descending" aufwärts oder
    * abwärts sortiert werden.
    * <p>
    * <b>Tipp:</b> Die Liste besitzt eine Methode {@link List#sort(Comparator)}. Recherchiere, wie man aufwärts und abwärts sortieren kann.
    * </p>
    *
    * @param descending falls true, so wird abwärts sortiert, ansonsten aufwärts.
    */
   public List<String> getNamesOfItemsSorted(boolean descending)
   {
      List<String> ItemNames = new ArrayList<>();

      for (Item item : items) {
         ItemNames.add(item.getName());
      }
      if (descending) {
         ItemNames.sort(Comparator.reverseOrder());
      } else {
         ItemNames.sort(Comparator.naturalOrder());
      }
      return ItemNames;

   }


   /**
    * <h2>Aufgabe 5: Rückgabe einer Liste gefiltert nach Typ. (Punkte: 4)</h2>
    * Liefere eine Liste von Items zurück, die alle den gleichen "ItemType" haben, wie der übergebene Parameter.
    *
    * @param itemType ItemType nach dem gefiltert werden soll
    */
   public List<Item> getItemsFilteredByType(final ItemType itemType)
   {
      List<Item> ItemsType = new ArrayList<>();
      for (Item k : items) {
         if (itemType == k.getItemType()) {
            ItemsType.add(k);
         }
      }
      return ItemsType;
   }
}
