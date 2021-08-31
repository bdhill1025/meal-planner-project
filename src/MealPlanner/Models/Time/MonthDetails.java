package MealPlanner.Models.Time;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;

public class MonthDetails {

  private Integer monthNum;
  private Integer year;
  private Integer numDays;
  private Integer numWeeks;
  private Integer monthStartDay;
  private Integer monthEndDay;

  public MonthDetails(Integer monthNum, Integer year) {
    this.monthNum = monthNum;
    this.year = year;
    YearMonth yearMonth = YearMonth.of(year, monthNum);
    LocalDate startDate = yearMonth.atDay(1);
    LocalDate endDate = yearMonth.atDay(yearMonth.lengthOfMonth());
    this.monthStartDay = startDate.getDayOfWeek().getValue() % 7;
    this.monthEndDay = endDate.getDayOfWeek().getValue() % 7;
    this.numDays = Month.of(monthNum).length(Year.isLeap(year));

    int days = yearMonth.lengthOfMonth();
    int daysWithBuffer = days + this.monthStartDay;
    this.numWeeks = (int) Math.ceil(daysWithBuffer / 7.0);
    ;
  }

  public Integer getMonthNum() {
    return monthNum;
  }

  public void setMonthNum(Integer monthNum) {
    this.monthNum = monthNum;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public Integer getNumWeeks() {
    return numWeeks;
  }

  public void setNumWeeks(Integer numWeeks) {
    this.numWeeks = numWeeks;
  }

  public Integer getMonthStartDay() {
    return monthStartDay;
  }

  public void setMonthStartDay(Integer monthStartDay) {
    this.monthStartDay = monthStartDay;
  }

  public Integer getMonthEndDay() {
    return monthEndDay;
  }

  public void setMonthEndDay(Integer monthEndDay) {
    this.monthEndDay = monthEndDay;
  }

  public Integer getNumDays() {
    return numDays;
  }

  public void setNumDays(Integer numDays) {
    this.numDays = numDays;
  }
}
