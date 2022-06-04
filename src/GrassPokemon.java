public class GrassPokemon extends Pokemon {
    private Boolean hasFLowers;
    private Boolean hasLeaves;
    private int numberOfLegs;
    private String mainColor;

    public GrassPokemon(String name, int level, String hp, String food, String sound, String type, Boolean hasFLowers, Boolean hasLeaves, int numberOfLegs, String mainColor) {
        super(name, level, hp, food, sound, type);
        this.hasFLowers = hasFLowers;
        this.hasLeaves = hasLeaves;
        this.numberOfLegs = numberOfLegs;
        this.mainColor = mainColor;
    }

    public Boolean getHasFLowers() {
        return hasFLowers;
    }

    public void setHasFLowers(Boolean hasFLowers) {
        this.hasFLowers = hasFLowers;
    }

    public Boolean getHasLeaves() {
        return hasLeaves;
    }

    public void setHasLeaves(Boolean hasLeaves) {
        this.hasLeaves = hasLeaves;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getMainColor() {
        return mainColor;
    }

    public void setMainColor(String mainColor) {
        this.mainColor = mainColor;
    }

    public void leafStorm() {
        if (hasLeaves) {
            System.out.println("I can defend myself with a leaf storm.");
        } else {
            System.out.println("I ask fellow grass Pokemons to organise a leaf storm if we are attacked.");
        }
    }

    public void speaks() {
        if (numberOfLegs == 2) {
            System.out.println("I speak two languages.");
        } else if (numberOfLegs == 3) {
            System.out.println("I speak three languages.");
        } else {
            System.out.println("I speak just one language.");
        }

    }


    @Override
    public void printType() {
        super.printType();
    }

    @Override
    public void sound() {
        System.out.println("I make a " + this.getSound() + " sound during the evening.");
    }

    @Override
    public void food() {
        System.out.println(this.getName() + " eats only in the afternoon.");
    }
}
