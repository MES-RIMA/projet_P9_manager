package com.openclassrooms.realestatemanager.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;

import com.openclassrooms.realestatemanager.entities.EntitiesRelations;

@Dao
public interface PropertyPointOfInterestCrossRefDao {
    @Delete
    void delete(EntitiesRelations.PropertyPointOfInterestCrossRef associationClass);

    @Insert
    void create(EntitiesRelations.PropertyPointOfInterestCrossRef associationClass);
}
