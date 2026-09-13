public class Main {
    public static void main(String[] args) {
        CharacterDirector director = new CharacterDirector();
        GameCharacter pyroCharacter =
                director.createPyroSwordsman();
        GameCharacter hydroCharacter =
                director.createHydroSwordchar();
        GameCharacter electroCharacter =
                director.createElectroPolearman();
        System.out.println(pyroCharacter);
        System.out.println(hydroCharacter);
        System.out.println(electroCharacter);
        GameCharacter customCharacter1 =
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
        System.out.println(customCharacter1);
        GameCharacter aki =
                new GameCharacterBuilder()
                        .setName("aki")
                        .setElement("cryo")
                        .setWeaponType("catalyst")
                        .setLevel(50)
                        .setHealth(15)
                        .setAttack(19)
                        .setDefense(25)
                        .setArtifactSet("cold night")
                        .setElementalSkill("sum cryo powerful skill")
                        .setElementalBurst("freeze!!")
                        .build();
        System.out.println(aki);
    }
}