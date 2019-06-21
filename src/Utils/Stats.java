package Utils;

class Stats extends Equipment{

    private int health, defence, damage, luck;

    Stats(){

    }

    void setHealth(int health) {
        this.health = health;
    }
    void setDefence(int defence) {
        this.defence = defence;
    }
    void setDamage(int damage) {
        this.damage = damage;
    }
    void setLuck(int luck){
        this.luck = luck;
    }

    int getHealth() {
        return health;
    }
    int getDefence() {
        return defence;
    }
    int getDamage() {
        return damage;
    }
    int getLuck() {
        return luck;
    }

}
