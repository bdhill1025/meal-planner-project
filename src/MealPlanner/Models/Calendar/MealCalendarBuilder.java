package MealPlanner.Models.Calendar;

import MealPlanner.Models.Meal;
import MealPlanner.Models.Time.Week;
import MealPlanner.StoredMeals;
import MealPlanner.Views.TextViewV1;
import java.time.Month;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class MealCalendarBuilder {

  public YearMealCalendar buildYear(Map<String, String> paramMap) {
    YearMealCalendar yearMealCalendar = new YearMealCalendar();
    MonthMealCalendar[] months = new MonthMealCalendar[12];
    if (paramMap.containsKey("calendarYear")) {
      int year = Integer.decode(paramMap.get("calendarYear"));
      yearMealCalendar.setYear(year);
    } else {
      throw new IllegalArgumentException("A Meal Calendar must have a Year.");
    }

    for (int j = 1; j < 13; j++) {
      paramMap.put("calendarMonth", String.valueOf(j));
      MonthMealCalendar month = buildMonth(paramMap);
      months[j - 1] = month;
    }
    yearMealCalendar.setMonths(months);

    return yearMealCalendar;
  }

  public MonthMealCalendar buildMonth(Map<String, String> paramMap) throws IllegalArgumentException {
    MonthMealCalendar monthMealCalendar = new MonthMealCalendar();

    if (paramMap.containsKey("calendarMonth")) {
      int monthNum = Integer.decode(paramMap.get("calendarMonth"));
      monthMealCalendar.setMonth(Month.of(monthNum));
    } else {
      throw new IllegalArgumentException("A Meal Calendar must have a Month.");
    }

    if (paramMap.containsKey("calendarYear")) {
      int year = Integer.decode(paramMap.get("calendarYear"));
      monthMealCalendar.setYear(year);
    } else {
      throw new IllegalArgumentException("A Meal Calendar must have a Year.");
    }

    if (paramMap.containsKey("calendarName")) {
      monthMealCalendar.setName(paramMap.get("calendarName"));
    }

    MonthDetails monthDetails = new MonthDetails(monthMealCalendar.getMonth().getValue(),
        monthMealCalendar.getYear());
    monthMealCalendar.setMonthDetails(monthDetails);
    Integer[][] dateArr = generateDates(monthDetails);

    Week[] weeks = new Week[6];
    for (int i = 0; i < monthDetails.getNumWeeks(); i++) {
      Week newWeek;
      if (i == 0) {
        newWeek = buildWeek(paramMap, dateArr[i], monthDetails.getMonthStartDay());
      } else if (i == monthDetails.getNumWeeks() - 1) {
        int buffer = monthDetails.getMonthEndDay() - 6;
        newWeek = buildWeek(paramMap, dateArr[i], buffer);
      } else {
        newWeek = buildWeek(paramMap, dateArr[i]);
      }

      weeks[i] = newWeek;
    }
    monthMealCalendar.setWeeks(weeks);

    return monthMealCalendar;
  }

  private Week buildWeek(Map<String, String> paramMap, Integer[] dates) throws RuntimeException {
    return buildWeek(paramMap, dates, 0);
  }

  private Week buildWeek(Map<String, String> paramMap, Integer[] dates, int buffer) throws RuntimeException {
    Meal[] meals = new Meal[7];
    List<Meal> myMeals = StoredMeals.mealList776;

    int startDay, lastDay;
    startDay = 0;
    lastDay = 7;

    if (buffer >= 0) {
      startDay = buffer;
    } else {
      lastDay += buffer;
    }

    Set<Integer> set = new HashSet<Integer>();

    for (int i = 0 + startDay; i < lastDay; i++) {
      int r = -1;
      Random rand = randomHandler(paramMap);
      if (paramMap.containsKey("duplicatesAllowed") &&
          !Boolean.parseBoolean(paramMap.get("duplicatesAllowed"))) {
        int curSize = set.size();
        while (set.size() == curSize) {
          r = rand.nextInt(myMeals.size());
          if (!set.contains(r)) {
            set.add(r);
          }
        }
      } else {
        r = rand.nextInt(myMeals.size());
      }
      if (r != -1) {
        meals[i] = myMeals.get(r);
      } else {
        throw new RuntimeException("Something went wrong while generating a week.");
      }
    }
    Week week = new Week(meals);
    week.setDates(dates);
    return week;
  }

  private Random randomHandler(Map<String, String> paramMap) {
    Random rand = new Random();
    if (paramMap.containsKey("testSeed")){
      int randSeed = Integer.decode(paramMap.get("testSeed"));
      rand = new Random(randSeed);
    }
    return rand;
  }

  private Integer[][] generateDates(MonthDetails monthDetails) {

    Integer[][] dateArr = new Integer[6][7];

    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 7; j++) {
        int curDay = ((i * 7) + j + 1) - monthDetails.getMonthStartDay();
        if (curDay <= monthDetails.getNumDays() && curDay > 0) {
          dateArr[i][j] = curDay;
        }
      }
    }
    return dateArr;
  }
}
