package com.swedishmonkey.test.init;

import com.swedishmonkey.test.item.ItemMapleLeaf;
import com.swedishmonkey.test.item.ItemTest;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemTest mapleLeaf = new ItemMapleLeaf();

    public static void init() {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
