package de.shd.schulung6.lösung;

public class Bauklotz
{
   private BauklotzForm from;
   private BauklotzFarbe farbe;

   public Bauklotz(BauklotzForm from, BauklotzFarbe farbe)
   {
      this.from = from;
      this.farbe = farbe;
   }

   public BauklotzForm getFrom()
   {
      return from;
   }

   public void setFrom(BauklotzForm from)
   {
      this.from = from;
   }

   public BauklotzFarbe getFarbe()
   {
      return farbe;
   }

   public void setFarbe(BauklotzFarbe farbe)
   {
      this.farbe = farbe;
   }
}
