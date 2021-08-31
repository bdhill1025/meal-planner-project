package MealPlanner.Views;

import MealPlanner.Models.Calendar.MonthMealCalendar;
import MealPlanner.Models.Calendar.YearMealCalendar;

public class TextViewV1 {

  YearMealCalendar model;

  public TextViewV1(YearMealCalendar model) {
    this.model = model;
  }

  public String renderYear() {
    String finalString = "";
    finalString += "***" + model.getYear() + "***\n\n";
    MonthMealCalendar[] months = model.getMonths();

    for (int i = 0; i < model.getMonths().length; i++) {
      finalString += renderMonth(months[i]);
    }
    return finalString;
  }

  private String renderMonth(MonthMealCalendar month) {
    String finalString = "";

    finalString += month.getMonth().toString().toUpperCase() + "\n\n";
    for (int i = 0; i < month.getMonthDetails().getNumWeeks(); i++) {
      finalString += "Week " + (i + 1) + ":\n";
      finalString += "----------------------\n";
      finalString += month.getWeek(i);
      if (i != month.getMonthDetails().getNumWeeks() - 1) {
        finalString += "\n";
      }
    }
    if (month.getMonth().getValue() != 12) {
      finalString += "\n-------------------------------------------------------------\n";
    }
    return finalString;
  }
}
