public class WaterPokemon extends Pokemon {
    private Boolean fightWithHotWater;
    private Boolean livesInWater;
    private Boolean hasShield;
    private Boolean canFLy;

    public WaterPokemon(String name, int level, String hp, String food, String sound, String type, Boolean fightWithHotWater, Boolean livesInWater, Boolean hasShield, Boolean canFLy) {
        super(name, level, hp, food, sound, type);
        this.fightWithHotWater = fightWithHotWater;
        this.livesInWater = livesInWater;
        this.hasShield = hasShield;
        this.canFLy = canFLy;
    }

    public Boolean getFightWithHotWater() {
        return fightWithHotWater;
    }

    public void setFightWithHotWater(Boolean fightWithHotWater) {
        this.fightWithHotWater = fightWithHotWater;
    }

    public Boolean getLivesInWater() {
        return livesInWater;
    }

    public void setLivesInWater(Boolean livesInWater) {
        this.livesInWater = livesInWater;
    }

    public Boolean getHasShield() {
        return hasShield;
    }

    public void setHasShield(Boolean hasShield) {
        this.hasShield = hasShield;
    }

    public Boolean getCanFLy() {
        return canFLy;
    }

    public void setCanFLy(Boolean canFLy) {
        this.canFLy = canFLy;
    }

    public void surf() {
        System.out.println("I am a " + this.getType() + " Pokemon and I like to surf.");
    }

    public void rainDance() {
        if (livesInWater) {
            System.out.println("I will never do a rain dance because I live in the water.");
        } else {
            System.out.println("I like to do a rain dance every day.");
        }
    }

    @Override
    public void printType() {
        super.printType();
    }

    @Override
    public void sound() {
        System.out.println("I make a " + this.getSound() + " sound.");
    }

    @Override
    public void food() {
        System.out.println(this.getName() + " eats during the day.");
    }
}
