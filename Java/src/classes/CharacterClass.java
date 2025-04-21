package classes;

public abstract class CharacterClass {
    protected String name;
    protected int hp,dmg;

    public CharacterClass(String name, int hp, int dmg) {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
    }

    
    public int BasicAttack(int armor,int hp){
        return ((dmg-armor) >= hp ) ? 0 : (hp-(dmg-armor)); 
    }
    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", hp=" + hp + ", dmg=" + dmg + '}';
    }
    
    
}
