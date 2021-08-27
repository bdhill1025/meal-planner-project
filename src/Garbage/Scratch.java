package Garbage;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class Scratch {


  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2021, 6, 18);
    int month = date.getMonthValue();
    int days = Month.of(month).length(date.isLeapYear());
    int monthStartDay = (LocalDate.of(date.getYear(), month, 1).getDayOfWeek().getValue()) % 7;

    DayOfWeek dow = DayOfWeek.from(LocalDate.now(Clock.systemDefaultZone()));

    int[][] calendarArr = new int[6][7];

    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 7; j++) {
        int curDay = ((i * 7) + j + 1) - monthStartDay;
        if (curDay <= days && curDay > 0) {
          calendarArr[i][j] = curDay;
        }
      }
    }

    System.out.println(" Su  Mo  Tu  We  Th  Fr  Sa ");
    for (int i = 0; i < 6; i++) {
      String weekLine = "";
      for (int j = 0; j < 7; j++) {
        int curDay = calendarArr[i][j];
        if (!(i > 0 && calendarArr[i][0] == 0)) {
          if (curDay > 0) {
            if (curDay < 10) {
              weekLine += "[0" + curDay + "]";
            } else {
              weekLine += "[" + curDay + "]";
            }
          } else {
            weekLine += "[  ]";
          }
        }
      }
      System.out.println(weekLine);
    }
  }
}
