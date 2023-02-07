package com.mahmutcelik.demo.todo;

import org.springframework.stereotype.Component;

import java.time.LocalDate;


//FIRSTLY WE WILL MAKE IT IN STATIC LIST AFTER THAT IN H2 DB and FINALLY IN REAL DATABASE LIKE MYSQL

public class Todo {
    private int it;
    private String username;
    private String description;
    private LocalDate targetDate; //LocalDate kullanılaması önerilir (Date yerine)
    private Boolean done;

    public Todo(int it, String username, String description, LocalDate targetDate, Boolean done) {
        this.it = it;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }
    @Override
    public String toString() {
        return "Todo{" +
                "it=" + it +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", targetDate=" + targetDate +
                ", done=" + done +
                '}';
    }

    public int getIt() {
        return it;
    }

    public void setIt(int it) {
        this.it = it;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
