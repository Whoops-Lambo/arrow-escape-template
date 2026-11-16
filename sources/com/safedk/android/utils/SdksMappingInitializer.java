package com.safedk.android.utils;

import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.google.android.gms.ads.MobileAds;
import com.ironsource.R6;
import com.mbridge.msdk.out.MBConfiguration;
import io.p071bidmachine.BidMachine;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class SdksMappingInitializer {
    private static final String TAG = "SdksMappingInitializer";

    public static void init(TreeMap<String, String> treeMap, TreeMap<String, String> treeMap2, TreeMap<String, String> treeMap3, TreeMap<String, String> treeMap4, TreeMap<String, String> treeMap5) {
        treeMap.put("io.bidmachine", BidMachine.NAME);
        treeMap4.put("com.explorestack", "io.bidmachine");
        treeMap2.put("io.bidmachine", "b15e56a960628ffab498ee9fff6d7c1d");
        treeMap4.put("io.bidmachine", "io.bidmachine");
        treeMap5.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", "b15e56a960628ffab498ee9fff6d7c1d");
        treeMap.put(h.d, "LiftoffMonetize");
        treeMap2.put(h.d, "217e8f437c9fc4244d6e74653ac8a8c7");
        treeMap4.put(h.d, h.d);
        treeMap5.put("com.applovin.mediation.adapters.VungleMediationAdapter", "217e8f437c9fc4244d6e74653ac8a8c7");
        treeMap.put("com.unity3d.ads", R6.H1);
        treeMap4.put("com.unity3d.services.banners", "com.unity3d.ads");
        treeMap4.put(h.l, "com.unity3d.ads");
        treeMap2.put("com.unity3d.ads", "daaea35726ab7cd457ab61d4538fb822");
        treeMap4.put("com.unity3d.ads", "com.unity3d.ads");
        treeMap5.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "daaea35726ab7cd457ab61d4538fb822");
        treeMap.put(h.f, "IronSource");
        treeMap4.put("com.ironsource", h.f);
        treeMap2.put(h.f, "b9b88d70c3d018bfbda46cd93ba3ddca");
        treeMap4.put(h.f, h.f);
        treeMap5.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", "b9b88d70c3d018bfbda46cd93ba3ddca");
        treeMap.put(h.D, "MolocoAds");
        treeMap2.put(h.D, "213ac5b6803852323d73a1292440d7be");
        treeMap4.put(h.D, h.D);
        treeMap5.put("com.applovin.mediation.adapters.MolocoMediationAdapter", "213ac5b6803852323d73a1292440d7be");
        treeMap.put(h.o, "Mintegral");
        treeMap4.put(MBConfiguration.LOG_TAG, h.o);
        treeMap2.put(h.o, "1be9e72506f3307ce6a9e78d26d65bd0");
        treeMap4.put(h.o, h.o);
        treeMap5.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "1be9e72506f3307ce6a9e78d26d65bd0");
        treeMap.put(h.p, "DTExchange");
        treeMap4.put("com.fyber.inneractive", h.p);
        treeMap2.put(h.p, "d41ed920405e4bd14f3a42cd93c43d89");
        treeMap4.put(h.p, h.p);
        treeMap5.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", "d41ed920405e4bd14f3a42cd93c43d89");
        treeMap.put(h.i, "InMobi");
        treeMap2.put(h.i, "7eac188d3286b05ccbba774f63a2c049");
        treeMap4.put(h.i, h.i);
        treeMap5.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "7eac188d3286b05ccbba774f63a2c049");
        treeMap.put(h.h, MolocoMediationAdapter.MEDIATION_PLATFORM_NAME);
        treeMap4.put("com.google.android.gms.internal", h.h);
        treeMap4.put(MobileAds.ERROR_DOMAIN, h.h);
        treeMap4.put("com.google.unity.ads", h.h);
        treeMap2.put(h.h, "29015bbfcc182d80e7f75bd2c38e4521");
        treeMap4.put(h.h, h.h);
        treeMap5.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "29015bbfcc182d80e7f75bd2c38e4521");
        treeMap.put(h.u, "Pangle");
        treeMap2.put(h.u, "dd2971b0681141d57b221687791ad1bd");
        treeMap4.put(h.u, h.u);
        treeMap5.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "dd2971b0681141d57b221687791ad1bd");
        treeMap.put(h.a, "AppLovin");
        treeMap2.put(h.a, "74616804a7dc29147dfb0afe122a9fd2");
        treeMap4.put(h.a, h.a);
        treeMap5.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", "74616804a7dc29147dfb0afe122a9fd2");
    }
}
