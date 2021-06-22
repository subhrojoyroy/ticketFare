package com.metrorail.fare.ticketFare.services.impl;

import com.metrorail.fare.ticketFare.entities.Journey;
import com.metrorail.fare.ticketFare.services.FareService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FareServiceImpl extends FareService {
    @Override
    public int getFare(List<Journey> journeyList) {
        int fare = -1;

        for(Journey journey : journeyList) {
            fare += journey.getFromZone().getZoneId() - journey.getToZone().getZoneId();
        }

        return fare;
    }
}