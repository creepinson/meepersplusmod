package me.creepinson.item;


import me.creepinson.handlers.EnumHandler;
import me.creepinson.handlers.EnumHandler.Essences;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
public class Essence extends ModItems{

	public Essence(String name, CreativeTabs tab) {
		super(name, tab);
		this.setHasSubtypes(true);
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tab, NonNullList<ItemStack> items) {
for(int i = 0; i < Essences.values().length; i++)
	items.add(new ItemStack(item, 1, i));

	
	
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for(int i = 0; i < Essences.values().length; i++)
		{
		if(stack.getItemDamage() == i)	{
		return EnumHandler.Essences.values()[i].getName() + "essence";
		}
		
		else{
			continue;
		}
		
	
		}
		return EnumHandler.Essences.fire.getName() + "essence";
	
	}
}