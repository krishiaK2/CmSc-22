/**
 * Class to generalize all types of plants.
 */
public abstract class Plant extends Character {
	
	protected int sunlightCost;

	public Plant(int hp, int damage) {
		super(hp, damage);
	}

	public Plant(int hp, int damage, int sunlightCost) {
		super(hp, damage);
		this.sunlightCost = sunlightCost;
	}

    public int getSunlightCost() {
    	return sunlightCost;
	}

}
