public class ElectricPokemon extends Pokemon {
    private boolean glowsInTheDark;
    private int numberOfColors;
    private boolean largerThenAMeter;
    private boolean fightsInGroupOnly;

    public ElectricPokemon(String name, int level, String hp, String food, String sound, String type, boolean glowsInTheDark, int numberOfColors, boolean largerThenAMeter, boolean fightsInGroupOnly) {
        super(name, level, hp, food, sound, type);
        this.glowsInTheDark = glowsInTheDark;
        this.numberOfColors = numberOfColors;
        this.largerThenAMeter = largerThenAMeter;
        this.fightsInGroupOnly = fightsInGroupOnly;
    }

    public boolean isGlowsInTheDark() {
        return glowsInTheDark;
    }

    public void setGlowsInTheDark(boolean glowsInTheDark) {
        this.glowsInTheDark = glowsInTheDark;
    }

    public int getNumberOfColors() {
        return numberOfColors;
    }

    public void setNumberOfColors(int numberOfColors) {
        this.numberOfColors = numberOfColors;
    }

    public boolean isLargerThenAMeter() {
        return largerThenAMeter;
    }

    public void setLargerThenAMeter(boolean largerThenAMeter) {
        this.largerThenAMeter = largerThenAMeter;
    }

    public boolean isFightsInGroupOnly() {
        return fightsInGroupOnly;
    }

    public void setFightsInGroupOnly(boolean fightsInGroupOnly) {
        this.fightsInGroupOnly = fightsInGroupOnly;
    }

    public void voltTackle() {
        if (glowsInTheDark) {
            System.out.println("I will tackle my enemy.");
        } else {
            System.out.println("I will electrocute my enemy.");
        }
    }

    public void electroBall() {
        System.out.println("Throwing an electro ball is my speciality.");
    }

    @Override
    public void printType() {
        super.printType();
    }

    @Override
    public void sound() {
        System.out.println("I make an " + this.getSound() + " sound.");
    }

    @Override
    public void food() {
        System.out.println(this.getName() + " eats all day.");
    }
}
