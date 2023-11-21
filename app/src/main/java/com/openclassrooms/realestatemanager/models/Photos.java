package com.openclassrooms.realestatemanager.models;

public class Photos {
    private final long id;
    private final String url;
    private final String description;

    public Photos(long id, String url, String description) {
        this.id = id;
        this.url = url;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

}
