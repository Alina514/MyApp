package Fasttrackit.won14.ReminderApp.service;

import Fasttrackit.won14.ReminderApp.model.Birthday;
import Fasttrackit.won14.ReminderApp.model.Event;
import Fasttrackit.won14.ReminderApp.repository.BirthdayRepository;
import Fasttrackit.won14.ReminderApp.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BirthdayService {
    @Autowired
    private BirthdayRepository birthdayRepository;

    public List<Birthday> getAllBirthday() {
        return birthdayRepository.findAll();
    }
}
