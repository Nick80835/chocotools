package com.nick80835.chocotools.items.misc;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class RoastedCocoaBeansItem extends Item {
    public RoastedCocoaBeansItem() {
        super(
                new FabricItemSettings().group(ItemGroup.MISC)
        );
    }
}
