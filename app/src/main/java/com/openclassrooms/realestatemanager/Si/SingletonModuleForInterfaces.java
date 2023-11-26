package com.openclassrooms.realestatemanager.Si;

import com.openclassrooms.realestatemanager.data_providers.PropertyProvider;
import com.openclassrooms.realestatemanager.data_source.local.PropertyDataProvider;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public abstract class SingletonModuleForInterfaces {
    @Binds
    @Singleton
    public abstract PropertyProvider bindPropertyProvider(PropertyDataProvider propertyDataProvider);
}
