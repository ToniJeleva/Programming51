package zombie;

public abstract class Weapon {
	private int damage;
	private int durability;
	private int maxDurability;
	
	public Weapon(int damage, int durability){
		this.damage=damage;
		this.durability=durability;
		maxDurability=durability;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage=damage;
	}
	
	public int getDurability() {
		return durability;
	}
	
	public void setDurability(int durability) {
		this.durability=durability;
	}
	
	public int getMaxDurability(){
		return maxDurability;
	}

	public abstract int hit();
}
