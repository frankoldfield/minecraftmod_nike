package com.example.examplemod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class CustomSword extends ItemSword{

    public CustomSword() {
        super(ExampleMod.myToolMaterial);
        this.setRegistryName("guantes_negros");
        this.setUnlocalizedName("guantes_negros");
        this.setCreativeTab(CreativeTabs.COMBAT);

    }

}
