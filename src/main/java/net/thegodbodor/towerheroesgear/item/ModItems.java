package net.thegodbodor.towerheroesgear.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.thegodbodor.towerheroesgear.TowerHeroesGear;


public class ModItems {
    //add new items below here
    public static final Item MANA = registerItem("mana",
            new Item(new FabricItemSettings()));

    public static final Item CORNDOG = registerItem("corndog",
            new SwordItem(ModToolMaterial.MANA, 1, -3f, new FabricItemSettings()));

    //add new items below here to add to existing groups
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
       entries.add(MANA);
    }

    //end adding new items here

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TowerHeroesGear.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TowerHeroesGear.LOGGER.info("Registering Mod Items for " + TowerHeroesGear.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
