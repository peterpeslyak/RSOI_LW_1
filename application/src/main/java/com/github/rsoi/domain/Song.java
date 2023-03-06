package com.github.rsoi.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Song {
    private String name;
    private List<Date> playDates;

    public Song(String name, List<LocalDate> playDates) {
        this.name = name; // Название песни
        this.playDates = new ArrayList<Date>(); // Список дат прослушивания
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Date> getPlayDates() {
        return playDates;
    }
    public void setPlayDates(List<Date> playDates) {
        this.playDates = playDates;
    }
}

