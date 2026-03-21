package com.equation.moregems.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

import java.util.List;

import static net.minecraft.component.type.ConsumableComponents.food;

public class MoreGemsConsumableComponents {
    //食物组件
    public static final ConsumableComponent RUBY_COOKIE = food()
            .consumeEffect(
                    new ApplyEffectsConsumeEffect(
                            List.of(
                                    new StatusEffectInstance(StatusEffects.STRENGTH, 100, 0)
                            )
                    )
            )
            .build();
}
