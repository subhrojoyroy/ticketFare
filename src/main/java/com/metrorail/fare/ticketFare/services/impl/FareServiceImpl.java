package com.metrorail.fare.ticketFare.services.impl;

import com.metrorail.fare.ticketFare.entities.Journey;
import com.metrorail.fare.ticketFare.entities.TigerCard;
import com.metrorail.fare.ticketFare.services.FareService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FareServiceImpl extends FareService {
    TigerCard card;

    @Override
    public int getFare(int cardId, List<Journey> journeyList) {
        card = new TigerCard(cardId);
        int fare = -1;

        // Logic of calculating fare

        return fare;
    }
}