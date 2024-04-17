package de.shd.schulung6.lösung;

enum BauklotzForm
{
   QUADER("Quader", "cuboid", "q"),
   BRUECKE("Brücke", "bridge", "b"),
   WUERFEL("Würfel", "cube", "w");

   private final String name;

   private final String[] alias;

   BauklotzForm(String name, String... alias)
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

   public static BauklotzForm getForm(String name)
   {
      for( BauklotzForm bauklotzForm : values() )
      {
         if( bauklotzForm.getName().equalsIgnoreCase(name) )
         {
            return bauklotzForm;
         }
         for( String alias : bauklotzForm.getAlias() )
         {
            if( alias.equalsIgnoreCase(name) )
            {
               return bauklotzForm;
            }
         }
      }
      return null;
   }
}
