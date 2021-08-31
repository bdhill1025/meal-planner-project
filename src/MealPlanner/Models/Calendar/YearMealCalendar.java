package MealPlanner.Models.Calendar;

import MealPlanner.Views.TextViewV1;
import java.util.HashMap;

public class YearMealCalendar {

  Integer year;
  MonthMealCalendar[] months;

  public YearMealCalendar() { }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public MonthMealCalendar[] getMonths() {
    return months;
  }

  public void setMonths(MonthMealCalendar[] months) {
    this.months = months;
  }
}
