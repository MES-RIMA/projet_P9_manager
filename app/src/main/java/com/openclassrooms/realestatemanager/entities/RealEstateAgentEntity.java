package com.openclassrooms.realestatemanager.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.openclassrooms.realestatemanager.models.RealEstateAgent;

@Entity(tableName ="RealEstatAgent")
public class RealEstateAgentEntity extends RealEstateAgent {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public RealEstateAgentEntity(String name, String photoUrl) {
        super(name,photoUrl);
    }

}