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

  public static final ArrayList<Meal> mealList776 = new ArrayList<Meal>() {
    {
      add(new Meal("Feta Pasta"));
      add(new Meal("Chicken Parm"));
      add(new Meal("Burgers"));
      add(new Meal("Baked Salmon"));
      add(new Meal("Sesame Garlic Tofu"));
      add(new Meal("Chicken Picata"));
      add(new Meal("Mushroom Pasta"));
      add(new Meal("Chicken Quesadillas"));
      add(new Meal("Peanut Sauce Noodles"));
      add(new Meal("Roasted Chicken"));
      add(new Meal("Cajan Mac-N-Cheese"));
      add(new Meal("Fried Rice w/ Orange Chicken"));
      add(new Meal("Baked Ziti"));
      add(new Meal("Turkey Sliders"));
      add(new Meal("Pasta w/ Vodka Sauce"));
      add(new Meal("Taco Tuesday"));
      add(new Meal("Marinated Chicken"));
      add(new Meal("Chicken Tika Masala"));
      add(new Meal("Falafel"));
      add(new Meal("Pizza"));
      add(new Meal("Glizzies"));
      add(new Meal("Chicken Pesto Pasta"));
      add(new Meal("Chicken Burrito"));
      add(new Meal("Chicken Wraps"));
      add(new Meal("Chicken Alfredo"));
      add(new Meal("Lemon Pasta"));
      add(new Meal("Wingz Over"));
      add(new Meal("Good Eatz"));
      add(new Meal("Bankok Pinto"));
      add(new Meal("Blaze Pizza"));
    }
  };

  public static final ArrayList<Meal> mealListFastFood = new ArrayList<Meal>() {
    {
      add(new Meal("Popeyes"));
      add(new Meal("McDonald's"));
      add(new Meal("Crispy Dicks"));
      add(new Meal("Chipotle"));
      add(new Meal("Boston Schwarma"));
      add(new Meal("Wingz Over"));
      add(new Meal("Good Eatz"));
      add(new Meal("Bankok Pinto"));
      add(new Meal("Blaze Pizza"));
    }
  };
}
