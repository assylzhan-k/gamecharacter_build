public class CharacterDirector {

    public GameCharacter createPyroSwordsman() {
        return new GameCharacterBuilder()
                .setName("Aether")
                .setElement("Pyro")
                .setWeaponType("Sword")
                .setLevel(85)
                .setHealth(15000)
                .setAttack(1600)
                .setDefense(700)
                .setArtifactSet("Crimson flame")
                .setElementalSkill("Flowfire blade")
                .setElementalBurst("Plains scorcher")
                .build();
    }

    public GameCharacter createHydroMage() {
        return new GameCharacterBuilder()
                .setName("Lumine")
                .setElement("Hydro")
                .setWeaponType("Sword")
                .setLevel(86)
                .setHealth(15000)
                .setAttack(1800)
                .setDefense(600)
                .setArtifactSet("Ocean Spirit")
                .setElementalSkill("Aquacrest saber")
                .setElementalBurst("Rising waters")
                .build();
    }
    public GameCharacter createElectroArcher() {
        return new GameCharacterBuilder()
                .setName("Flins")
                .setElement("Electro")
                .setWeaponType("Polearm")
                .setLevel(70)
                .setHealth(12500)
                .setAttack(1900)
                .setDefense(550)
                .setArtifactSet("Night of The Sky Unveilling")
                .setElementalSkill("Ancient Rite: Arcane Light")
                .setElementalBurst("Ancient Ritual: Cometh the Night")
                .build();
    }
}