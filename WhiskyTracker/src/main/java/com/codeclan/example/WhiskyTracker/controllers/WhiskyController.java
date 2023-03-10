package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;


    @GetMapping(value = "/whiskies")
    public ResponseEntity<List<Whisky>> findWhiskyFilteredByYear(
            @RequestParam(name = "year", required = false) Integer year)
             {
        if (year != null) {
            return new ResponseEntity<>(whiskyRepository.findWhiskyByYear(year), HttpStatus.OK);}

        return new ResponseEntity<>(whiskyRepository.findAll(), HttpStatus.OK);
    }
    @GetMapping(value = "/whiskies/distilleries")
    public ResponseEntity<List<Whisky>> findWhiskyThatHaveDistilleryNameQueryString(
            @RequestParam(name ="name")String name){
                return new ResponseEntity<>(whiskyRepository.findWhiskyByDistilleryName(name), HttpStatus.OK);
    }
//      @GetMapping(value = "/ships/pirates")
//    public ResponseEntity<List<Ship>> findShipsThatHavePiratesNamedQueryString(
//            @RequestParam(name= "named") String firstName){
//        return new ResponseEntity<>(shipRepository.findShipByPiratesFirstName(firstName), HttpStatus.OK);
//    }


}

    //public String addFoo(@RequestParam(name = "id") String fooId, @RequestParam String name)



//    @GetMapping(value = "/whiskies")
//    public ResponseEntity<List<Whisky>> findWhiskyFilteredByYear(
//            @RequestParam(name = "year", required = false) Integer  year,
//            @RequestParam(name = "age", required = false) Integer  age){
//        if (year != null  && age != null) {
//            //not sure}
//        } else if(year != null){
//            return new ResponseEntity<>(whiskyRepository.findWhiskyByYear(year), HttpStatus.OK);
//        } else if (age != null) {
//            return new ResponseEntity<>(whiskyRepository.findWhiskyByAge(age),  HttpStatus.OK);
//        }
//        return new ResponseEntity<>(whiskyRepository.findAll(), HttpStatus.OK);
//
//    }






//@RequestParam(name= "location", required = false) String location) { //string location is a variable that store the request param
//        if (location != null) {
//            return new ResponseEntity<>(raidRepository.findRaidByLocation(location), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(raidRepository.findAll(), HttpStatus.OK);
//        }
//    }
