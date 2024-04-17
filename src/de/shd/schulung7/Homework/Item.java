package de.shd.schulung7.Homework;

import java.util.Objects;

/**
 * Klasse eines Items.
 * <p>
 * Für ein Item gilt:
 *    <ul>
 *       <li>Das Feld {@link #itemType} ist nicht null. (Dies wird nicht programmatisch geprüft, aber ihr könnt diese Annahme machen.)</li>
 *       <li>Das Feld {@link #value} ist größer 0. (Dies wird nicht programmatisch geprüft, aber ihr könnt diese Annahme machen.)</li>
 *       <li>Das Feld {@link #name} ist nicht leer und somit auch nicht null.</li>
 *       <li>2 Items sind gleich, wenn Name und ItemType gleich sind.</li>
 *    </ul>
 * </p>
 * <p>
 *    <b>An dieser Klasse dürfen keine Änderungen durchgeführt werden!</b>
 * </p>
 *
 * @author Christoph Gragert (cgr@shd.de)
 */
public class Item
{
   /**
    * Name des Items
    */
   private String name;
   /**
    * Typ des Items (Waffe, Rüstung, etc.)
    */
   private ItemType itemType;
   /**
    * Der Wert des Items. Also für wie viel Gold könnte ich das Item verkaufen.
    */
   private int value;

   public Item(String name, ItemType itemType, int value)
   {
      this.name = name;
      this.itemType = itemType;
      this.value = value;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public ItemType getItemType()
   {
      return itemType;
   }

   public void setItemType(ItemType itemType)
   {
      this.itemType = itemType;
   }

   public int getValue()
   {
      return value;
   }

   public void setValue(int value)
   {
      this.value = value;
   }

   @Override
   public boolean equals(Object o)
   {
      if( this == o )
      {
         return true;
      }
      if( o == null || getClass() != o.getClass() )
      {
         return false;
      }
      Item item = (Item) o;
      return Objects.equals(name, item.name) && itemType == item.itemType;
   }

   @Override
   public int hashCode()
   {
      return Objects.hash(name, itemType);
   }
}
