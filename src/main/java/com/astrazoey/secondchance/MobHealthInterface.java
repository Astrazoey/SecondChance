package com.astrazoey.secondchance;

import net.minecraft.entity.EntityType;

@SuppressWarnings("all")
public interface MobHealthInterface {
    static void setHealthType(EntityType entityType, MobHealthType mobHealthType) {
        if (entityType != null) {
            ((MobHealthInterface) entityType).secondChance$setMobHealthType(mobHealthType);
        }
    }

    static MobHealthType getHealthType(EntityType entityType) {
        MobHealthType healthType = ((MobHealthInterface) entityType).secondChance$getMobHealthType(entityType);

        if(healthType != null) {
            //System.out.println("Health type is not null for " + entityType);
            return healthType;
        } else {
            //System.out.println("Health type is null for " + entityType);
            return new MobHealthType(new MobHealthType.Settings().healthThreshold(50000f));
        }
    }

    void secondChance$setMobHealthType(MobHealthType mobHealthType);
    MobHealthType secondChance$getMobHealthType(EntityType entityType);
}
