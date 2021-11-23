public class Date {
  private int month;
  private int day;
  private int year;
  private static final int DEFAULT_MONTH = 1;
  private static final int DEFAULT_DAY = 2;
  private static final int DEFAULT_YEAR = 2008;
  private static int numberOfDates = 0;
  
  public Date() {
    month = DEFAULT_MONTH;
    day = DEFAULT_DAY;
    year = DEFAULT_YEAR;
    numberOfDates++;
  }
  public Date(int monthChange, int dayChange, int yearChange) {
    month = monthChange;
    day = dayChange;
    year = yearChange;
    if (month == 2 && day >= 28) {
      if (year%4 == 0 && year%100 != 0 && day > 29) {
        day = 29;
        System.out.println("Impossible day value\nDay is now set to 29");
      }
      else if (year%400 == 0 && day > 29) {
        day = 29;
        System.out.println("Impossible day value\nDay is now set to 29");
      }
      else {
        day = 28;
        System.out.println("Impossible day value\nDay is now set to 28");
      }
    }
    else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8|| month == 10|| month == 12) {
      if (day > 31) {
        day = 31;
        System.out.println("Impossible day value\nDay is now set to 31");
      }
      else {
        day = dayChange;
      }
    }
    else if (month == 4 || month == 6 || month == 9 || month == 11) {
      if (day > 30) {
        day = 30;
        System.out.println("Impossible day value\nDay is now set to 30");
      }
      else {
        day = dayChange;
      }
    }
    else {
      month = 12;
      System.out.println("Impossible month value\nMonth is now set to 12");
      if (day > 31) {
        day = 31;
        System.out.println("Impossible day value\nDay is now set to 31");
      }
      else {
        day = dayChange;
      }
    }
    numberOfDates++;
  }
  public int getMonth() {
    return month;
  }
  public int getDay() {
    return day;
  }
  public int getYear() {
    return year;
  }
  public void setMonth(int monthChange) {
    if (month > 12) {
      month = 12;
      System.out.println("Impossible month value\nMonth is now set to 12");
    }
    else {
      month = monthChange;
    }
  }
  public void setDay(int dayChange) {
    if (month == 2 && dayChange > 28) {
      if (year%4 == 0 && year%100 != 0 && dayChange > 29) {
        day = 29;
        System.out.println("Impossible day value\nDay is now set to 29");
      }
      else if (year%400 == 0 && dayChange > 29) {
        day = 29;
        System.out.println("Impossible day value\nDay is now set to 29");
      }
      else {
        day = 28;
        System.out.println("Impossible day value\nDay is now set to 28");
      }
    }
    else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8|| month == 10|| month == 12) {
      if (dayChange > 31) {
        day = 31;
        System.out.println("Impossible day value\nDay is now set to 31");
      }
      else {
        day = dayChange;
      }
    }
    else if (month == 4 || month == 6 || month == 9 || month == 11) {
      if (dayChange > 30) {
        day = 30;
        System.out.println("Impossible day value\nDay is now set to 30");
      }
      else {
        day = dayChange;
      }
    }
    else {
      month = 12;
      System.out.println("Impossible month value\nMonth is now set to 12");
      if (dayChange > 31) {
        day = 31;
        System.out.println("Impossible day value\nDay is now set to 31");
      }
      else {
        day = dayChange;
      }
    }
  }
  public void setYear(int yearChange) {
    year = yearChange;
  }
  public String toString() {
    return year + "/" + month + "/" + day;
  }
  public static int getNumberOfDates() {
    return numberOfDates;
  }
}