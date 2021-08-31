package MealPlanner.Models.Calendar;

import MealPlanner.Models.Time.Week;
import java.time.Month;
import java.time.Year;

public class MonthMealCalendar {

  private Week[] weeks;
  private Month month;
  private Integer year;
  private String name;

  private MonthDetails monthDetails;

  public MonthMealCalendar() {
    this.name = "Default";
    this.weeks = new Week[6];
    this.month = null;
    this.year = null;
    this.monthDetails = null;
  }

  public Week[] getWeeks() {
    return weeks;
  }

  public void setWeeks(Week[] weeks) {
    this.weeks = weeks;
  }

  public Week getWeek(int index) throws IndexOutOfBoundsException{
    if (index >= monthDetails.getNumWeeks() || index < 0) {
      throw new IndexOutOfBoundsException("This Meal Calendar doesn't "
          + "contain a week at index " + index + " .");
    }
    return weeks[index];
  }

  public Month getMonth() {
    return month;
  }

  public void setMonth(Month month) {
    this.month = month;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public MonthDetails getMonthDetails() {
    return monthDetails;
  }

  public void setMonthDetails(MonthDetails monthDetails) {
    this.monthDetails = monthDetails;
  }
}
