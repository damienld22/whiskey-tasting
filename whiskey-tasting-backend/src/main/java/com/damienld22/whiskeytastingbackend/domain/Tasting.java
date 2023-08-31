package com.damienld22.whiskeytastingbackend.domain;

import java.util.UUID;

public class Tasting {
    private final UUID id;
    private final String name;
    private final String Score;

    public Tasting(UUID id, String name, String score) {
        this.id = id;
        this.name = name;
        Score = score;
    }

    public UUID getId() {
        return id;
    }

    public String getScore() {
        return Score;
    }

    public String getName() {
        return name;
    }
}
