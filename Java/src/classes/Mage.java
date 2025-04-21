
package classes;

import java.util.ArrayList;


public class Mage extends CharacterClass {
    
    private final ArrayList<Spell> spellList = new ArrayList<>();

    public ArrayList<Spell> getSpellList() {
        return spellList;
    }
    
    public Mage(String name, int hp, int dmg) {
        super(name, hp, dmg);
    }
    
    public void AddSpell(Spell... spells){
        for(Spell s : spells){
            if(!spellList.contains(s)){ this.spellList.add(s);} else{System.out.println(this.name + " ya conoce "+s.getName());}
        }
    }
    
    public int MagicAttack(int magicArmor,int hp,String spell){
        Spell spellSelected = null;
         for(Spell s : spellList){
             if(s.getName().equals(spell)){spellSelected = s;}
         }
         return ((spellSelected.getDamage()-magicArmor) >= hp ) ? 0 : (hp-(spellSelected.getDamage()-magicArmor)); 
    }
    
    
}
