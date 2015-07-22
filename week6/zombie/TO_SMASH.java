package zombie;

public class TO_SMASH extends Weapon{
	public TO_SMASH(int damage, int durability){
		super(damage,durability);
	}

	
	@Override
	public int hit() {
		
			if ((getDurability() <= getMaxDurability() / 2)&&(getDamage()>1)) {
				setDamage(getDamage() - 1);
			}
	
		setDurability(getDurability() - 1);
		return getDamage();
	}

}
