package Bread;

public class RyeBread {
    private final Bread bread;

    public RyeBread() {
        String ingredients =
                "1 1/2 cups rye flour\n" +
                        "1 1/2 cups bread flour\n" +
                        "1 1/4 cups warm water\n" +
                        "2 tsp caraway seeds\n" +
                        "1 1/2 tsp salt\n" +
                        "1 tsp yeast";
        String recipe =
                "Combine flours, water, salt, yeast, and caraway, knead lightly, proof, shape round, rise, and bake at 400F for 35–40 minutes.";
        this.bread = new Bread("Rye Bread", ingredients, recipe);
    }

    public String getIngredients() { return bread.getIngredients(); }

    public void showRecipe() {
        System.out.println("Ingredients of " + bread.getBreadName() + " are:");
        System.out.println(getIngredients());
        System.out.println("\nRecipe of " + bread.getBreadName() + ":");
        System.out.println(bread.getRecipe());
    }

    public void bake() { bread.bake(); }
}
