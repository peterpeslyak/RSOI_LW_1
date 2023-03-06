package com.github.rsoi.service;

import com.github.rsoi.domain.History;
import com.github.rsoi.domain.Playlist;
import com.github.rsoi.domain.Song;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class PlaylistCreator {
    private final History history;

    public PlaylistCreator(History history) {
        this.history = history;
    }

    public List<Playlist> generatePlaylists() {
        List<Playlist> playlists = new ArrayList<>();

        Playlist playlist1 = generateMostListenedSongsPlaylistForMonth();
        playlists.add(playlist1);

        return playlists;
    }

    public Playlist generateMostListenedSongsPlaylistForMonth() {
        return null;
    }
}