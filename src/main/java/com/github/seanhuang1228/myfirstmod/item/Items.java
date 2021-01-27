package com.github.seanhuang1228.myfirstmod.item;

import com.github.seanhuang1228.myfirstmod.MyFirstMod;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
//import net.minecraftforge.registries.ObjectHolder;

public class Items {
	public static DeferredRegister<Item> getRegister(){
		return Items.ItemRegistry.REGISTER;
	}
	
	@SuppressWarnings("unused")
	public static class ItemRegistry{
        //public static final DeferredRegister<Item> REGISTER = new DeferredRegister<Item>(ForgeRegistries.ITEMS, MyFirstMod.MODID);
        public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, MyFirstMod.MODID);
        
        public static final RegistryObject<Item> OBJ_PUDDING = ItemRegistry.REGISTER.register("pudding", () -> new Pudding());
    }
}
