public enum Weapon {
    SWORD(20),
    KNIFE(10);

    private int damage;

    Weapon(int damage){
        this.damage=damage;
    }

    public int getDamage(){return damage;}
}
