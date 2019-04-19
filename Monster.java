// Monster.java
        //Holds the combat stats and actions of monsters in the encounter
public class Monster
{
    String bugbear;
    String owlbear;
    String cutpurse;
    String orc;
    String wolf;
    String goblin;
    
    
    public Monster()
    {
                
    }
 public String Bugbear(int bugcount1)
  {
      if (bugcount1 > 0)
      {
          bugbear = ("You encounter " + bugcount1 + " bugbear(s)!\n");
          bugbear = bugbear + ("AC: 16\n HP: 27\n Speed: 30ft\n");
          bugbear = bugbear + ("Str: 15(+2)  Dex: 14(+2)  Con: 13(+1)  Int: 8(-1)  Wis: 11(+0)  Cha: 9(-1)\n");
          bugbear = bugbear + ("Skills: Stealth + 6, Survival + 2\n");
          bugbear = bugbear + ("Senses: Darkvision 60ft., Passive Perception 10\n");
          bugbear = bugbear + ("Languages: Common, Goblin\n");
          bugbear = bugbear + ("Challenge: 1 (200xp)");
          bugbear = bugbear +("\nBRUTE: A melee weapon deals an additional die of its damage on a hit (already included in the attack below)");
          bugbear = bugbear +("\nSURPRISE ATTACK: If the bugbear surprises a creature and hits it with an attack, the creature takes an additional 7(2d6) damage");
          bugbear = bugbear +("\n\nActions: Morningstar. Melee Attack: +4 to hit, reach 5ft, 1 target. HIT: 11(2d8 + 2) piercing damage");
          bugbear = bugbear +("\n         Javelin. Melee or ranged weapon attack: +4 to hit, reach 5 ft. or range 30/120 ft., one target.\n "
                  + "         Hit: 9 (2d6 + 2) piercing damage in melee or 5 (1d6 + 2) piercing damage at range.)\n");
          return bugbear;
      }
      else
          return "";
  }
    public String Owlbear(int owlcount1)
  {
      if (owlcount1 > 0)
      {
          owlbear = ("You encounter " + owlcount1 + " owlbear(s)!\n");
          owlbear = owlbear + ("AC: 13\n HP: 59\n Speed: 40ft\n");
          owlbear = owlbear + ("Str: 20(+5)  Dex: 12(+1)  Con: 17(+3)  Int: 3(-4)  Wis: 12(+1)  Cha: 7(-2)\n");
          owlbear = owlbear + ("Skills: Perception +3\n");
          owlbear = owlbear + ("Senses: Darkvision 60ft., Passive Perception 13\n");
          owlbear = owlbear + ("Languages: --\n");
          owlbear = owlbear + ("Challenge: 3 (700xp)");
          owlbear = owlbear +("\nKEEN SIGHT AND SMELL: The owlbear has advantage on perception cheks that rely on sight and smell");
          owlbear = owlbear +("\n\nActions: Multi-attack. The owlbear makes 2 attacks, one with its beak and one with its claws"
                  + "\nBeak. Melee weapon attack: +7 to hit, reach 5ft, 1 creature. HIT: 10(1d10 + 5) piercing damage");
          owlbear = owlbear +("\n         Claws. Melee weapon attack: +7 to hit, reach 5 ft., one target. \n"
                  +"         Hit: 14 (2d8 + 5) slashing damage\n");
          return owlbear;
      }
      else
          return "";
  }
    
    public String Cutpurse(int cutcount1)
    {
        if (cutcount1 > 0)
      {
          cutpurse = ("You encounter " + cutcount1 + " cutpurses!\n");
          cutpurse = cutpurse + ("AC: 14\n HP: 16\n Speed: 30ft\n");
          cutpurse = cutpurse + ("Str: 11(+0)  Dex: 14(+2)  Con: 12(+1)  Int: 9(-1)  Wis: 9(-1)  Cha: 11(+0)\n");
          cutpurse = cutpurse + ("Skills: Intimidation +2\n");
          cutpurse = cutpurse + ("Senses: Passive Perception 9\n");
          cutpurse = cutpurse + ("Languages: Common\n");
          cutpurse = cutpurse + ("Challenge: 1/2 (100xp)");
          cutpurse = cutpurse +("\n\nActions: Multi-attack. The cutpurse makes 2 attacks"
                  + "\nShortsword. Melee weapon attack: +4 to hit, reach 5ft, 1 target. HIT: 5(1d6 + 2) piercing damage\n");
          return cutpurse;
      }
      else
          return "";
  }
        
