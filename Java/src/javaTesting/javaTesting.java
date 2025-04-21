package javaTesting;
import classes.*;
import java.util.Scanner;

public class javaTesting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del personaje: ");
        String name = scanner.nextLine();
        System.out.print("Ingrese la vida de "+name+": ");
        int hp = scanner.nextInt();
        System.out.print("Ingrese la vida de "+name+": ");
        int dmg = scanner.nextInt();
        System.out.println("Clases disponibles => (Default, Mago)");
        String clase = scanner.next();
        if(clase.toLowerCase().equalsIgnoreCase("mago")){
            Mage mainChar = new Mage(name,hp,dmg);
            mainChar.AddSpell(new Spell("FireBall",10,20));
            System.out.println(mainChar.MagicAttack(5, 10, "FireBall"));
        }
        scanner.close();
    }
    
}
