package com.metrorail.fare.ticketFare.dao;

import com.metrorail.fare.ticketFare.entities.Journey;

public class JourneyDao {
    int cardId;
    Journey[] journeys;

    public int getCardId() {
        return cardId;
    }

    public Journey[] getJourneys() {
        return journeys;
    }
}