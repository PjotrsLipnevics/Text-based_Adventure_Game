package Utils;

class Player extends Stats{
    private String name;

    Player(String name) {
        this.name = name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName(){
        return this.name;
    }

}
