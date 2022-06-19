public class FirePokemon extends Pokemon {
    private int height;
    private boolean spitsFire;
    private String fireColor;
    private int fireTemperature;

    public FirePokemon(String name, int level, String hp, String food, String sound, String type, int height, boolean spitsFire, String fireColor, int fireTemperature) {
        super(name, level, hp, food, sound, type);
        this.height = height;
        this.spitsFire = spitsFire;
        this.fireColor = fireColor;
        this.fireTemperature = fireTemperature;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isSpitsFire() {
        return spitsFire;
    }

    public void setSpitsFire(boolean spitsFire) {
        this.spitsFire = spitsFire;
    }

    public String getFireColor() {
        return fireColor;
    }

    public void setFireColor(String fireColor) {
        this.fireColor = fireColor;
    }

    public int getFireTemperature() {
        return fireTemperature;
    }

    public void setFireTemperature(int fireTemperature) {
        this.fireTemperature = fireTemperature;
    }

    public void fireLash() {
        System.out.println("I can throw a fire lash with the color: " + this.fireColor + ".");
    }

    public void thunderPunch() {
        System.out.println("I will use my " + this.fireTemperature + " celsius to give you a thunder punch.");
    }


    @Override
    public void printType() {
        super.printType();
    }

    @Override
    public void sound() {
        System.out.println("I make a " + this.getSound() + " sound when I am hungry.");
    }

    @Override
    public void food() {
        System.out.println(this.getName() + " eats during the night.");
    }
}
