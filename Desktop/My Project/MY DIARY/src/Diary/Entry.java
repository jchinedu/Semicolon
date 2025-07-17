package Diary;

import java.time.LocalDateTime;

public class Entry {
    private int id;
    private static String title;
    private static String body;
    private LocalDateTime dateCreated;
    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.dateCreated = LocalDateTime.now();
    }
    public int getId() {
        return id;
    }

    public static String getTitle() {
        return title;
    }

    public static String getBody() {
        return body;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }
    @Override
    public String toString() {
        return "Title: " + this.title + ", Body: " + this.body;
    }


}
