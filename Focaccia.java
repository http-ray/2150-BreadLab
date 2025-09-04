package Bread;

public class Focaccia {
    private final Bread bread;

    public Focaccia() {
        String ingredients =
                "3 cups all-purpose flour\n" +
                        "1 1/4 cups warm water\n" +
                        "2 tbsp olive oil\n" +
                        "1 1/2 tsp salt\n" +
                        "1 tsp yeast\n" +
                        "Rosemary & flaky salt";
        String recipe =
                "Mix and stretch-fold dough, bulk rise with olive oil, dimple in pan, top with rosemary and salt, and bake at 450F for 20–25 minutes.";
        this.bread = new Bread("Focaccia", ingredients, recipe);
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