    public String Orc(int orccount1)
    {
        if (orccount1 > 0)
      {
          orc = ("You encounter " + orccount1 + " orc(s)!\n");
          orc = orc + ("AC: 13\n HP: 15\n Speed: 30ft\n");
          orc = orc + ("Str: 16(+3)  Dex: 12(+1)  Con: 16(+3)  Int: 7(-2)  Wis: 11(+0)  Cha: 10(+0)\n");
          orc = orc + ("Skills: Intimidation +2\n");
          orc = orc + ("Senses: Darkvision 60ft., Passive Perception 10\n");
          orc = orc + ("Languages: Common, Orc\n");
          orc = orc + ("Challenge: 1/2 (100xp)");
          orc = orc + ("AGGRESSIVE. As a bonus action, the orc can move up to its speed toward a hostile creature that it can see.");
          orc = orc +("\n\nActions: Greataxe. Melee Weapon Attack: +5 to hit, reach 5 ft., one target. Hit: 9 (1d12 + 3) slashing damage.")
                  + ("\n Javelin. Melee or Ranged Weapon Attack: +5 to hit, reach 5 ft. or range 30/120 ft., one target. Hit: 6 (1d6 + 3) piercing damage.\n");
          return orc;
      }
      else
          return "";
    }
    public String Wolf(int wolfcount1)
    {
        if (wolfcount1 > 0)
      {
          wolf = ("You encounter " + wolfcount1 + " wolf(ves)!\n");
          wolf = wolf + ("AC: 13\n HP: 11\n Speed: 40ft\n");
          wolf = wolf + ("Str: 12(+1)  Dex: 15(+2)  Con: 12(+1)  Int: 3(-4)  Wis: 12(+1)  Cha: 6(-2)\n");
          wolf = wolf + ("Skills: Perception + 3, Stealth +4\n");
          wolf = wolf + ("Senses: Passive Perception 13\n");
          wolf = wolf + ("Languages: Common, Orc\n");
          wolf = wolf + ("Challenge: 1/4 (50xp)");
          wolf = wolf + ("\nKEEN HEARING AND SMELL: The wolf had advantage on Wisdom(Perception) checks that rely on sound or smell");
          wolf = wolf + ("PACK TACTICS: The wolf has advantage on attack rolls against a creature if at least one of the wolf's allies"
                  + " \nis within 5 feet of the creature and the ally isn't incapacitated.");
          wolf = wolf +("\nBite.Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 7 (2d4 + 2) piercing damage. "
                  + "\nIf the target is a creature, it must succeed on a DC 11 Strength saving throw or be knocked prone.\n");
          return wolf;
      }
      else
          return "";
    }
    public String Goblin(int gobcount1)
    {
        if (gobcount1 > 0)
      {
          goblin = ("You encounter " + gobcount1 + " orc(s)!\n");
          goblin = goblin + ("AC: 15(shield)\n HP: 7\n Speed: 30ft\n");
          goblin = goblin + ("Str: 8(-1)  Dex: 14(+2)  Con: 10(+0)  Int: 10(+0)  Wis: 8(-1)  Cha: 8(-1)\n");
          goblin = goblin + ("Skills: Stealth +6\n");
          goblin = goblin + ("Senses: Darkvision 60-ft., Passive Perception 9\n");
          goblin = goblin + ("Languages: Common, Goblin\n");
          goblin = goblin + ("Challenge: 1/4 (50xp)");
          goblin = goblin + ("\nNIMBLE ESCAPE. The goblin can take the Disengage or Hide action as a bonus action on each of its turns.");
          goblin = goblin + ("Actions: Scimitar. Melee Weapon Attack: +4 to hit, reach 5 ft., one target. Hit: 5 (1d6 + 2) slashing damage.");
          goblin = goblin +("\nShortbow. Ranged Weapon Attack: +4 to hit, range 80/320 ft., one target. Hit: 5 (1d6 + 2) piercing damage.\n");
          return goblin;
      }
      else
          return "";
    }
}


