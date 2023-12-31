package com.openclassrooms.realestatemanager.models;

import java.util.List;

public class Property {

    private int id;
    private Type type;
    private double price;
    private double surface;
    private int NbOfRooms;
    private String description;
    private List<Photo>photoList;
    private Address address;
    private List<PointOrInterest> pointOfInterestNearby;
    private boolean isAvailable;
    private long availableSince;
    private long saleDate;
    private RealEstateAgent agent;

    public Property(
            Type type,
            double price,
            double surface,
            int NbOfRooms,
            String description,
            List<Photo> photoList,
            Address address,
            List<PointOrInterest> pointOfInterestNearby,
            boolean isAvailable,
            long availableSince,
            long saleDate,
            RealEstateAgent agent) {
        this.type = type;
        this.price = price;
        this.surface = surface;
        this.NbOfRooms = NbOfRooms;
        this.description = description;
        this.photoList = photoList;
        this.address = address;
        this.pointOfInterestNearby = pointOfInterestNearby;
        this.isAvailable = isAvailable;
        this.availableSince = availableSince;
        this.saleDate = saleDate;
        this.agent = agent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public int getNbOfRooms() {
        return NbOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.NbOfRooms = numberOfRooms;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Photo> getPhotoList() {
        return photoList;
    }

    @SuppressWarnings("unchecked")
    public void setPhotoList(List<? extends Photo> photoList) {
        this.photoList = (List<Photo>) photoList;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<PointOrInterest> getPointOfInterestNearby() {

        return pointOfInterestNearby;
    }
    @SuppressWarnings("unchecked")
    public void setPointOfInterestNearby(List<? extends PointOrInterest> pointOfInterestNearby) {
        this.pointOfInterestNearby = (List<PointOrInterest>) pointOfInterestNearby;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public long getAvailableSince() {
        return availableSince;
    }

    public void setAvailableSince(long availableSince) {
        this.availableSince = availableSince;
    }

    public long getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(long saleDate) {
        this.saleDate = saleDate;
    }

    public RealEstateAgent getAgent() {
        return agent;
    }

    public void setAgent(RealEstateAgent agent) {
        this.agent = agent;
    }

    // ----------------------   INNERS  ----------------------- //
    public static class PointOrInterest {
        private final String name;
        private int id;
        public PointOrInterest(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
        public int getId() {return id;}
    }

    public static class Address {
        private final String locality;
        private final String postalCode;
        private final String formattedAddress;

        public Address(String locality, String postalCode, String formattedAddress) {
            this.locality = locality;
            this.postalCode = postalCode;
            this.formattedAddress = formattedAddress;
        }

        public String getLocality() {
            return locality;
        }

        public String getPostalCode() {
            return postalCode;
        }

        public String getFormattedAddress() {
            return formattedAddress;
        }
    }

    public enum Type {
                APARTMENT,
                LOFT,
                MANOR,
                HOUSE
            }
}
