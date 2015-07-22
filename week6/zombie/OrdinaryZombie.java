package zombie;

public class OrdinaryZombie implements Zombie {
	private int health;

	public OrdinaryZombie(int health){
		this.health=health;
	}
	
	@Override
	public int getHealth() {
		return health;
	}

	
	@Override
	public void hit(int damage) {
		health=health-damage;
	}

	@Override
	public boolean isDead() {
		boolean dead=false;
		if(health==0)
			dead=true;
		return dead;
	}

}
