package com.ENVD.TesseractsMachines.init;


import java.util.ArrayList;
import java.util.List;

import com.ENVD.TesseractsMachines.items.ItemBase;
import com.ENVD.TesseractsMachines.util.Reference;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MOD_ID)

public class ModItems
{
	static Item CompressedAirIngot;
	
	public static void init() {
		CompressedAirIngot = new ItemBase("compressed_air_ingot");
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(CompressedAirIngot);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		
		registerRender(CompressedAirIngot);
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item,0,new ModelResourceLocation(item.getRegistryName(),"inventory"));
	}

}
