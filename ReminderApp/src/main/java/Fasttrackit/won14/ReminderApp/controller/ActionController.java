package Fasttrackit.won14.ReminderApp.controller;

import Fasttrackit.won14.ReminderApp.model.Action;
import Fasttrackit.won14.ReminderApp.model.Event;
import Fasttrackit.won14.ReminderApp.service.ActionService;
import Fasttrackit.won14.ReminderApp.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ActionController {
    @Autowired
    private ActionService actionService;

    @GetMapping("/actions")
    public List<Action> getAllAction() {
        return actionService.getAllAction();
    }
}
