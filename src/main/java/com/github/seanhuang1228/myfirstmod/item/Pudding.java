package com.github.seanhuang1228.myfirstmod.item;

import net.minecraft.item.Rarity;
import net.minecraft.item.Item;

public class Pudding extends Item{
	public Pudding() {
		super((new Item.Properties())
			.maxStackSize(1)
			.rarity(Rarity.EPIC)
			.group(MfmItemGroups.ITEM_TAB)
		);
	}
}
