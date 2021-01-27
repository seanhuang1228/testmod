package com.github.seanhuang1228.myfirstmod;

import com.github.seanhuang1228.myfirstmod.handlers.RegistryHandler;

import net.minecraftforge.fml.common.Mod;

@Mod(MyFirstMod.MODID)
public class MyFirstMod{
	public static final String MODID = "myfirstmod";
	public static final String NAME = "my first mod";
	
	public MyFirstMod() {
		RegistryHandler.registAll();
	}
}