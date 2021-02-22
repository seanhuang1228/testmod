package com.github.seanhuang1228.myfirstmod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MfmItemGroups extends ItemGroup{
	public static final MfmItemGroups ITEM_TAB = new MfmItemGroups("myfirstmod.items");
	
	public MfmItemGroups(String label) {
		super(label);
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}
	
	@Override
	public ItemStack createIcon() {
		return new ItemStack(Items.PUDDING);
	}
}
