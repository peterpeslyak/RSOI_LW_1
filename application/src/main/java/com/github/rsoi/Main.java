package com.github.rsoi;

import com.github.rsoi.domain.History;
import com.github.rsoi.domain.Playlist;
import com.github.rsoi.domain.Song;
import com.github.rsoi.service.PlaylistCreator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n-------------------");
        System.out.println("Welcome to Spotify!");
        System.out.println("-------------------\n");

        // Читаем историю прослушивания из файла
        String filePath = "history.txt";
        List<Song> songs = readSongsFromFile(filePath);

        // Cоздаем историю прослушивания
        History history = new History();
        for (Song song : songs) {
            history.addSong(song); // Инормация о каждой псене из коллекции Song добавляется в объект history
        }

        // Создаем плейлисты
        PlaylistCreator playlistService = new PlaylistCreator(history);
        Playlist mostListenedSongsPlaylistForMonth = playlistService.generateMostListenedSongsPlaylistForMonth();


        // Сортируем плейлисты по количеству прослушиваний


        // Выводим плейлисты

    }

    private static List<Song> readSongsFromFile(String filePath) {
        List<Song> songs = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String record;
            while ((record = reader.readLine()) != null) {
                String[] parts = record.split(";"); // Разделяем на части по ";"
                String name = parts[0].trim(); // Первая часть - название песни
                List<LocalDate> playDates = new ArrayList<>();
                for (int i = 1; i < parts.length; i++) { // Остальные части - даты прослушивания
                    String dateString = parts[i].trim();
                    LocalDate date = LocalDate.parse(dateString);
                    playDates.add(date);
                }
                Song song = new Song(name, playDates);
                songs.add(song);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return songs;
    }
}

