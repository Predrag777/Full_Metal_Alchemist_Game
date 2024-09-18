package characters;

public class Character {
	private String name;
	private String rank;
	private float health;
	private int basicAttackDamage;
	
	public Character(String name, String rank, float health, int basicAttackDamage) {
		this.name=name;
		this.rank=rank;
		this.health=health;
		this.basicAttackDamage=basicAttackDamage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public float getHealth() {
		return health;
	}

	public void setHealth(float health) {
		this.health = health;
	}

	public int getBasicAttackDamage() {
		return basicAttackDamage;
	}

	public void setBasicAttackDamage(int basicAttackDamage) {
		this.basicAttackDamage = basicAttackDamage;
	}
}
