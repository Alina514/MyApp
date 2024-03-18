package Fasttrackit.won14.ReminderApp.repository;

import Fasttrackit.won14.ReminderApp.model.Reminder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReminderRepository extends JpaRepository<Reminder, Long> {
}
