package department.secretary;

import department.services.People;

public class Secretary extends People {

    private String timetableOne;


    public String getTimetableOne() {
        return timetableOne;
    }


    public void setTimetableOne(String timetable) {
        this.timetableOne = timetableOne;
    }
}
