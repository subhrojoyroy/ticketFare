package com.metrorail.fare.ticketFare.entities;

import com.metrorail.fare.ticketFare.exception.FareException;

import java.util.List;

public interface Card {
    public List<Journey> getTravelStatusOfToday() throws FareException;

    public List<Journey> getTravelStatusOfThisWeek() throws FareException;
}