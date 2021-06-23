package com.metrorail.fare.ticketFare.services;

import com.metrorail.fare.ticketFare.entities.Journey;
import com.metrorail.fare.ticketFare.exception.FareException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class FareService {
    public abstract int getFare(int cardId, List<Journey> journeyList) throws FareException;
}