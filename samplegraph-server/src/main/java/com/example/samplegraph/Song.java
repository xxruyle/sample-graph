package com.example.samplegraph;

import java.time.LocalDate;

public class Song {
    public String name;
    public String artist;
    public LocalDate date;

    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.date = LocalDate.now(); // TODO: Find date the song was made
    }
}
