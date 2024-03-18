package Fasttrackit.won14.ReminderApp;

import Fasttrackit.won14.ReminderApp.model.Reminder;
import Fasttrackit.won14.ReminderApp.repository.ReminderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Component
@RequestMapping("/reminders")
@Slf4j
@RequiredArgsConstructor
public class CommandRunner implements CommandLineRunner {
    private final ReminderRepository repository;

    @Override
    public void run(String... args) {
        log.info("Runner is populating with data");
        repository.saveAll(List.of(
                Reminder.builder()
                        .id(1953926363L)
                        .type("actions")
                        .description("Meeting")
                        .date("24.09.2024")
                        .build(),
                Reminder.builder()
                        .id(86464563L)
                        .type("birthdays")
                        .description("Mum's birthday")
                        .date("04.03.2025")
                        .build(),
                Reminder.builder()
                        .id(8645976766L)
                        .type("events")
                        .description("Job's interview")
                        .date("03.10.2024")
                        .build()
        ));
    }
}