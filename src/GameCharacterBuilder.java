public class GameCharacterBuilder {
    private static final int MIN_LEVEL = 1;
    private static final int MAX_LEVEL = 90;
    private String name;
    private String element;
    private String weaponType;
    private int level;
    private int health;
    private int attack;
    private int defense;
    private String artifactSet;
    private String elementalSkill;
    private String elementalBurst;
    public GameCharacterBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public GameCharacterBuilder setElement(String element) {
        this.element = element;
        return this;
    }
    public GameCharacterBuilder setWeaponType(String weaponType) {
        this.weaponType = weaponType;
        return this;
    }
    public GameCharacterBuilder setLevel(int level) {
        this.level = level;
        return this;
    }
    public GameCharacterBuilder setHealth(int health) {
        this.health = health;
        return this;
    }
    public GameCharacterBuilder setAttack(int attack) {
        this.attack = attack;
        return this;
    }
    public GameCharacterBuilder setDefense(int defense) {
        this.defense = defense;
        return this;
    }
    public GameCharacterBuilder setArtifactSet(String artifactSet) {
        this.artifactSet = artifactSet;
        return this;
    }
    public GameCharacterBuilder setElementalSkill(String elementalSkill) {
        this.elementalSkill = elementalSkill;
        return this;
    }
    public GameCharacterBuilder setElementalBurst(String elementalBurst) {
        this.elementalBurst = elementalBurst;
        return this;
    }
    public GameCharacter build() {
        validate();
        return new GameCharacter(this);
    }
    private void validate() {
        if (name == null || name.isBlank()) {
            throw new IllegalStateException("Character name cannot be empty");
        }
        if (element == null || element.isBlank()) {
            throw new IllegalStateException("Character must have an element");
        }
        if (level < MIN_LEVEL || level > MAX_LEVEL) {
            throw new IllegalStateException(
                    "Level must be between " + MIN_LEVEL + " and " + MAX_LEVEL
            );
        }
        if (health <= 0) {
            throw new IllegalStateException("Health must be greater than 0");
        }
        if (attack < 0 || defense < 0) {
            throw new IllegalStateException(
                    "Attack and defense cannot be negative"
            );
        }
    }
    public String getName() {
        return name;
    }
    public String getElement() {
        return element;
    }
    public String getWeaponType() {
        return weaponType;
    }
    public int getLevel() {
        return level;
    }
    public int getHealth() {
        return health;
    }
    public int getAttack() {
        return attack;
    }
    public int getDefense() {
        return defense;
    }
    public String getArtifactSet() {
        return artifactSet;
    }
    public String getElementalSkill() {
        return elementalSkill;
    }
    public String getElementalBurst() {
        return elementalBurst;
    }
}