package com.yungnickyoung.minecraft.betteroceanmonuments;

import com.yungnickyoung.minecraft.betteroceanmonuments.module.ConfigModuleForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BetterOceanMonumentsCommon.MOD_ID)
public class BetterOceanMonumentsForge {
    public BetterOceanMonumentsForge(FMLJavaModLoadingContext fmlJavaModLoadingContext) {
        BetterOceanMonumentsCommon.init();
        ConfigModuleForge.init(fmlJavaModLoadingContext);
    }
}