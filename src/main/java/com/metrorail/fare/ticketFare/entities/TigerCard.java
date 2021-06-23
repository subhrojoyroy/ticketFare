package com.metrorail.fare.ticketFare.entities;

import com.google.gson.Gson;
import com.metrorail.fare.ticketFare.dao.JourneyDao;
import com.metrorail.fare.ticketFare.exception.FareException;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TigerCard implements Card {
    @Autowired
    Gson gson;
    private Journey[] journeys;
    int cardId;

    public TigerCard(int cardId) throws FareException {
        this.cardId = cardId;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\IntelliJ-IDEA_Workspace\\ticketFare\\ticketFare\\src\\main\\resources\\journeys.json"));
            JourneyDao[] journeys = gson.fromJson(bufferedReader, JourneyDao[].class);

            for(JourneyDao dao : journeys) {
                if(dao.getCardId() == cardId) {
                    this.journeys = dao.getJourneys();
                }
            }
        } catch (IOException e) {
            throw new FareException(e);
        }
    }

    @Override
    public List<Journey> getTravelStatusOfToday() throws FareException {
        List<Journey> todaysTravels = new ArrayList<>();

        for(Journey journey : this.journeys) {
            if(journey.getDay().name().equalsIgnoreCase(LocalDate.now().getDayOfWeek().name())) {
                todaysTravels.add(journey);
            }
        }
        return todaysTravels;
    }

    @Override
    public List<Journey> getTravelStatusOfThisWeek() throws FareException {
        // This weeks journey against this card will be fetched from DB
        return null;
    }
}