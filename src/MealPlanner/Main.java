package MealPlanner;

import MealPlanner.Models.Calendar.MonthMealCalendar;
import MealPlanner.Models.Calendar.MealCalendarBuilder;
import MealPlanner.Models.Calendar.YearMealCalendar;
import MealPlanner.Views.TextViewV1;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Year;
import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    String fileName = args[0];

    try {
      PrintWriter out = new PrintWriter(fileName);
      out.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    String finalString = "";
    MealCalendarBuilder mcb = new MealCalendarBuilder();
    HashMap<String, String> paramMap = new HashMap<String, String>();
    paramMap.put("calendarYear", "2021");
    paramMap.put("duplicatesAllowed", "false");
//    paramMap.put("testSeed", "1");
    YearMealCalendar calendar = mcb.buildYear(paramMap);
    TextViewV1 textView = new TextViewV1(calendar);
    finalString += textView.renderYear();

    try {
      PrintWriter out = new PrintWriter(fileName);
      out.println(finalString);
      out.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    try {
      File openFile = new File(fileName);
      Desktop desktop = Desktop.getDesktop();
      desktop.open(openFile);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
