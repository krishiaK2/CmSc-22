package designpatterns;

public class CharacterTest {
	public static void main(String[] args) {
		
		//match weapon used...
		WeaponBehavior weapon1 = new KnifeBehavior();
		System.out.println("King!");
		King king = new King();
		king.setWeapon(weapon1);
		king.fight();
		
		WeaponBehavior weapon2 = new BowAndArrowBehavior();
		System.out.println("Queen!");
		Queen queen = new Queen();
		queen.setWeapon(weapon2);
		queen.fight();
		
		WeaponBehavior weapon3 = new SwordBehavior();
		System.out.println("Knight!");
		Knight knight = new Knight();
		knight.setWeapon(weapon3);
		knight.fight();
		
		WeaponBehavior weapon4 = new AxeBehavior();
		System.out.println("Troll!");
		Troll troll = new Troll();
		troll.setWeapon(weapon4);
		troll.fight();
		
		//unmatch wepaon used...
		System.out.println("King other weapon!");
		king.setWeapon(weapon4);
		king.fight();
		
		System.out.println("Queen other weapon!");
		queen.setWeapon(weapon3);
		queen.fight();
		
		System.out.println("Knight other weapon!");
		knight.setWeapon(weapon2);
		knight.fight();
		
		System.out.println("Troll other weapon!");
		troll.setWeapon(weapon1);
		troll.fight();
		
	}
}