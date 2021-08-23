package MealPlanner.Models;

import java.util.ArrayList;
import java.util.List;

public class FoodItem {

  private String name;
  private List<String> ingredients;


  public FoodItem(String name, List<String> ingredients) {
    this.name = name;
    this.ingredients = ingredients;
  }

  public FoodItem() {
    this.name = "Empty Food Item";
    this.ingredients = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getIngredients() {
    return ingredients;
  }

  public void setIngredients(List<String> ingredients) {
    this.ingredients = ingredients;
  }
}
