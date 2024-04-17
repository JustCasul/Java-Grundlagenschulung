package de.shd.schulung6.lösung;

import de.shd.java.course.util.ConsoleHelper;

public class Client
{

   public static void main(String[] args)
   {
      String farbe = ConsoleHelper.readString("Bestimme die Farbe des Bauklotzes!");

      BauklotzFabrik fabrik = new BauklotzFabrik();
      Bauklotz bauklotz = fabrik.createBauklotz("Quader", farbe);
      if( bauklotz == null )
      {
         System.out.println("Für die Farbe '" + farbe + "' konnte kein Bauklotz erstellt werden.");
      }
      else
      {
         System.out.println("Der Bauklotz hat die Farbe '" + bauklotz.getFarbe() + "' und die From: '" + bauklotz.getFrom() + "'");
      }
   }

}
