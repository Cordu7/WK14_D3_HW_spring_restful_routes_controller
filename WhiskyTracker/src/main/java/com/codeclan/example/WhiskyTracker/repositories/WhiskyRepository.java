package com.codeclan.example.WhiskyTracker.repositories;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WhiskyRepository extends JpaRepository<Whisky, Long> {

    List<Whisky> findWhiskyByYear(Integer year);
    //List<Whisky>findWhiskyByAge(Integer age);
    List<Whisky> findWhiskyByDistilleryName(String name);



//    List<Raid> findRaidByLocation(String location);
//    //List<Raid> findRaidsByPiratesShipName(String ship);
//    List<Raid>findByPiratesShip(Ship ship);
//    name age
//    http://localhost:8080/whiskies?year=2018

//    Get all the whiskies for a particular year
//  * Get all the distilleries for a particular region
//  * Get all the whisky from a particular distillery that's a specific age= and distillery name =
}
