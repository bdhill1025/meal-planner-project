package MealPlanner;

import MealPlanner.Models.Calendar.MealCalendarBuilder;
import MealPlanner.Models.Calendar.YearMealCalendar;
import MealPlanner.Utils.PrintUtil;
import MealPlanner.Views.TextViewV1;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    String filePath = args[0];

    try {
      PrintWriter out = new PrintWriter(filePath);
      out.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    String finalString = "";
    MealCalendarBuilder mcb = new MealCalendarBuilder();
    HashMap<String, String> paramMap = new HashMap<String, String>();
    paramMap.put("calendarYear", "2021");
    paramMap.put("duplicatesAllowed", "false");
    paramMap.put("testSeed", "1");
    YearMealCalendar calendar = mcb.buildYear(paramMap);
    TextViewV1 textView = new TextViewV1(calendar);
    finalString += textView.renderYear();

    PrintUtil.printAndOpenFile(finalString, filePath);
  }
}
