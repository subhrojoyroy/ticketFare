package com.metrorail.fare.ticketFare.resources;

import com.metrorail.fare.ticketFare.entities.Journey;
import com.metrorail.fare.ticketFare.services.FareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ComponentScan("com.metrorail.fare.ticketFare.services")
@RequestMapping("/metro-rail/")
public class FareResource {
    @Autowired
    FareService fareService;

    @RequestMapping(method = RequestMethod.POST,
            value = "getFare",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity getFare(@RequestBody List<Journey> journeys) {
        int fare = fareService.getFare(journeys);
        return new ResponseEntity(fare, HttpStatus.OK);
    }
}