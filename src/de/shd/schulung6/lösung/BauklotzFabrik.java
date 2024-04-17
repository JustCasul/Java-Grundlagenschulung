package de.shd.schulung6.lösung;

/**
 * Fabrik zum Erstellen von {@link Bauklotz}-Objekten
 *
 * @author Christoph Gragert (cgr@shd.de)
 */
public class BauklotzFabrik
{

   /**
    * <h2>Funktionsweise</h2>
    * <p>
    * Erzeugt einen {@link Bauklotz} in den Farben "Blau", "Rot" oder "Gelb". Für den Übergabeparameter "farbe" wird Groß- und
    * Kleinschreibung ignoriert. Wird eine abweichende Farbe an die Methode übergeben, so liefert sie den Wert <CODE>null</CODE> zurück.
    * </p>
    * <br>
    * <h2>Beispiel:</h2>
    * <pre>
    *  #1
    *  Bauklotz bauklotz = createBauklotz("Quader", "Rot");
    *  Die Variable "bauklotz" ist nicht null und hat die Farbe Rot.
    *
    *  #2
    *  Bauklotz bauklotz = createBauklotz("Quader", "Grün");
    *  Die Variable "bauklotz" ist null.
    * </pre>
    *
    * @param form  Die Form des Bauklotzes. Kann variabel gewählt werden.
    * @param farbe Die Farbe des Bauklotzes. Es sind nur die Farben "Rot", "Blau" und "Gelb" zulässig.
    * @return Liefert eine neue Instanz von Bauklotz, falls die Farbe korrekt gewählt wurde, ansonsten null.
    */
   public Bauklotz createBauklotz(String form, String farbe)
   {
      final BauklotzFarbe bauklotzFarbe = BauklotzFarbe.getFarbe(farbe);
      final BauklotzForm bauklotzForm = BauklotzForm.getForm(form);
      if( bauklotzFarbe == null || bauklotzForm == null)
      {
         return null;
      }
      return new Bauklotz(bauklotzForm, bauklotzFarbe);
   }

}
