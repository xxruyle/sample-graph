package com.example.samplegraph;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongController {
    @GetMapping("/api")
    public Song song(
        @RequestParam(value="song", defaultValue = "Kid Charlemagne") String songName,
        @RequestParam(value="artist", defaultValue = "Steely Dan") String artist
    ) 
    {
        Song getSong = new Song(songName, artist);
        return getSong; 
    }
    
}
