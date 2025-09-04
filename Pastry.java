package Bread;

public class Pastry {
    private final Bread bread;

    public Pastry() {
        String ingredients =
                "2 cups flour\n" +
                        "1/2 cup cold butter\n" +
                        "1/3 cup sugar\n" +
                        "1/2 cup milk\n" +
                        "1 tsp salt";
        String recipe =
                "Cut butter into flour, add sugar, milk, and salt, fold the dough, chill, shape, and bake at 375F for 20–25 minutes.";
        this.bread = new Bread("Pastry", ingredients, recipe);
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
