package Fasttrackit.won14.ReminderApp.controller;

import Fasttrackit.won14.ReminderApp.model.Birthday;
import Fasttrackit.won14.ReminderApp.model.Event;
import Fasttrackit.won14.ReminderApp.service.BirthdayService;
import Fasttrackit.won14.ReminderApp.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("birthdays")
public class BirthdayController {
    @Autowired
    private BirthdayService birthdayService;

    @GetMapping("/births")
    public List<Birthday> getAllBirthday() {
        return birthdayService.getAllBirthday();
    }
}
