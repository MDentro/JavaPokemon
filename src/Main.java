public class Main {
    public static void main(String[] args) {
        WaterPokemon piet = new WaterPokemon("Piet", 1, "high", "fish", "water", "Water", true, false, true, false);
        System.out.println("Water Pokemon " + piet.getName());
        piet.sound();
        piet.printType();
        piet.surf();
        piet.food();
        piet.rainDance();
        System.out.println();

        FirePokemon jan = new FirePokemon("Jan", 2, "low", "fire", "fire", "Fire", 1, false, "orange", 300);
        System.out.println("Fire Pokemon " + jan.getName());
        jan.sound();
        jan.printType();
        jan.fireLash();
        jan.thunderPunch();
        System.out.println();

        GrassPokemon joop = new GrassPokemon("Joop", 3, "high", "Plants", "grass", "Grass", true, true, 2, "Green");
        System.out.println("Grass Pokemon " + joop.getName());
        joop.leafStorm();
        joop.sound();
        joop.speaks();
        System.out.println();

        ElectricPokemon pieter = new ElectricPokemon("Pieter", 4, "low", "Electricity", "electric", "Electric", true, 3, false, true);
        System.out.println("Electric Pokemon " + pieter.getName());
        pieter.sound();
        pieter.voltTackle();
        pieter.electroBall();

    }
}
