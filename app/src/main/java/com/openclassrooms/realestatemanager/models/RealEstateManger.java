package com.openclassrooms.realestatemanager.models;

public class RealEstateManger {
    private final long id;
    private final String name;
    private final Photos photo;

    public RealEstateManger(long id, String name, Photos photo) {
        this.id = id;
        this.name = name;
        this.photo = photo;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Photos getPhoto() {
        return photo;
    }
}
