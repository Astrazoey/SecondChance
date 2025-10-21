package com.astrazoey.secondchance.mixins;

import com.astrazoey.secondchance.MobHealthInterface;
import com.astrazoey.secondchance.MobHealthType;
import net.minecraft.entity.EntityType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(EntityType.class)
public class EntityTypeMixin implements MobHealthInterface {

    @Unique
    public MobHealthType healthType;

    @Override
    public void secondChance$setMobHealthType(MobHealthType mobHealthType) {
        this.healthType = mobHealthType;
    }

    @Override
    public MobHealthType secondChance$getMobHealthType(EntityType entityType) {
        return healthType;
    }
}
