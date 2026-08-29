package com.battlestickk.potionofhaste.potion;

import com.battlestickk.potionofhaste.BtlPotionOfHaste;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;

public class ModPotions {

    public static final Holder<Potion> POTION_OF_HASTE = registerPotion
            (
                    "potion_of_haste", new Potion("potion_of_haste", new MobEffectInstance(MobEffects.HASTE, 3600, 0))
            );

    public static final Holder<Potion> POTION_OF_HASTE_PLUS = registerPotion
            (
                    "potion_of_haste_plus", new Potion("potion_of_haste_plus", new MobEffectInstance(MobEffects.HASTE, 9600, 0))
            );

    public static final Holder<Potion> POTION_OF_HASTE_II = registerPotion
            (
                    "potion_of_haste_ii", new Potion("potion_of_haste_ii", new MobEffectInstance(MobEffects.HASTE, 1800, 1))
            );

    public static final Holder<Potion> POTION_OF_MINING_FATIGUE = registerPotion
            (
                    "potion_of_mining_fatigue", new Potion("potion_of_mining_fatigue", new MobEffectInstance(MobEffects.MINING_FATIGUE, 1800, 0))
            );

    public static final Holder<Potion> POTION_OF_MINING_FATIGUE_PLUS = registerPotion
            (
                    "potion_of_mining_fatigue_plus", new Potion("potion_of_mining_fatigue_plus", new MobEffectInstance(MobEffects.MINING_FATIGUE, 4800, 0))
            );

    public static final Holder<Potion> POTION_OF_MINING_FATIGUE_II = registerPotion
            (
                    "potion_of_mining_fatigue_ii", new Potion("potion_of_mining_fatigue_ii", new MobEffectInstance(MobEffects.MINING_FATIGUE, 900, 1))
            );

    private static Holder<Potion> registerPotion(String name, Potion potion)
    {
        return Registry.registerForHolder(BuiltInRegistries.POTION, Identifier.fromNamespaceAndPath(BtlPotionOfHaste.MOD_ID, name), potion);
    }

    public static void registerPotions()
    {
        BtlPotionOfHaste.LOGGER.info("BTL Potion of Haste: registering potions");
    }
}
