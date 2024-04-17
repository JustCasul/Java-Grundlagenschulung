package de.shd.schulung6.lösung;

public enum BattleCommand
{
   BLOCK("blocken", "block", "b"),
   ATTACK("attackieren", "angreifen", "attack", "a"),
   EVADE("ausweichen","evade", "e"),
   TRINK_POTION("trank", "trinke Trank", "potion", "drink potion", "p");

   private final String command;

   private final String[] aliasCommand;

   BattleCommand(String command, String... aliasCommand)
   {
      this.command = command;
      this.aliasCommand = aliasCommand;
   }

   public String getCommand()
   {
      return command;
   }

   public String[] getAliasCommand()
   {
      return aliasCommand;
   }

   public static BattleCommand getBattleCommand(String command)
   {
      for( BattleCommand battleCommand : values() )
      {
         if( battleCommand.getCommand().equalsIgnoreCase(command) )
         {
            return battleCommand;
         }
         for( String aliasCommand : battleCommand.getAliasCommand() )
         {
            if( aliasCommand.equalsIgnoreCase(command) )
            {
               return battleCommand;
            }
         }
      }
      return null;
   }
}
