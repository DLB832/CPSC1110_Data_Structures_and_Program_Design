/**
 * @author Derek Campbell
 * @version 9/18/2020
 */

/**
 * a subclass of the Appointment class which creates an event that happens every day.
 */

public class Daily extends Appointment {

    public Daily(int year, int month, int date, String description) {
        super(year, month, date, description);

    }
    
     /**
     * an accessor method which stores the date information only about an appointment.
     * @param year - the year of the appointment.
     * @param month - the month of the appointment.
     * @param day - the day of the appointment.
     * @return - returns true if appointment happens on the same month and same year, even if the day changes.
     */
    public boolean occursOn(int year, int month, int day){
        if (this.year == year && this.month == month){
          return true;
        }
        return false;
      }
  
}
