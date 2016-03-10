package com.github.files;

public class MusicFile extends File {
    private String author;
    private int duration;

    public String getAuthor() {
        return author;
    }

    public int getDuration() {
        return duration;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
