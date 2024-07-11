package lexicon.se.model;

import java.time.LocalDate;

public class TodoItem {


    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;


    public TodoItem(int id, String title, String taskDescription, LocalDate deadLine, boolean done, Person creator) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }

        this.title = title;

        if (deadLine == null ) {
            throw new IllegalArgumentException("Deadline cannot be null");
        }

        this.deadLine = deadLine;
        this.id = id;
        this.taskDescription = taskDescription;
        this.done = done;
        this.creator = creator;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getTaskDescription() {
        return taskDescription;
    }


    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }


    public LocalDate getDeadLine() {
        return deadLine;
    }


    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }


    public boolean isDone() {
        return done;
    }


    public void setDone(boolean done) {
        this.done = done;
    }


    public Person getCreator() {
        return creator;
    }


    public void setCreator(Person creator) {
        this.creator = creator;
    }


    public boolean isOverdue() {
        return LocalDate.now().isAfter(deadLine) && !done;
    }


    public String getSummary() {
        return "Id: " + id + ", Title: " + title + ", Description: " + taskDescription + ", Deadline: " + deadLine +
                ", Done: " + done + ", Creator: " + creator.getSummary();
    }

}