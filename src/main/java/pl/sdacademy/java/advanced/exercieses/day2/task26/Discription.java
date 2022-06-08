package pl.sdacademy.java.advanced.exercieses.day2.task26;

import java.util.Date;

public class Discription {
    private final String story;
    private final double version;
    private final String author;
    private Date date;

    public Discription(String story, double version, String author, Date date) {
        this.story = story;
        this.version = version;
        this.author = author;
        this.date = date;
    }

    public Discription(String story, double version, String author) {
        this.story = story;
        this.version = version;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Discription{" +
                "story='" + story + '\'' +
                ", version=" + version +
                ", author='" + author + '\'' +
                '}';
    }
}
