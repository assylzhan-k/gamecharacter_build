public class GameCharacter {
    private final String name;
    private final String element;
    private final String weaponType;
    private final int level;
    private final int health;
    private final int attack;
    private final int defense;
    private final String artifactSet;
    private final String elementalSkill;
    private final String elementalBurst;

    public GameCharacter(GameCharacterBuilder builder) {
        this.name = builder.getName();
        this.element = builder.getElement();
        this.weaponType = builder.getWeaponType();
        this.level = builder.getLevel();
        this.health = builder.getHealth();
        this.attack = builder.getAttack();
        this.defense = builder.getDefense();
        this.artifactSet = builder.getArtifactSet();
        this.elementalSkill = builder.getElementalSkill();
        this.elementalBurst = builder.getElementalBurst();
    }
    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", element='" + element + '\'' +
                ", weaponType='" + weaponType + '\'' +
                ", level=" + level +
                ", health=" + health +
                ", attack=" + attack +
                ", defense=" + defense +
                ", artifactSet='" + artifactSet + '\'' +
                ", elementalSkill='" + elementalSkill + '\'' +
                ", elementalBurst='" + elementalBurst + '\'' +
                '}';
    }
}