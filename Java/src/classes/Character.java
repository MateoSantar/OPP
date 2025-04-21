package classes;

public class Character {
    private String name;
    private int hp,dmg;

    public Character(String name, int hp, int dmg) {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
    }

    
    public int Attack(int armor,int hp){
        return ((dmg-armor) >= hp ) ? 0 : (hp-(dmg-armor)); 
    }
    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", hp=" + hp + ", dmg=" + dmg + '}';
    }
    
    
}
