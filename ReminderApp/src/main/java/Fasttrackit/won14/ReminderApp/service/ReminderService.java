package Fasttrackit.won14.ReminderApp.service;

import Fasttrackit.won14.ReminderApp.exception.ResourceNotFoundException;
import Fasttrackit.won14.ReminderApp.model.Reminder;
import Fasttrackit.won14.ReminderApp.repository.ReminderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReminderService {

  private final ReminderRepository repository;

    public ReminderService(ReminderRepository repository) {
        this.repository = repository;
    }

    public List<Reminder> getAllReminder() {
        return repository.findAll();
    }

    public Reminder getReminderById(Long id) {
       Reminder reminder = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Reminder with id:%s was not found".formatted(id)));
        return reminder;
    }

    public Reminder addNewReminder(Reminder newReminder) {
        return repository.save(newReminder);
    }

    public Reminder replaceReminder(Long id, Reminder replaceReminder) {
        Reminder foundReminder = getReminderById(id);
        Reminder updatedReminder = Reminder.builder()
                .id(foundReminder.getId())
                .type(replaceReminder.getType())
                .description(replaceReminder.getDescription())
                .date(replaceReminder.getDate())
                .build();
        return repository.save(updatedReminder);
    }

    public void deleteById(Long id) {
        Reminder foundReminder = getReminderById(id);
       repository.deleteById(id);
    }
}