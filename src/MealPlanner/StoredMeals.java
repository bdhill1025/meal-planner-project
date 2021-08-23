package MealPlanner;

import MealPlanner.Models.FoodItem;
import MealPlanner.Models.Meal;
import java.util.ArrayList;

public class StoredMeals {

  public static final Meal lemonPastaMeal = new Meal("Lemon Pasta", new FoodItem());
  FoodItem lemonPasta = new FoodItem("Lemon Pasta", new ArrayList<String>() {
    {
      add("Lemon");
      add("Spaghetti");
      add("Parsley");
      add("Salt");
      add("Olive Oil");
      add("Parmesan");
    }
  });

  public static final ArrayList<Meal> testList = new ArrayList<Meal>() {
    {
      add(new Meal("Steak Meal"));
      add(new Meal("Pasta Meal"));
      add(new Meal("Taco Meal"));
      add(new Meal("Chicken Meal"));
      add(new Meal("Salmon Meal"));
      add(new Meal("Haddock Meal"));
      add(new Meal("Indian Meal"));
      add(new Meal("Burger Meal"));
      add(new Meal("Hot Dog Meal"));
      add(new Meal("Pork Meal"));
      add(new Meal("Lamb Meal"));
      add(new Meal("Veggie Meal"));
      add(new Meal("Sandwich Meal"));
      add(new Meal("Pizza Meal"));
      add(new Meal("Potato Meal"));
      add(new Meal("Burrito Meal"));
      add(new Meal("Tofu Meal"));
      add(new Meal("Egg Meal"));
      add(new Meal("Pancake Meal"));
      add(new Meal("Waffle Meal"));
      add(new Meal("Bacon Meal"));
      add(new Meal("Veal Meal"));
      add(new Meal("Rice Meal"));
      add(new Meal("Avocado Meal"));
      add(new Meal("Chinese Meal"));
      add(new Meal("Korean Meal"));
      add(new Meal("Japanese Meal"));
    }
  };

  Meal meal1 = new Meal("Steak Meal");
  Meal meal2 = new Meal("Pasta Meal");
  Meal meal3 = new Meal("Taco Meal");
  Meal meal4 = new Meal("Chicken Meal");
  Meal meal5 = new Meal("Salmon Meal");
  Meal meal6 = new Meal("Haddock Meal");
  Meal meal7 = new Meal("Indian Meal");
  Meal meal8 = new Meal("Burger Meal");
  Meal meal9 = new Meal("Hot Dog Meal");
  Meal meal10 = new Meal("Pork Meal");
  Meal meal11 = new Meal("Lamb Meal");
  Meal meal12 = new Meal("Veggie Meal");
  Meal meal13 = new Meal("Sandwich Meal");
  Meal meal14 = new Meal("Pizza Meal");
  Meal meal15 = new Meal("Potato Meal");
  Meal meal16 = new Meal("Burrito Meal");
}
