package com.github.seanhuang1228.myfirstmod.item;

import net.minecraft.item.Rarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Food;

public class Pudding extends Item{
	public Pudding() {
		super((new Item.Properties())
			.maxStackSize(1)
			.rarity(Rarity.EPIC)
			.group(MfmItemGroups.ITEM_TAB)
			.food((new Food.Builder())
					.hunger(4)
					.saturation(1.5f)
					.setAlwaysEdible()
					.fastToEat()
					.build()
			)
		);
	}
	
	@Override
	public int getUseDuration(ItemStack stack) {
		return 2;
	}
}
