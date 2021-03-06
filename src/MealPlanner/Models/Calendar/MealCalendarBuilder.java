package MealPlanner.Models.Calendar;

import MealPlanner.Models.Meal;
import MealPlanner.Models.Time.Week;
import MealPlanner.StoredMeals;
import java.time.Month;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class MealCalendarBuilder {

  public MealCalendar build(Map<String, String> paramMap) throws IllegalArgumentException {
    MealCalendar mealCalendar = new MealCalendar();

    if (paramMap.containsKey("calendarMonth")) {
      int monthNum = Integer.decode(paramMap.get("calendarMonth"));
      mealCalendar.setMonth(Month.of(monthNum));
    } else {
      throw new IllegalArgumentException("A Meal Calendar must have a Month.");
    }

    if (paramMap.containsKey("calendarYear")) {
      int year = Integer.decode(paramMap.get("calendarYear"));
      mealCalendar.setYear(year);
    } else {
      throw new IllegalArgumentException("A Meal Calendar must have a Year.");
    }

    if (paramMap.containsKey("calendarName")) {
      mealCalendar.setName(paramMap.get("calendarName"));
    }

    MonthDetails monthDetails = new MonthDetails(mealCalendar.getMonth().getValue(),
        mealCalendar.getYear());
    mealCalendar.setMonthDetails(monthDetails);

    Week[] weeks = new Week[6];
    for (int i = 0; i < monthDetails.getNumWeeks(); i++) {
      Week newWeek;
      if (i == 0) {
        newWeek = buildWeek(paramMap, monthDetails.getMonthStartDay());
      } else if (i == monthDetails.getNumWeeks() - 1) {
        int buffer = monthDetails.getMonthEndDay() - 6;
        newWeek = buildWeek(paramMap, buffer);
      } else {
        newWeek = buildWeek(paramMap);
      }

      weeks[i] = newWeek;
    }
    mealCalendar.setWeeks(weeks);

    return mealCalendar;
  }

  private Week buildWeek(Map<String, String> paramMap) throws RuntimeException {
    return buildWeek(paramMap, 0);
  }

  private Week buildWeek(Map<String, String> paramMap, int buffer) throws RuntimeException {
    Meal[] meals = new Meal[7];
    List<Meal> myMeals = StoredMeals.testList;

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
    return new Week(meals);
  }

  private Random randomHandler(Map<String, String> paramMap) {
    Random rand = new Random();
    if (paramMap.containsKey("testSeed")){
      int randSeed = Integer.decode(paramMap.get("testSeed"));
      rand = new Random(randSeed);
    }
    return rand;
  }
}
