/**
 * Class to represent all characters on the board.
 */
public abstract class Character {
    
    protected int hp;
    protected int damage;

    public Character(int hp, int damage) {
        this.hp = hp;
        this.damage = damage;
    }

    // subtract damage points inflicted on this character
    public void takeDamage(int damage) {
        hp -= damage;
    }

    // applies damage to given defender
    public void attack(Character defender) {
        if (!(defender instanceof SplashAttacker)) {
            defender.takeDamage(damage);
        }
    }

    // returns true if alive
    public boolean isAlive() {
        return hp > 0 ? true : false;
    }

    public int getDamage() {
        return damage;
    }
}
