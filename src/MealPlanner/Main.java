package MealPlanner;

import MealPlanner.Models.Calendar.MealCalendar;
import MealPlanner.Models.Calendar.MealCalendarBuilder;
import MealPlanner.Models.Calendar.MonthDetails;
import MealPlanner.Models.FoodItem;
import MealPlanner.Models.Meal;
import MealPlanner.Models.Time.Week;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    MealCalendarBuilder mcb = new MealCalendarBuilder();
    String finalString = "";
    for (int j = 1; j <13; j++) {
      HashMap<String, String> paramMap = new HashMap<String, String>();
      paramMap.put("calendarMonth", String.valueOf(j));
      paramMap.put("calendarYear", "2021");
      paramMap.put("duplicatesAllowed", "false");
//    paramMap.put("testSeed", "1");
      MealCalendar calendar = mcb.build(paramMap);

      if (j == 1) {
        finalString += "***" + paramMap.get("calendarYear") + "***\n\n";
      }

      finalString += calendar.getMonth().toString().toUpperCase() + "\n\n";
      for (int i = 0; i < calendar.getMonthDetails().getNumWeeks(); i++) {
        finalString += "Week " + (i + 1) + ":\n";
        finalString += "----------------------\n";
        finalString += calendar.getWeek(i);
        if (i != calendar.getMonthDetails().getNumWeeks() - 1) {
          finalString += "\n";
        }
      }
      if (j != 12) {
        finalString += "\n-------------------------------------------------------------\n";
      }
    }
    try {
      PrintWriter out = new PrintWriter("C:\\Users\\Brian Hill\\Desktop\\MealCalendarPrint.txt");
      out.println(finalString);
      out.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
