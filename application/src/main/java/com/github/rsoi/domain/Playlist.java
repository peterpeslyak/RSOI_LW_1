package com.github.rsoi.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Playlist {
    private List<Song> songs; // Список песен

    public Playlist() {
        this.songs = new ArrayList<>();
    }
    public List<Song> getSongs() {
        return songs;
    }
    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
    public void addSong(Song song) { // Добавление песни в плейлист
        songs.add(song);
    }

    public void removeSong(Song song) { // Удаление псени из плейлиста
        songs.remove(song);
    }

}

