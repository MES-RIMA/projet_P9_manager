package com.openclassrooms.realestatemanager.models;


import android.location.Address;

import java.util.List;

public class Property {
    private long id;
    private Type type;
    private double price;
    private double surface;
    private int NbOfRooms;
    private String description;
    private List<Photos> photo;
    private Address address;
    private List<String> pointOfInterestNearby;
    private boolean isAvailable;
    private  long availableSince;
    private long saleDate;
    private RealEstateManger agent ;

    public Property(long id, Type type, double price, double surface, int nbOfRooms, String description, List<Photos> photo, Address address, List<String> pointOfInterestNearby, boolean isAvailable, long availableSince, long saleDate, RealEstateManger agent) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.surface = surface;
        NbOfRooms = nbOfRooms;
        this.description = description;
        this.photo = photo;
        this.address = address;
        this.pointOfInterestNearby = pointOfInterestNearby;
        this.isAvailable = isAvailable;
        this.availableSince = availableSince;
        this.saleDate = saleDate;
        this.agent=agent;
    }

    public long getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public double getSurface() {
        return surface;
    }

    public int getNbOfRooms() {
        return NbOfRooms;
    }

    public String getDescription() {
        return description;
    }

    public List<Photos> getPhoto() {
        return photo;
    }

    public Address getAddress() {
        return address;
    }

    public List<String> getPointOfInterestNearby() {
        return pointOfInterestNearby;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public long getAvailableSince() {
        return availableSince;
    }

    public long getSaleDate() {
        return saleDate;
    }

    public RealEstateManger getAgent() {
        return agent;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public void setNbOfRooms(int nbOfRooms) {
        NbOfRooms = nbOfRooms;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPhoto(List<Photos> photo) {
        this.photo = photo;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPointOfInterestNearby(List<String> pointOfInterestNearby) {
        this.pointOfInterestNearby = pointOfInterestNearby;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setAvailableSince(long availableSince) {
        this.availableSince = availableSince;
    }

    public void setSaleDate(long saleDate) {
        this.saleDate = saleDate;
    }

    public void setAgent(RealEstateManger agent) {
        this.agent = agent;
    }
    // -------------- INNER -------------- //

    enum Type {
        APARTMENT,
        LOFT,
        MANOR,
        HOUSE,
        Villa
    }
}
