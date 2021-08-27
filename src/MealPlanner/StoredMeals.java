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
      add(new Meal("Marinaded Chicken"));
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
    }
  };

  public static final ArrayList<Meal> mealList776 = new ArrayList<Meal>() {
    {
      add(new Meal("Chicken Marsala"));
      add(new Meal("Lasagna"));
      add(new Meal("Ravioli Sage Butter Sausage"));
      add(new Meal(""));
    }
  };

  Meal meal1 = new Meal("Feta Pasta");
  Meal meal2 = new Meal("Chicken Parm");
  Meal meal3 = new Meal("Burgers");
  Meal meal4 = new Meal("Baked Salmon");
  Meal meal5 = new Meal("Sesame Garlic Tofu");
  Meal meal6 = new Meal("Chicken Picata");
  Meal meal7 = new Meal("Mushroom Pasta");
  Meal meal8 = new Meal("Chicken Quesadillas");
  Meal meal9 = new Meal("Peanut Sauce Noodles");
  Meal meal10 = new Meal("Pork Meal");
  Meal meal11 = new Meal("Lamb Meal");
  Meal meal12 = new Meal("Veggie Meal");
  Meal meal13 = new Meal("Sandwich Meal");
  Meal meal14 = new Meal("Pizza Meal");
  Meal meal15 = new Meal("Potato Meal");
  Meal meal16 = new Meal("Burrito Meal");
}
