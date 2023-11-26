package com.openclassrooms.realestatemanager.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import com.openclassrooms.realestatemanager.entities.RealEstateAgentEntity;
import com.openclassrooms.realestatemanager.entities.Relationships;

import java.util.List;

@Dao
public interface RealEstateAgentDao {
    @Query("SELECT * FROM RealEstatAgent WHERE agent_id=:id")

    RealEstateAgentEntity getById(int id);

    @Update
    void update(RealEstateAgentEntity agent);

    @Delete
    void delete(RealEstateAgentEntity agent);

    @Insert
    void create(RealEstateAgentEntity agent);
@Transaction
@Query("SELECT * FROM RealEstatAgent")
List<Relationships.RealEstateAgentWithProperties> getAllAgentWithProperties();
}