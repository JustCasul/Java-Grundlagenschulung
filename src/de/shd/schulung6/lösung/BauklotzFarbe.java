package de.shd.schulung6.lösung;

enum BauklotzFarbe
{
   ROT("rot", "red", "r"),
   BLAU("blau", "blue", "b"),
   GELB("gelb", "yellow", "g");

   private final String name;

   private final String[] alias;

   BauklotzFarbe(String name, String... alias)
   {
      this.name = name;
      this.alias = alias;
   }

   public String getName()
   {
      return name;
   }

   public String[] getAlias()
   {
      return alias;
   }

   public static BauklotzFarbe getFarbe(String name)
   {
      for( BauklotzFarbe bauklotzFarbe : values() )
      {
         if( bauklotzFarbe.getName().equalsIgnoreCase(name) )
         {
            return bauklotzFarbe;
         }
         for( String alias : bauklotzFarbe.getAlias() )
         {
            if( alias.equalsIgnoreCase(name) )
            {
               return bauklotzFarbe;
            }
         }
      }
      return null;
   }
}
