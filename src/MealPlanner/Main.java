package MealPlanner;

import MealPlanner.Models.Calendar.MealCalendar;
import MealPlanner.Models.Calendar.MealCalendarBuilder;
import MealPlanner.Models.Calendar.MonthDetails;
import MealPlanner.Models.FoodItem;
import MealPlanner.Models.Meal;
import MealPlanner.Models.Time.Week;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    MealCalendarBuilder mcb = new MealCalendarBuilder();
    HashMap<String,String> paramMap = new HashMap<String,String>();
    paramMap.put("calendarMonth", "6");
    paramMap.put("calendarYear", "2021");
    MealCalendar calendar = mcb.build(paramMap);

    for (int i = 0; i < calendar.getMonthDetails().getNumWeeks(); i++) {
      System.out.println("Week " + (i + 1) + ":");
      System.out.println("----------------------");
      System.out.println(calendar.getWeek(i));
    }
  }
}
