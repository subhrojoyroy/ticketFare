package com.metrorail.fare.ticketFare.entities;

import com.metrorail.fare.ticketFare.exception.FareException;

import java.util.List;

public class TigerCard implements Card {
    private List<Journey> journeyList;

    public TigerCard(List<Journey> journeyList) {
        this.journeyList = journeyList;
    }

    @Override
    public List<Journey> getTravelStatusOfToday() throws FareException {
        return null;
    }

    @Override
    public List<Journey> getTravelStatusOfThisWeek() throws FareException {
        return null;
    }
}