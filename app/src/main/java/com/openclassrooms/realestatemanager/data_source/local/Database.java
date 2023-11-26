package com.openclassrooms.realestatemanager.data_source.local;

import android.app.Application;
import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.openclassrooms.realestatemanager.dao.PhotoDao;
import com.openclassrooms.realestatemanager.dao.PointOfInterestDao;
import com.openclassrooms.realestatemanager.dao.PropertyDao;
import com.openclassrooms.realestatemanager.dao.PropertyPointOfInterestCrossRefDao;
import com.openclassrooms.realestatemanager.dao.RealEstateAgentDao;
import com.openclassrooms.realestatemanager.entities.EntitiesRelations;
import com.openclassrooms.realestatemanager.entities.PhotoEntity;
import com.openclassrooms.realestatemanager.entities.PointOfInterestEntity;
import com.openclassrooms.realestatemanager.entities.PropertyEntity;
import com.openclassrooms.realestatemanager.entities.RealEstateAgentEntity;
import com.openclassrooms.realestatemanager.models.RealEstateAgent;


@androidx.room.Database(
        entities = {PropertyEntity.class, PhotoEntity.class, RealEstateAgentEntity.class,PointOfInterestEntity.class, EntitiesRelations.PropertyPointOfInterestCrossRef.class},
        version = 1,
        exportSchema = false)
public abstract class Database extends RoomDatabase {

    private static Database instance;

    public abstract PropertyDao getPropertyDao();
    public abstract RealEstateAgentDao getRealEstateAgentDao();
    public abstract PhotoDao getPhotoDao();
    public abstract PointOfInterestDao getPointOfInterestDao();
    public abstract PropertyPointOfInterestCrossRefDao getPropertyPointOfInterestCrossRefDao();

    public static synchronized Database getInstance(Application application) {
        if (instance == null) {
            synchronized (Database.class) {
                instance =
                        Room.databaseBuilder(application, Database.class, "real_estate_manager.db").build();
            }
        }
        return instance;
    }
    public static Database getTestInstance(Context context) {
        return Room.inMemoryDatabaseBuilder(context, Database.class).build();
    }
}
