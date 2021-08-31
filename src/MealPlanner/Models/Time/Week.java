package MealPlanner.Models.Time;

import MealPlanner.Models.Meal;
import MealPlanner.Utils.DayUtil;
import MealPlanner.Utils.DayUtil.Day;
import java.util.List;

public class Week {

  private Meal[] meals;
  private Integer[] dates;

  public Week(List<Meal> mealList) {
    Meal[] meals = new Meal[7];
    Integer[] dates = new Integer[7];

    for (int i = 0; i < 7; i++) {
      Day day = DayUtil.daySwitch(i);
      if (i < mealList.size()) {
        meals[i] = mealList.get(i);
      } else {
        meals[i] = null;
      }
    }

    this.meals = meals;
  }

  public Week(Meal[] mealArray) {

    this.meals = mealArray;
    Integer[] days = new Integer[7];
  }

  public Integer[] getDates() {
    return dates;
  }

  public void setDates(Integer[] dates) {
    this.dates = dates;
  }

  @Override
  public String toString() {

    String weekString = "";

    for (int i = 0; i < 7; i++) {
      Day day = DayUtil.daySwitch(i);
      String mealString = "";
      String dateString = "";
      if (meals[i] != null) {
        Meal meal = meals[i];
        Integer date = dates[i];
        mealString = meal.toString();
        dateString = date.toString();
        if (dateString.length() == 1) {
          dateString = "0" + dateString;
        }
        String ingredientString = "";
        List<String> ingredients = meal.getMain().getIngredients();
        for (String ingredient : ingredients) {
          ingredientString += ingredient;
          if (ingredients.size() - 2 == ingredients.indexOf(ingredient)) {
            ingredientString += ", ";
          }
        }
        if (!ingredientString.equals("")) {
          mealString += " - " + ingredientString;
        }
      } else {
        continue;
      }
      String singleDay =
          dateString + "|" + DayUtil.dayString(day) + ": " + mealString;
      weekString += singleDay + "\n";
    }
    return weekString;
  }
}
