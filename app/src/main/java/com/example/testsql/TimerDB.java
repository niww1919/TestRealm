package com.example.testsql;

import java.util.Date;

import io.realm.RealmObject;

public class TimerDB extends RealmObject {

    private long timeOfTraining;

    private Date date;

    public TimerDB() {
    }

    public TimerDB(long timeOfTraining, Date date) {
        this.timeOfTraining = timeOfTraining;
        this.date = date;
    }

    public long getTimeOfTraining() {
        return timeOfTraining;
    }

    public void setTimeOfTraining(long timeOfTraining) {
        this.timeOfTraining = timeOfTraining;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
