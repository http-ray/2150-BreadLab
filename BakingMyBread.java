package Bread;

public class BakingMyBread {

    public static void main(String[] args) {
        // Given example
        Sourdough sourdough = new Sourdough();

        // Create 4 more bread classes
        Pastry pastry = new Pastry();
        Baguette baguette = new Baguette();
        RyeBread rye = new RyeBread();
        Focaccia focaccia = new Focaccia();

        System.out.println("Sourdough");
        sourdough.showRecipe();
        sourdough.bake();
        sourdough.bake(); // already baked

        System.out.println("\nPastry");
        pastry.showRecipe();
        pastry.bake();
        pastry.bake(); // already baked

        System.out.println("\nBaguette");
        baguette.showRecipe();
        baguette.bake();
        baguette.bake(); // already baked

        System.out.println("\nRye Bread");
        rye.showRecipe();
        rye.bake();
        rye.bake(); // already baked

        System.out.println("\nFocaccia");
        focaccia.showRecipe();
        focaccia.bake();
        focaccia.bake(); // already baked
    }
}
