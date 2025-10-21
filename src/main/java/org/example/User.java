package org.example;

public class User {
    private int userId;
    private int id;
    private String title;
    private String body;

    // Default constructor
    public User() {}

    // Parameterized constructor
    public User(int userId, int id, String name, String email) {
        this.id = id;
        this.title = name;
        this.body = email;
    }

    // Getters and setters

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {this.userId = userId;}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return title; }
    public void setName(String name) { this.title = name; }

    public String getEmail() { return body; }
    public void setEmail(String email) { this.body = email; }


    @Override
    public String toString() {
        return "User{" +
                "userId=" + id + '\n' +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}


