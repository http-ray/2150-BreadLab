Each class must hold a Bread object and provide its own ingredients and recipe.

Instructions
Do not use inheritance. No extends, no implements, no @Override. 

Do not copy and paste.  
Each bread type has a Bread object inside it.

In the constructor, set up the bread name, ingredients, and recipe.

Ingredients: make a short list with the main items.

Recipe: write one brief sentence. Example:
“Mix, make the dough, proof, fold, shape, rise, and bake at 375°F for 45 minutes.”

Add these methods to each class:

getIngredients() → return ingredients from the Bread object

showRecipe() → print bread name, ingredients, and recipe

bake() → call the bake() method of the Bread object

Update Main
In BakingMyBread.java, after     Sourdough sourdough = new Sourdough();
create objects of Pastry, Baguette, RyeBread, and Focaccia

For each one, call showRecipe()

Bake twice so you can see both messages (baked + already baked).
