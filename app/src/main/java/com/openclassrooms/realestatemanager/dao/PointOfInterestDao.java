package com.openclassrooms.realestatemanager.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

import com.openclassrooms.realestatemanager.entities.PointOfInterestEntity;
@Dao
public interface PointOfInterestDao {
    @Update
    void update(PointOfInterestEntity pointOfInterest);

    @Delete
    void delete(PointOfInterestEntity pointOfInterest);

    @Insert
    void create(PointOfInterestEntity pointOfInterest);

}
