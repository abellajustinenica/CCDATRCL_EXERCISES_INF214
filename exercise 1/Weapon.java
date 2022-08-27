public class Weapon {
    //Weapon attributes
    int damage;
    int weight;
    String rarity;
    String name;
    String description;

    //Weapon method
    public void weaponDescription() {
        System.out.println("My weapon is " + name + " and I have " + description );
    }
}
