package com.battlestickk.potionofhaste.registries;

import com.battlestickk.potionofhaste.potion.ModPotions;
import net.fabricmc.fabric.api.registry.FabricPotionBrewingBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.crafting.Ingredient;

public class ModPotionRecipes
{
    public static void registerPotionRecipes()
    {
        // Potion of haste recipe
        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.registerPotionRecipe(Potions.AWKWARD, Ingredient.of(Items.COCOA_BEANS), ModPotions.POTION_OF_HASTE);});

        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.registerPotionRecipe(ModPotions.POTION_OF_HASTE, Ingredient.of(Items.REDSTONE), ModPotions.POTION_OF_HASTE_PLUS);});

        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.registerPotionRecipe(ModPotions.POTION_OF_HASTE, Ingredient.of(Items.GLOWSTONE_DUST), ModPotions.POTION_OF_HASTE_II);});

        // Potion of mfatigue recipe (corruption)
        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.registerPotionRecipe(ModPotions.POTION_OF_HASTE, Ingredient.of(Items.FERMENTED_SPIDER_EYE), ModPotions.POTION_OF_MINING_FATIGUE);});

        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.registerPotionRecipe(ModPotions.POTION_OF_HASTE_PLUS, Ingredient.of(Items.FERMENTED_SPIDER_EYE), ModPotions.POTION_OF_MINING_FATIGUE_PLUS);});

        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.registerPotionRecipe(ModPotions.POTION_OF_HASTE, Ingredient.of(Items.FERMENTED_SPIDER_EYE), ModPotions.POTION_OF_MINING_FATIGUE_II);});

        // Potion of mfatigue recipe (upgrading)
        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.registerPotionRecipe(ModPotions.POTION_OF_MINING_FATIGUE, Ingredient.of(Items.REDSTONE), ModPotions.POTION_OF_HASTE_PLUS);});

        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.registerPotionRecipe(ModPotions.POTION_OF_MINING_FATIGUE, Ingredient.of(Items.GLOWSTONE_DUST), ModPotions.POTION_OF_HASTE_II);});
    }
}
