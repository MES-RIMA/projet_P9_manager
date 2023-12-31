package com.openclassrooms.realestatemanager.repositories;

import com.openclassrooms.realestatemanager.data_providers.PropertyProvider;
import com.openclassrooms.realestatemanager.models.Property;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class PropertyRepository {
    private final PropertyProvider propertyProvider;
    private final Executor doInBackground = Executors.newFixedThreadPool(2);

    public PropertyRepository(PropertyProvider propertyProvider) {
        this.propertyProvider = propertyProvider;
    }
    public void create(Property property) {
        doInBackground.execute(() -> propertyProvider.create(property));
    }

    public Property getById(int id){
        return propertyProvider.getById(id);
    }

    public List<Property> getAll(){
        return propertyProvider.getAll();
    }

    public void update(Property property) {
        doInBackground.execute(() -> propertyProvider.update(property));
    }

    public void delete(Property property) {
        doInBackground.execute(() -> propertyProvider.delete(property));
    }


}

