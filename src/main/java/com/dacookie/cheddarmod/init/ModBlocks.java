package com.dacookie.cheddarmod.init;

import com.dacookie.cheddarmod.block.BlockCM;
import com.dacookie.cheddarmod.block.BlockCheddarWheel;
import com.dacookie.cheddarmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockCM cheddarWheel = new BlockCheddarWheel();

    public static void init() {
        GameRegistry.registerBlock(cheddarWheel, "cheddarWheel");
    }
}
