package me.creepinson.main;

import me.creepinson.entities.TESRPedastal_Magic;
import me.creepinson.entities.TileEntityPedastal_Magic;
import me.creepinson.events.EventHandlerMOD;
import me.creepinson.handlers.BlockHandler;
import me.creepinson.handlers.GuiHandler;
import me.creepinson.handlers.ItemHandler;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenderers(Main ins) {
		ins.mcreator_0.registerRenderers();
		ins.mcreator_1.registerRenderers();
		ins.mcreator_2.registerRenderers();
		ins.mcreator_3.registerRenderers();
 
		
	}
	@Override
	public void preInit() {
		  super.preInit();
		ItemHandler.registerRenders();
		BlockHandler.registerRenders();
		
	}

	public void init() {
		  super.init();
		  ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPedastal_Magic.class, new TESRPedastal_Magic());
			
NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
	}

	
}
