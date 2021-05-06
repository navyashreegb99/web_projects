package com.example.repository;

import com.example.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("serviceRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {


    @Autowired
    private Calendar cal;

    @Value("#{ T(java.lang.math).random() * 100}")
    private double seedNum;

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker= new Speaker();

        speaker.setFirstName("Navyashree");
        speaker.setLastName("G B");
        speaker.setSeedNum(seedNum);

        System.out.println("cal:"+ cal.getTime());

        speakers.add(speaker);

        return  speakers;

    }




}
