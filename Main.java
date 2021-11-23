/*
Using your UML diagram, split up the work and program the Date class in Repl.it with your partner. You will need to create another file (Date class) in your Repl.it project for this.  Add Javadoc comments. Write a test application named DateTest that demonstrates class Date‘s capabilities. 
*/

class Main {
  public static void main(String[] args) {
    Date fCrisis = new Date(9, 28, 2008);
    System.out.println("Month: " + fCrisis.getMonth());
    System.out.println("Day: " + fCrisis.getDay());
    System.out.println("Year: " + fCrisis.getYear());
    System.out.println(fCrisis);
    System.out.println("# of Dates: " + Date.getNumberOfDates());
    System.out.println();

    Date endOfWorld = new Date(23, 64, 2012);
    System.out.println("Month: " + endOfWorld.getMonth());
    System.out.println("Day: " + endOfWorld.getDay());
    System.out.println("Year: " + endOfWorld.getYear());
    System.out.println(endOfWorld);
    System.out.println("# of Dates: " + Date.getNumberOfDates());
    System.out.println();

    Date neverForget = new Date();
    System.out.println("Month: " + neverForget.getMonth());
    System.out.println("Day: " + neverForget.getDay());
    System.out.println("Year: " + neverForget.getYear());
    System.out.println(neverForget);
    System.out.println("# of Dates: " + Date.getNumberOfDates());
    System.out.println();

    neverForget.setMonth(13);
    neverForget.setDay(43);
    neverForget.setYear(2010);
    System.out.println("Month: " + neverForget.getMonth());
    System.out.println("Day: " + neverForget.getDay());
    System.out.println("Year: " + neverForget.getYear());
    System.out.println(neverForget);
    System.out.println("# of Dates: " + Date.getNumberOfDates());
    System.out.println();

    neverForget.setMonth(9);
    neverForget.setDay(11);
    neverForget.setYear(2001);
    System.out.println("Month: " + neverForget.getMonth());
    System.out.println("Day: " + neverForget.getDay());
    System.out.println("Year: " + neverForget.getYear());
    System.out.println(neverForget);
    System.out.println("# of Dates: " + Date.getNumberOfDates());
    System.out.println();
  }
}