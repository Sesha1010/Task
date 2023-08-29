package com.example.demo;

public interface UserTaskRepository extends JpaRepository<UserTask, Long> {
    List<UserTask> findByUser(User user);
    List<UserTask> findByTask(Task task);
}
