package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String NAME = "Example Mod";
    public static final String VERSION = "1.0";

    private static Logger logger;

    //New Variables
    public static ToolMaterial myToolMaterial;
    public static ArmorMaterial myArmorMaterial;
    public static Item mySword;
    public static ItemArmor myHeadpiece;
    public static ItemArmor myChestplate;
    public static ItemArmor myLeggings;
    public static ItemArmor myBoots;
    //public static armor

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        myToolMaterial = EnumHelper.addToolMaterial(null, 0, 0, 0, 0, 0);
        myArmorMaterial = EnumHelper.addArmorMaterial(null, null, 0, null, 0, null, 0);
        mySword = new CustomSword();

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
