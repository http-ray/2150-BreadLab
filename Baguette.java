package Bread;

public class Baguette {
    private final Bread bread;

    public Baguette() {
        String ingredients =
                "3 cups bread flour\n" +
                        "1 1/4 cups water\n" +
                        "2 tsp salt\n" +
                        "1 tsp yeast";
        String recipe =
                "Mix, autolyse, knead, bulk ferment, shape into batards, proof, slash, and bake at 475F for 22–28 minutes.";
        this.bread = new Bread("Baguette", ingredients, recipe);
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
