package com.ilinq.spongebob.items;

import com.ilinq.spongebob.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {

	public static Item myItem;
	public static void createItems(){
		myItem = new Item();
		myItem.setRegistryName(Main.MODID, "first_item");
		myItem.setUnlocalizedName("first_item");
		myItem.setCreativeTab(CreativeTabs.FOOD);
		GameRegistry.register(myItem);
	}
}
