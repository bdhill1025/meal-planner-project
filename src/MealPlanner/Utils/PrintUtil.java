package MealPlanner.Utils;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintUtil {

  public static void printAndOpenFile(String stringToPrint, String filePath) {
    printStringToFile(stringToPrint, filePath);
    openFile(filePath);
  }

  public static void appendAndOpenFile(String stringToPrint, String filePath) {
    appendStringToFile(stringToPrint, filePath);
    openFile(filePath);
  }

  public static void printStringToFile(String stringToPrint, String filePath) {
    try {
      PrintWriter out = new PrintWriter(filePath);
      out.println(stringToPrint);
      out.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    try {
      File openFile = new File(filePath);
      Desktop desktop = Desktop.getDesktop();
      desktop.open(openFile);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void appendStringToFile(String stringToAppend, String filePath) {
    try {
      PrintWriter out = new PrintWriter(filePath);
      out.append(stringToAppend);
      out.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    try {
      File openFile = new File(filePath);
      Desktop desktop = Desktop.getDesktop();
      desktop.open(openFile);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void openFile(String filePath) {
    try {
      File openFile = new File(filePath);
      Desktop desktop = Desktop.getDesktop();
      desktop.open(openFile);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
