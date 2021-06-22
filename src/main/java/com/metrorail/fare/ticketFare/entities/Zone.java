package com.metrorail.fare.ticketFare.entities;

public class Zone {
    int zoneId;
    String zoneName;

    public int getZoneId() {
        return zoneId;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneId(int zoneId) {
        this.zoneId = zoneId;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Zone{");
        sb.append("zoneId=").append(zoneId);
        sb.append(", zoneName='").append(zoneName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}