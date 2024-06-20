package com.otkfake.alt.item;

import com.otkfake.alt.alt;
import com.otkfake.alt.block.Mblocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, alt.MODID);

    public static final RegistryObject<CreativeModeTab> ALT_TAB = CREATIVE_MODE_TABS.register("alt_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Mitems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.alt_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Mitems.SAPPHIRE.get());//该创造页接受一个物品

                        pOutput.accept(net.minecraft.world.item.Items.DIAMOND);
                        pOutput.accept(Mblocks.SAPPHIRE_BLOCK.get());
                    })
                    .build());//详细设置了创造标签页的图片和内容

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
