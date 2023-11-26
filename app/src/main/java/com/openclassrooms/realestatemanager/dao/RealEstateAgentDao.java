package com.openclassrooms.realestatemanager.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import com.openclassrooms.realestatemanager.entities.EntitiesRelations;
import com.openclassrooms.realestatemanager.entities.RealEstateAgentEntity;

import java.util.List;

@Dao
public interface RealEstateAgentDao {
    @Update
    void update(RealEstateAgentEntity agent);

    @Delete
    void delete(RealEstateAgentEntity agent);

    @Insert
    void create(RealEstateAgentEntity agent);
@Transaction
    @Query("SELECT * FROM RealEstatAgent")
    List<EntitiesRelations.RealEstateAgentWithProperties> getAllAgentWithProperties();
}