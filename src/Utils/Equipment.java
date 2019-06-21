package Utils;

class Equipment {
    private boolean weapon, armor;

    Equipment(){

    }

    void setArmor(boolean armor) {
        this.armor = armor;
    }
    void setWeapon(boolean weapon) {
        this.weapon = weapon;
    }

    boolean getArmor() {
        return armor;
    }
    boolean getWeapon() {
        return weapon;
    }
}
