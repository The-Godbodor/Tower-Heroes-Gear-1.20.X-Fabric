package net.thegodbodor.towerheroesgear.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.thegodbodor.towerheroesgear.TowerHeroesGear;

public class ModItemGroups {
    public static final ItemGroup TOWER_HERO_GEAR = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TowerHeroesGear.MOD_ID, "corndog"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.towerheroesgear"))
                    .icon(() -> new ItemStack(ModItems.MANA)).entries((displayContext, entries) -> {
                        entries.add(ModItems.MANA);
                        entries.add(ModItems.CORNDOG);

                    }).build());


    public static void registerItemGroups() {
        TowerHeroesGear.LOGGER.info("Registering Item Groups for " + TowerHeroesGear.MOD_ID);
    }
}
