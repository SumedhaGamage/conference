package com.conference.api.controller;

import java.util.List;
import java.util.Optional;

import com.conference.api.documents.Announcement;
import com.conference.api.documents.Category;
import com.conference.api.documents.Contributor;
import com.conference.api.documents.Question;
import com.conference.api.documents.Room;
import com.conference.api.documents.Session;
import com.conference.api.documents.Speaker;
import com.conference.api.documents.Sponser;
import com.conference.api.documents.Staff;
import com.conference.api.repository.AnnouncementRepo;
import com.conference.api.repository.CategoryRepo;
import com.conference.api.repository.ContributorRepo;
import com.conference.api.repository.QuestionsRepo;
import com.conference.api.repository.RoomRepo;
import com.conference.api.repository.SessionRepo;
import com.conference.api.repository.SpeakerRepo;
import com.conference.api.repository.SponserRepo;
import com.conference.api.repository.StaffRepo;
import com.conference.api.service.RepoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



/**
 * ApiController
 */

 @RestController()
public class ApiController {

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
    private RepoService services;
    @Autowired
    private StaffRepo staff;
    @Autowired
    private ContributorRepo contributor;
    @Autowired
    private SponserRepo sponser;
    @Autowired
    private AnnouncementRepo annoucement;

    /**
     * ping controller
     */
    @GetMapping(value="/ping")
    public ResponseEntity ping(){
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    /**
     * session controllers
     */
    @GetMapping(value="/sessions")
    public ResponseEntity getSessions() {
        return new ResponseEntity<>(session.findAll(),
         HttpStatus.OK);
    }

    @GetMapping(value="/sessions/proposals.json")
    public ResponseEntity getProposals() {
        return new ResponseEntity<>(session.findAll(),
         HttpStatus.OK);
    }

    @GetMapping(value="/sessions/{sessionId}")
    public ResponseEntity getSession(@PathVariable("sessionId") String id) {
        if (id == null){
            return new ResponseEntity<>("sessionId is null", HttpStatus.BAD_REQUEST);
        }
        Optional<Session> sessionById = session.findById(id);
        if(sessionById.isPresent()){
            return new ResponseEntity<>(sessionById.get(),
            HttpStatus.OK);
        }
        return new ResponseEntity<>(String.format("Session not found for sessionid: %s", id),HttpStatus.NOT_FOUND);
    }

    @PostMapping(value="/sessions")
    public ResponseEntity postSessions(@RequestBody List<Session> entities) {
        session.saveAll(entities);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    /**
     * timetable controllers
     */
    @GetMapping(value="/timetable")
    public ResponseEntity getTimeTable() {
        return new ResponseEntity<>(services.getTimeTable(),
         HttpStatus.OK);
    }

    /**
     * speaker controllers
     */
    @GetMapping(value="/speakers")
    public ResponseEntity getSpeakers() {
        return new ResponseEntity<>(speaker.findAll(), HttpStatus.OK);
    }
    @GetMapping(value="/speakers/{speakerId}")
    public ResponseEntity getSpeaker(@PathVariable("speakerId") String id) {
        if (id == null){
            return new ResponseEntity<>("speakerId is null", HttpStatus.BAD_REQUEST);
        }
        Optional<Speaker> sspeakerById = speaker.findById(id);
        if(sspeakerById.isPresent()){
            return new ResponseEntity<>(sspeakerById.get(),
            HttpStatus.OK);
        }
        return new ResponseEntity<>(String.format("Speaker not found for speakerid: %s", id),HttpStatus.NOT_FOUND);
    }
    @PostMapping(value="/speakers")
    public ResponseEntity postSpeakers(@RequestBody List<Speaker> entities) {
        speaker.saveAll(entities);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

     /**
     * category controllers
     */
    @GetMapping(value="/categories")
    public ResponseEntity getCatogories() {
        return new ResponseEntity<>(category.findAll(), HttpStatus.OK);
    }
    @GetMapping(value="/categories/{categoryId}")
    public ResponseEntity getCategory(@PathVariable("categoryId") String id) {
        if (id == null){
            return new ResponseEntity<>("categoryId is null", HttpStatus.BAD_REQUEST);
        }
        Optional<Category> categoryById = category.findById(id);
        if(categoryById.isPresent()){
            return new ResponseEntity<>(categoryById.get(),
            HttpStatus.OK);
        }
        return new ResponseEntity<>(String.format("Category not found for speakerid: %s", id),HttpStatus.NOT_FOUND);
    }
    @PostMapping(value="/categories")
    public ResponseEntity postCategory(@RequestBody List<Category> entities) {
        category.saveAll(entities);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    /**
     * questions controllers
     */
    @GetMapping(value="/questions")
    public ResponseEntity getQuestions() {
        return new ResponseEntity<>(question.findAll(), HttpStatus.OK);
    }
    @GetMapping(value="/questions/{questionId}")
    public ResponseEntity getQuestions(@PathVariable("questionId") String id) {
        if (id == null){
            return new ResponseEntity<>("questionId is null", HttpStatus.BAD_REQUEST);
        }
        Optional<Question> questionById = question.findById(id);
        if(questionById.isPresent()){
            return new ResponseEntity<>(questionById.get(),
            HttpStatus.OK);
        }
        return new ResponseEntity<>(String.format("Questions not found for questionId: %s", id),HttpStatus.NOT_FOUND);
    }
    @PostMapping(value="/questions")
    public ResponseEntity postQuestions(@RequestBody List<Question> entities) {
        question.saveAll(entities);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    /**
     * rooms controllers
     */
    @GetMapping(value="/rooms")
    public ResponseEntity getRooms() {
        return new ResponseEntity<>(room.findAll(), HttpStatus.OK);
    }
    @GetMapping(value="/rooms/{roomId}")
    public ResponseEntity getRoom(@PathVariable("roomId") String id) {
        if (id == null){
            return new ResponseEntity<>("roomId is null", HttpStatus.BAD_REQUEST);
        }
        Optional<Room> roomById = room.findById(id);
        if(roomById.isPresent()){
            return new ResponseEntity<>(roomById.get(),
            HttpStatus.OK);
        }
        return new ResponseEntity<>(String.format("Rooms not found for roomId: %s", id),HttpStatus.NOT_FOUND);
    }
    @PostMapping(value="/rooms")
    public ResponseEntity postRooms(@RequestBody List<Room> entities) {
        room.saveAll(entities);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

     /**
     * staff controllers
     */
    @GetMapping(value="/staffs")
    public ResponseEntity getStaffs() {
        return new ResponseEntity<>(staff.findAll(), HttpStatus.OK);
    }
    @PostMapping(value="/staffs")
    public ResponseEntity postStaff(@RequestBody List<Staff> entities) {
        staff.saveAll(entities);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    /**
     * contributor controllers
     */
    @GetMapping(value="/contributors")
    public ResponseEntity getContributors() {
        return new ResponseEntity<>(contributor.findAll(), HttpStatus.OK);
    }
    @PostMapping(value="/contributors")
    public ResponseEntity postContributors(@RequestBody List<Contributor> entities) {
        contributor.saveAll(entities);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    /**
     * announcement controllers
     */
    @GetMapping(value="/announcements")
    public ResponseEntity getAnnouncement() {
        return new ResponseEntity<>(annoucement.findAll(), HttpStatus.OK);
    }
    @GetMapping(value="/announcements/{announcementId}")
    public ResponseEntity getAnnouncements(@PathVariable("announcementId") String id) {
        if (id == null){
            return new ResponseEntity<>("announcementId is null", HttpStatus.BAD_REQUEST);
        }
        Optional<Announcement> annoucementById = annoucement.findById(id);
        if(annoucementById.isPresent()){
            return new ResponseEntity<>(annoucementById.get(),
            HttpStatus.OK);
        }
        return new ResponseEntity<>(String.format("Announcements not found for announcementId: %s", id),HttpStatus.NOT_FOUND);
    }
    @PostMapping(value="/announcements")
    public ResponseEntity postAnnouncements(@RequestBody List<Announcement> entities) {
        annoucement.saveAll(entities);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    /**
     * sponser controllers
     */
    @GetMapping(value="/sponsers")
    public ResponseEntity getSponsers() {
        return new ResponseEntity<>(services.getSponsers(), HttpStatus.OK);
    }
    @GetMapping(value="/sponsers/{sponsersId}")
    public ResponseEntity getSponser(@PathVariable("sponsersId") String id) {
        if (id == null){
            return new ResponseEntity<>("sponsersId is null", HttpStatus.BAD_REQUEST);
        }
        Optional<Sponser> sponsersIdById = sponser.findById(id);
        if(sponsersIdById.isPresent()){
            return new ResponseEntity<>(sponsersIdById.get(),
            HttpStatus.OK);
        }
        return new ResponseEntity<>(String.format("Sponser not found for sponsersId: %s", id),HttpStatus.NOT_FOUND);
    }

    @PostMapping(value="/sponsers")
    public ResponseEntity postSponsers(@RequestBody List<Sponser> entities) {
        sponser.saveAll(entities);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    
    
}