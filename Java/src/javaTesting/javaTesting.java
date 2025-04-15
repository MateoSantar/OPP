package javaTesting;
import classes.Character;
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
        System.out.println("Personaje generado: "+new Character(name,hp,dmg));
    }
    
}
