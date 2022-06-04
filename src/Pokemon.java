public abstract class Pokemon {
    private String name;
    private int level;
    private String hp;
    private String food;
    private String sound;
    private String type;

    public Pokemon(String name, int level, String hp, String food, String sound, String type) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void printType() {
        System.out.println("I am a Pokemon of the type " + this.type + ".");
    }

    public abstract void sound();

    public abstract void food();
}
