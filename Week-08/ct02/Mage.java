public class Mage extends GameCharacter {

    public String type;
    public int intelligence, mana;

    public Mage(String name, int level, int intelligence, int mana, String weapon) {
        super(name, level, weapon);
        this.type = "Mage";
        this.intelligence = intelligence;
        this.mana = mana;
        GameCharacter.allCharacters[GameCharacter.characterCount++] = name;
        System.out.println("A new mage came to live");
    }

    public void calculateDamage() {
        super.totalDamage = (super.getLevel() * this.intelligence) + (this.mana * 10);
    }

    public String toString() {
        String ret = super.getCharacterInfo();
        ret += "\nCharacter Type: " + type;
        ret += "\nWeapon: " + super.weaponType;
        ret += "\nIntelligence: " + intelligence + ", Mana: " + mana;
        ret += "\nTotal Damage: " + super.totalDamage;
        return ret;
    }
}
