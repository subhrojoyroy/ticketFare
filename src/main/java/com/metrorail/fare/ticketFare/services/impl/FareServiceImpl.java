package com.metrorail.fare.ticketFare.services.impl;

import com.metrorail.fare.ticketFare.entities.Journey;
import com.metrorail.fare.ticketFare.entities.TigerCard;
import com.metrorail.fare.ticketFare.exception.FareException;
import com.metrorail.fare.ticketFare.services.FareService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FareServiceImpl extends FareService {
    TigerCard card;

    @Override
    public int getFare(int cardId, List<Journey> journeyList) throws FareException {
        card = new TigerCard(cardId);
        int fare = -1;

        List<Journey> todaysTravels = card.getTravelStatusOfToday();
        for(Journey journey : todaysTravels) {
            long duration = (journey.getToTime().getTime() - journey.getFromTime().getTime()) / 1000 * 60 * 60;

            fare += duration * 5;
        }

        return fare;
    }
}