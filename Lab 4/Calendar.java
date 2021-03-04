/**
 * @author Derek Campbell
 * @version 9/18/2020
 */

import java.util.ArrayList;

public class Calendar {
    //NOTE: Can have an ArrayList as the Appointment Object type! 
    //NOTE: If using string, will have to cast the apt as a String before adding it to the ArrayList.
    ArrayList<Appointment> schedule = new ArrayList<Appointment>();

    /**
     * No arguement constructor for the calendar object.
     */
    public Calendar(){

    }

    /**
     * A method to add an appointment to the calender.
     * @param apt - the appointment object to add to the calender.
     */
    public void add(Appointment apt) {
        
        //adds the appointment to the ArrayList. if using <String> needs to be schedule.add(apt.toString());
        schedule.add(apt);
    }
    
    /**
     * A method to remove an appointment from the calander
     * @param year - the year of the appointment to be removed.
     * @param month - the month of the appointment to be removed.
     * @param day - the day of the appontment to be removed.
     */
    public void remove(int year, int month, int day) {
        //iterates through the ArrayList using the occursOn() method?
        //needs to compare the values from the schedule ArrayList and not the Appointment object class. works.
        //TODO: doesn't remove all of the identical ones? Only the first 2?
        for (int i = 0; i < schedule.size(); i++) {
         if(schedule.get(i).occursOn(year, month, day) == true){
            schedule.remove(i);
         }
        }
    }

    /**
     * Method to return a String representation of the Calender object.
     * overrides the Object method toString().
     * @return a String representation of the Calender object.
     */
    public String toString() {
        String ret = "";
        //String sched = schedule.get(i);
        for(int i = 0; i < schedule.size(); i++) {
            System.out.print(schedule.get(i) + "\n");
        }
        return ret;
    }
    
}
