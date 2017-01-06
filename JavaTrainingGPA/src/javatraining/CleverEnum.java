/*
 * a-sti.ro
 */
package javatraining;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class CleverEnum {
    /**
     * Enumeration of days of week
     */
     public enum DayOfWeek { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
                             THURSDAY, FRIDAY, SATURDAY };
     /**
      * Methods implements following logic:
      * 
      * Mondays are bad. - if day is Monday
        Fridays are better. - if day is Friday
        Weekends are best.- if day is Saturday
        Weekends are best.- if day is Sunday
        Midweek days are so-so - for any other day
     * @param day day to be analyzed
     * @return a specific message
     */
     public static String tellHowDayIs(DayOfWeek day){
         String message = new String();
         
         String mondayMessage = new String("Mondays are bad.");
         String fridayMessage = new String("Fridays are better.");
         String weekendMessage = new String("Weekends are best.");
         String midweekMessage = new String("Midweek days are so-so.");
         
         if( day == DayOfWeek.MONDAY){
             message = mondayMessage;
         }
         else if(day == DayOfWeek.FRIDAY){
             message = fridayMessage;
         }
         else if((day == DayOfWeek.SATURDAY) ||
                 (day == DayOfWeek.SUNDAY )){
             message = weekendMessage;
         }
         else{
             message = midweekMessage;
         }
         return(message);
     }
     
    /**
     * @param args are not used
     */
    public static void main(String[] args) {
        
        System.out.println(tellHowDayIs(DayOfWeek.MONDAY));
        System.out.println(tellHowDayIs(DayOfWeek.FRIDAY));
        System.out.println(tellHowDayIs(DayOfWeek.SATURDAY));
        System.out.println(tellHowDayIs(DayOfWeek.SUNDAY));
        System.out.println(tellHowDayIs(DayOfWeek.TUESDAY));
        System.out.println(tellHowDayIs(DayOfWeek.WEDNESDAY));
        System.out.println(tellHowDayIs(DayOfWeek.THURSDAY));
        
    }
    
}
