package com.conference.api.service;

import com.conference.api.documents.Sponsers;
import com.conference.api.documents.Timetable;
import com.conference.api.repository.CategoryRepo;
import com.conference.api.repository.QuestionsRepo;
import com.conference.api.repository.RoomRepo;
import com.conference.api.repository.SessionRepo;
import com.conference.api.repository.SpeakerRepo;
import com.conference.api.repository.SponserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TimeTableService
 */
@Service
public class RepoService {

    @Autowired
    private SessionRepo session;
    @Autowired
    private CategoryRepo category;
    @Autowired
    private QuestionsRepo question;
    @Autowired
    private SpeakerRepo speaker;
    @Autowired
    private RoomRepo room;
    @Autowired
    private SponserRepo sponser;

    public Timetable getTimeTable(){

        return new Timetable(session.findAll(),
                             speaker.findAll(),
                             question.findAll(),
                             category.findAll(),
                             room.findAll());

    }

    public Sponsers getSponsers(){
        return new Sponsers(sponser.findByKind("platinum"),
                            sponser.findByKind("gold"),
                            sponser.findByKind("supporter"),
                            sponser.findByKind("tech"));
    }

}