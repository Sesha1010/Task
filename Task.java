	package com.example.demo;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private LocalDate dueDate;
    private LocalDate completedDate;
    private TaskStatus status;
    private TaskPriority priority;
    
    // Getters and setters
}