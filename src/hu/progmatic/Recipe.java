package hu.progmatic;

import java.util.Arrays;

public class Recipe {

    private String name;
    private String difficulty;
    public int preparationTime;
    private boolean vegan;
    private String[] ingredients;
    private String instruction;

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", preparationTime=" + preparationTime +
                ", vegan=" + vegan +
                ", ingredients=" + Arrays.toString(ingredients) +
                ", instruction='" + instruction + '\'' +
                '}';
    }

    public Recipe(String name, String difficulty, int preparationTime, boolean vegan, String[] ingredients, String instruction) {
        this.name = name;
        this.difficulty = difficulty;
        this.preparationTime = preparationTime;
        this.vegan = vegan;
        this.ingredients = ingredients;
        this.instruction = instruction;
    }

    public Recipe(String name, String difficulty, int preparationTime, boolean vegan, String[] ingredients) {
        this.name = name;
        this.difficulty = difficulty;
        this.preparationTime = preparationTime;
        this.vegan = vegan;
        this.ingredients = ingredients;
    }

    public Recipe(String name, String difficulty, int preparationTime, boolean vegan) {
        this.name = name;
        this.difficulty = difficulty;
        this.preparationTime = preparationTime;
        this.vegan = vegan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }


}
