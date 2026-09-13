public class Main {
    public static void main(String[] args) {
        CharacterDirector director = new CharacterDirector();
        GameCharacter pyroCharacter =
                director.createPyroSwordsman();
        GameCharacter hydroCharacter =
                director.createHydroMage();
        GameCharacter electroCharacter =
                director.createElectroArcher();
        System.out.println(pyroCharacter);
        System.out.println(hydroCharacter);
        System.out.println(electroCharacter);
        GameCharacter customCharacter =
                new GameCharacterBuilder()
                        .setName("kazuha")
                        .setElement("anemo")
                        .setWeaponType("sword")
                        .setLevel(90)
                        .setHealth(17000)
                        .setAttack(1900)
                        .setDefense(750)
                        .setArtifactSet("Viridescent Venerer")
                        .setElementalSkill("Chihayaburu")
                        .setElementalBurst("Kazuha slash")
                        .build();
        System.out.println(customCharacter);
        GameCharacter customCharacter2 =
                new GameCharacterBuilder()
                        .setName("aki")
                        .setElement("cryo")
                        .setWeaponType("catalyst")
                        .setLevel(50)
                        .setHealth(15000)
                        .setAttack(1900)
                        .setDefense(750)
                        .setArtifactSet("Desert Pavilion Chronicle")
                        .setElementalSkill("Chihayaburu")
                        .setElementalBurst("Kazuha slash")
                        .build();
        System.out.println(customCharacter2);
    }
}