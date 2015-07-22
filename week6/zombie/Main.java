package zombie;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int blood=scanner.nextInt();
		String nameOfWeapon=scanner.next();

		Weapon weapon;
		switch (nameOfWeapon) {
		case "axe": {
			weapon = new Axe();
			break;
		}
		case "sword": {
			weapon = new AncientSword();
			break;
		}
		case "shotgun": {
			weapon = new Shotgun();
			break;
		}
		case "revolver": {
			weapon = new Revolver();
			break;
		}
		default:
			return;
		}
		
		Vector<Zombie> zombies=new Vector<Zombie>();
		for(int i=0;i<n;i++){
			zombies.add(new OrdinaryZombie(blood));
		}
		
		int counter = 0;
		for (int i = 0; i < n; i++) {
			while (!zombies.get(i).isDead()) {
				zombies.get(i).hit(weapon.hit());
				counter++;
			}
		}
		System.out.println(counter);

	}

}
