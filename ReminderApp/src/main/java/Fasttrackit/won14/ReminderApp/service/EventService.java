package Fasttrackit.won14.ReminderApp.service;

import Fasttrackit.won14.ReminderApp.model.Event;
import Fasttrackit.won14.ReminderApp.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }
}
