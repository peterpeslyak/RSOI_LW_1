package com.github.rsoi.domain;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<Song> songHistory;

    public History() {
        songHistory = new ArrayList<>();
    }

    public List<Song> getSongs() {
        return songHistory;
    }

    public void addSong(Song song) {
        songHistory.add(song);
    }
}
