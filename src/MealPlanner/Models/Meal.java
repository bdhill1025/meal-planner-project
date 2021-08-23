package MealPlanner.Models;

import java.util.ArrayList;

public class Meal {

  private String name;
  private FoodItem main;
  private ArrayList<FoodItem> sides;


  public Meal(String name, FoodItem main, ArrayList<FoodItem> sides) {
    this.name = name;
    this.main = main;
    this.sides = sides;
  }

  public Meal(String name, FoodItem main) {
    this.name = name;
    this.main = main;
    this.sides = null;
  }

  public Meal(String name) {
    this.name = name;
    this.main = new FoodItem();
    this.sides = null;
  }

  @Override
  public String toString() {
    if (name != null) {
      return name;
    } else {
      return "No Meal";
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FoodItem getMain() {
    return main;
  }

  public void setMain(FoodItem main) {
    this.main = main;
  }

  public ArrayList<FoodItem> getSides() {
    return sides;
  }

  public void setSides(ArrayList<FoodItem> sides) {
    this.sides = sides;
  }
}
