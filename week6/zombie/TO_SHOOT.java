package zombie;

public class TO_SHOOT extends Weapon {
	public TO_SHOOT(int damage, int durability){
		super(damage,durability);
	}
	
	@Override
	public int hit() {
		if (getDurability() == 0) {
			setDamage(1);
		}
		setDurability(getDurability() - 1);
		return getDamage();
	}
	
}
