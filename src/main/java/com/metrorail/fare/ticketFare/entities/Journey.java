package com.metrorail.fare.ticketFare.entities;

import java.util.Date;

public class Journey {
    Zone fromZone;
    Zone toZone;
    Date fromTime;
    Date toTime;
    DAY day;

    public Zone getFromZone() {
        return fromZone;
    }

    public Zone getToZone() {
        return toZone;
    }

    public Date getFromTime() {
        return fromTime;
    }

    public Date getToTime() {
        return toTime;
    }

    public DAY getDay() {
        return day;
    }

    public void setFromZone(Zone fromZone) {
        this.fromZone = fromZone;
    }

    public void setToZone(Zone toZone) {
        this.toZone = toZone;
    }

    public void setFromTime(Date fromTime) {
        this.fromTime = fromTime;
    }

    public void setToTime(Date toTime) {
        this.toTime = toTime;
    }

    public void setDay(DAY day) {
        this.day = day;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Fare{");
        sb.append("fromZone=").append(fromZone);
        sb.append(", toZone=").append(toZone);
        sb.append(", fromTime=").append(fromTime);
        sb.append(", toTime=").append(toTime);
        sb.append('}');
        return sb.toString();
    }
}