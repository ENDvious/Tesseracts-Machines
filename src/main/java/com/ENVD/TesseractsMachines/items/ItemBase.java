package com.ENVD.TesseractsMachines.items;

import com.ENVD.TesseractsMachines.Main;
import com.ENVD.TesseractsMachines.init.ModItems;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item{

	public ItemBase (String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
	}


}
