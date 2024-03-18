package Fasttrackit.won14.ReminderApp.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reminder {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String type;
    @Column
    private String description;
    @Column
    private String date;
}
