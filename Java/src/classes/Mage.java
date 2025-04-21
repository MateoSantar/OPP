
package classes;

import java.util.ArrayList;


public class Mage extends Character {
    
    private final ArrayList<Spell> spellList = new ArrayList<>();
    
    public Mage(String name, int hp, int dmg) {
        super(name, hp, dmg);
    }
    
    public int Attack(int magicArmor,int hp,Spell spellSelected){
         return ((spellSelected.getDamage()-magicArmor) >= hp ) ? 0 : (hp-(spellSelected.getDamage()-magicArmor)); 
    }
    
    
}
