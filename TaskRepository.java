package com.example.demo;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(TaskStatus status);
    List<Task> findByDueDateBeforeAndStatus(LocalDate currentDate, TaskStatus status);
    List<Task> findByCompletedDateBetween(LocalDate startDate, LocalDate endDate);
}
