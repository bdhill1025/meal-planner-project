package MealPlanner.Utils;


public class DayUtil {

  public enum Day {MON, TUE, WED, THU, FRI, SAT, SUN}

  public static Day daySwitch(int dayIndex) {

    Day day = null;

    switch (dayIndex) {
      case 0:
        day = Day.SUN;
        break;
      case 1:
        day = Day.MON;
        break;
      case 2:
        day = Day.TUE;
        break;
      case 3:
        day = Day.WED;
        break;
      case 4:
        day = Day.THU;
        break;
      case 5:
        day = Day.FRI;
        break;
      case 6:
        day = Day.SAT;
        break;
    }
    return day;
  }

  public static String dayString(Day day) {

    String dayString = "";

    switch (day) {
      case SUN:
        dayString = "Sun";
        break;
      case MON:
        dayString = "Mon";
        break;
      case TUE:
        dayString = "Tue";
        break;
      case WED:
        dayString = "Wed";
        break;
      case THU:
        dayString = "Thu";
        break;
      case FRI:
        dayString = "Fri";
        break;
      case SAT:
        dayString = "Sat";
        break;
    }
    return dayString;
  }

}
