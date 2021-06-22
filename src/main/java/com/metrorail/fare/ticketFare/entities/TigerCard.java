package com.metrorail.fare.ticketFare.entities;

import com.metrorail.fare.ticketFare.exception.FareException;

import java.util.List;

public class TigerCard implements Card {
    private List<Journey> journeyList;
    int cardId;

    public TigerCard(int cardId) {
        this.cardId = cardId;
    }

    @Override
    public List<Journey> getTravelStatusOfToday() throws FareException {
        // This weeks journey against this card will be fetched from DB
        return null;
    }

    @Override
    public List<Journey> getTravelStatusOfThisWeek() throws FareException {
        // This weeks journey against this card will be fetched from DB
        return null;
    }
}