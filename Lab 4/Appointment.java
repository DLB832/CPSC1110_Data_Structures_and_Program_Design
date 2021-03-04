/**
 * @author Derek Campbell
 * @version 9/18/2020
 */

 /**
  * Superclass for the different types of appointments. 
  * 4 method constructor: year, month, day, description
  */
public class Appointment {

  //needs to have the constructors as instance variables.
  public String description;
  public int month;
  public int day;
  public int year;

  /**
   * the constructor method for an Appointment.
   * 
   * @param year        - the year of the appointment.
   * @param month       - the month of the appointment.
   * @param date        - the day of the appointment.
   * @param description - a short description of the appointment.
   */
    public Appointment(int year, int month, int date, String description){
      
      //NOTE: needs to initialize the instance variables with the constructors parameters.
      this.year = year;
      this.month = month;
      this.day = date;
      this.description = description;

    }

    /**
     * an accessor method which stores the date information only about an appointment.
     * @param year - the year of the appointment.
     * @param month - the month of the appointment.
     * @param day - the day of the appointment.
     * @return - returns true if the paramaters are identical to the stored appointment value.
     */
    public boolean occursOn(int year, int month, int day){
      if (this.year == year && this.day == day && this.month == month){
        return true;
      }
      return false;
    }

    /**
     * Method to return a string representation of the appointment.
     * Will be inherited by the subclasses.
     * @return - a string representation of the appointment object.
     */
    public String toString(){
      
      //pulls the defined instance variables from the constructors parameters.
      return this.description + " on " + this.month + "/" + this.day + "/" + this.year + ". ";
    }

    /**
     * an accessor method which returns the year value of an appointment.
     * @return - the year value of the appointment.
     */
    public int getYear(){
      return this.year;
    }

    /**
     * an accessor method which returns the month value of an appointment.
     * @return - the month value of the appointment.
     */
    public int getMonth(){
      return this.month;
    }

    /**
     * an accessor method which returns the day value of an appointment.
     * @return - the day value of the appointment.
     */
    public int getDay(){
      return this.day;
    }

    /**
     * an accessor method which returns the description of an appointment.
     * @return - the description of an appointment.
     */
    public String getDescription(){
      return this.description;
    }
  }
