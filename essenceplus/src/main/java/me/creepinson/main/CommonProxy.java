package me.creepinson.main;

import me.creepinson.entities.TileEntityMobChamber;
import me.creepinson.entities.TileEntityPedastal_Magic;
import me.creepinson.handlers.BlockHandler;
import me.creepinson.handlers.CraftingHandler;
import me.creepinson.handlers.ItemHandler;
import me.creepinson.lib.IProxy;
import me.creepinson.lib.RefStrings;
import me.creepinson.packet.CustomPacket;
import me.creepinson.packet.CustomPacket2;

import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

public class CommonProxy implements IProxy{
	public void registerRenderers(Main ins) {
	}
	@Override
	public void preInit() {
		BlockHandler.init();
		  BlockHandler.register();

		 ItemHandler.init();
		  ItemHandler.register();
		  
	}
	public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel("meepersplus");
	
	@Override
	public void init() {
	
		GameRegistry.registerTileEntity(TileEntityMobChamber.class, RefStrings.MODID + ":"+ "mobchamber");
		GameRegistry.registerTileEntity(TileEntityPedastal_Magic.class, RefStrings.MODID + ":"+ "tileEntityPedastalMagic");

			
	}

	@Override
	public void postInit() {
		
	CraftingHandler.init();
		
	}
	
	public static void registerModelBakeryVarients(){

		ModelBakery.registerItemVariants(ItemHandler.Syringe, new ResourceLocation(RefStrings.MODID, "Syringe_Empty"), new ResourceLocation(RefStrings.MODID, "Syringe_Full_Zombie"), new ResourceLocation(RefStrings.MODID, "Syringe_Full_Player"));
		ModelBakery.registerItemVariants(ItemHandler.Core, new ResourceLocation(RefStrings.MODID, "FireCore"), new ResourceLocation(RefStrings.MODID, "FriendlyCore"), new ResourceLocation(RefStrings.MODID, "LifeCore"));
		ModelBakery.registerItemVariants(ItemHandler.Essence, new ResourceLocation(RefStrings.MODID, "FireEssence"), new ResourceLocation(RefStrings.MODID, "BloodEssence"), new ResourceLocation(RefStrings.MODID, "LifeEssence"));

}
}