package com.dacookie.cheddarmod.init;

import com.dacookie.cheddarmod.item.ItemCM;
import com.dacookie.cheddarmod.item.ItemCheddar;
import com.dacookie.cheddarmod.item.ItemTomato;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemCM cheddar = new ItemCheddar();
    public static final ItemCM tomato = new ItemTomato();

    public static void init() {
        GameRegistry.registerItem(cheddar, "cheddar");
        GameRegistry.registerItem(tomato, "tomato");
    }
}
