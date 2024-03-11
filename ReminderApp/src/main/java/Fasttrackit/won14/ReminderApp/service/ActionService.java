package Fasttrackit.won14.ReminderApp.service;

import Fasttrackit.won14.ReminderApp.model.Action;
import Fasttrackit.won14.ReminderApp.model.Event;
import Fasttrackit.won14.ReminderApp.repository.ActionRepository;
import Fasttrackit.won14.ReminderApp.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ActionService {
    @Autowired
    private ActionRepository actionRepository;

    public List<Action> getAllAction() {
        return actionRepository.findAll();
    }
}
