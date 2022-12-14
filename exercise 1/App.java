public class App {
    public static void main(String[] args) {

        // Character Class
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();

        // Enemy Class
        Enemy boss = new Enemy();

        boss.damage = 50;
        boss.health = 500;
        boss.armor = 100;
        boss.hasMagicImmunity = true;
        boss.name = "Roshan";
        boss.enemyDialogue();

        Enemy skeleton = new Enemy();

        skeleton.damage = 5;
        skeleton.health = 10;
        skeleton.armor = 5;
        skeleton.hasMagicImmunity = false;
        skeleton.name = "Common Skeleton Warrior";
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();

        //Weapon Class
        Weapon hammer = new Weapon();

        hammer.damage = 30;
        hammer.weight = 6;
        hammer.rarity = "Legendary";
        hammer.name = "Mjollnir";
        hammer.description = "A mighty hammer owned by the god of lightning thor!";
        hammer.weaponDescription();

        Weapon sword = new Weapon();

        sword.damage = 10;
        sword.weight = 2;
        sword.rarity = "Mediocre";
        sword.name = "Sword";
        sword.description = "An iron sword used mostly by common enemies";
        sword.weaponDescription();

        Weapon axe = new Weapon();

        axe.damage = 20;
        axe.weight = 4;
        axe.rarity = "Rare";
        axe.name = "Axe";
        axe.description = "an axe owned by Jack the Lumberjack";
        axe.weaponDescription();
    }
}
