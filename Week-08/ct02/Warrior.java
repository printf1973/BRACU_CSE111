public class Warrior extends GameCharacter {

    public String type;
    public int strength, armor;

    public Warrior(String name, int level, int strength, int armor, String weapon) {
        super(name, level, weapon);
        this.type = "Warrior";
        this.strength = strength;
        this.armor = armor;
        GameCharacter.allCharacters[GameCharacter.characterCount++] = name;
        System.out.println("A new warrior has arrived");
    }

    public void calculateDamage() {
        super.totalDamage = (super.getLevel() * this.strength) + (armor * 50);
    }

    public String toString() {
        String ret = super.getCharacterInfo();
        ret += "\nCharacter Type: " + type;
        ret += "\nWeapon: " + super.weaponType;
        ret += "\nStrength: " + strength + ", Armor: " + armor;
        ret += "\nTotal Damage: " + super.totalDamage;
        return ret;
    }
}
