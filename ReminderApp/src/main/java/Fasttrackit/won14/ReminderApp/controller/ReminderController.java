package Fasttrackit.won14.ReminderApp.controller;

import Fasttrackit.won14.ReminderApp.model.Reminder;
import Fasttrackit.won14.ReminderApp.service.ReminderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("reminders")
@CrossOrigin(origins = "http://localhost:4200")
public class ReminderController {
    @Autowired
    private ReminderService service;

    @GetMapping
    public List<Reminder> getAllReminder() {
        return service.getAllReminder();
    }

    @GetMapping("/{id}")
    public Reminder getReminderById(@PathVariable Long id) {
        return service.getReminderById(id);
    }

    @PostMapping
    public Reminder createReminder(@RequestBody Reminder reminder) {
        return service.addNewReminder(reminder);
    }

    @PutMapping("/{id}")
    public Reminder updateReminder(@PathVariable Long id, @RequestBody Reminder reminder) {
        return service.replaceReminder(id, reminder);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
       service.deleteById(id);
    }
}
