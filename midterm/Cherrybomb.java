import java.util.*;
import java.io.*;
import java.lang.*;

public class Cherrybomb extends Plant implements SplashAttacker {

	private int turnCount;

	public Cherrybomb() {
		super(10, 150, 150);
	}

	public void splashAttack(List<Zombie> zombieList) {
		if (turnCount > 0) {
			turnCount--;
		} else {
			for (Zombie zomb : zombieList) {
				if (zomb != null) {
					zomb.takeDamage(getDamage());
					//CherryBomb.takeDamage(damage);
				}
				takeDamage(10);
			}
		}
	}

}