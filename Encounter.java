// Employee.java - From class 10
public class Encounter
{
       
    private int party;  //stores party count
    private int level;  //stores average level of party
    private int bugCount, gobCount, wolfCount, zomCount, owlBCount, orcCount, cutCount;
    private double CR;  //Stores Challenge Rating to calculate a "fair" encounter
    Monster m1 = new Monster();

    public Encounter()
    {
        
    }
    
    
    public void setParty (int party1)
    {
        party = party1;
    }
     
    public int getParty()
    {
       return party;
    }
    
    public void setLevel (int level1)
    {
        level = level1;
    }
     
    public int getLevel()
    {
       return level;
    }
    
    public void setCR (double CR1)
    {
        CR = CR1;
    }
     
    public double getCR()
    {
       return CR;
    }
    
    public double computePlayerCR ()
    {
       
        if (party == 1)
        {
            if (level < 5)
            {
                CR = (level / 4);
                CR = Math.round(CR*4)/4;
            }
            else {
                CR = (level / 2);
                CR = Math.round(CR*4)/4;
            }
        }
        else if (party == 2)
        {
            if (level < 5)
            {
                CR = (level / 2);
                CR = Math.round(CR*4)/4;
            }
            else {
                CR = (level / 1.25);
                CR = Math.round(CR*4)/4;
            }
        }
        else if (party == 3)
        {
             if (level < 5)
            {
                CR = (level / 1.25);
                CR = Math.round(CR*4)/4;
            }
             else
             {
                 CR = (level + 1.5);
                 CR = Math.round(CR*4)/4;
             }
        }
        else if (party == 4)
        {
            if (level < 5)
            {
                CR = (level);
                CR = Math.round(CR*4)/4;
            }
            else
            {
                CR = (level + 3);
                CR = Math.round(CR*4)/4;
            }
        }
        else if (party > 4)
        {
            if (level < 5)
            {
                CR = (level + (party - 4));
                CR = Math.round(CR*4)/4;
            }
            else 
            {
                CR = (level + (party) - 4) + 3;
                CR = Math.round(CR*4)/4;
            }
        }
        System.out.println(CR);
        return CR;
    }
    
    public boolean Chance() //checks for chance on generating an encounter
    {
        int random = (int)(Math.random() * 3 + 1);
        
        if(random == 1)
        {
            return true;
        }
        else 
            return false;
    }
    public void encBuilder()
    {
        String creature[] = {"Bugbear", "Goblin", "Orc", "Wolf", "Owlbear", "Cutpurse"};
        
          int random = (int)(Math.random() * creature.length);
          
          if (creature[random].equals(creature[0]) || creature[random].equals(creature[1]) || creature[random].equals(creature[3]))
          {
              if(cutCount == 0 && orcCount == 0 && owlBCount == 0)
              {
              creature = new String[] {"Bugbear", "Goblin", "Wolf"};
              
              while (CR > .99)
                 {
                    random = (int)(Math.random() * creature.length);
                    if (creature[random].equals("Bugbear"))
                        bugAdd();
                    else if(creature[random].equals("Goblin"))
                        gobAdd();
                    else if(creature[random].equals("Wolf"))
                        wolfAdd();
                    else
                        break;
                 }
              }
          }
          else if (creature[random].equals(creature[2]))
          {
              if (gobCount == 0 && bugCount == 0 && cutCount == 0 && owlBCount == 0)
              {
              creature = new String[] {"Orc", "Wolf"};
              
              while (CR > .99)
              {
                  random = (int)(Math.random() * creature.length);
                  if (creature[random].equals("Orc"))
                      orcAdd();
                  else if (creature[random].equals("Wolf"))
                      wolfAdd();
                  else
                      break;
              }
              }
          }
          else if (creature[random].equals(creature[4]))
          {
              if(gobCount == 0 && orcCount == 0 && wolfCount == 0 && bugCount == 0 && cutCount == 0)
              {
              creature = new String[] {"Owlbear"};
              while (CR > 2.99)
              {
                  owlBAdd();
              }
              }
          }
          else if (creature[random].equals(creature[5]))
          {
              if (gobCount == 0 && orcCount == 0 && wolfCount == 0 && owlBCount == 0)
              {
                creature = new String[] {"Cutpurse", "Bugbear"};
                while (CR > .49)
                    {
                     random = (int)(Math.random() * creature.length);
                     if (creature[random].equals("Cutpurse"))
                         cutAdd();
                     else if (creature[random].equals("Bugbear"))
                         bugAdd();
                    }
              }

          }
          else
              return;
        
    }
    public void bugAdd()
    {
        bugCount = bugCount + 1;
        CR = CR - 1;
    }
    public void gobAdd()
    {
        gobCount = gobCount + 1;
        CR = CR - .25;
    }
    public void orcAdd()
    {
        orcCount = orcCount + 1;
        CR = CR - .5;
    }
    public void wolfAdd()
    {
        wolfCount = wolfCount + 1;
        CR = CR - .25;
    }
    public void owlBAdd()
    {
        owlBCount = owlBCount + 1;
        CR = CR - 3;
    }
    public void cutAdd()
    {
        cutCount = cutCount + 1;
        CR = CR - .5;
    }
    public void dragAdd()
    {
        
    }
       
    public String printEnc()
    {
        String temp = "";
        temp = m1.Bugbear(bugCount);
        temp = temp + m1.Cutpurse(cutCount);
        temp = temp + m1.Goblin(gobCount);
        temp = temp + m1.Orc(orcCount);
        temp = temp + m1.Owlbear(owlBCount);
        temp = temp + m1.Wolf(wolfCount);
        
        return temp;
    }
    
}


