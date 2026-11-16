package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.ISAdQualityMediationNetwork;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ť, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0396 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static final String f827 = StringFog.decrypt("DrrEpDk5sgwkrei/GSKoEwqtz6MLIq4RKZrOvA84shs=\n", "R8irympWx34=\n");

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final C0604 f828;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public boolean f829;

    static {
        StringFog.decrypt("WZhqWGYviR9a02FfRC6TBFuQXFRx\n", "NP0OMQdb4HA=\n");
        StringFog.decrypt("bXOyapttMchuOLlttnwuwmxGumKDSz3R\n", "ABbWA/oZWKc=\n");
        StringFog.decrypt("LXpkvpVBaI4uMWO7kVRvojVsdLiZZ2SX\n", "QB8A1/Q1AeE=\n");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m460(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.ADMOB) {
            return StringFog.decrypt("MsDbDrw=\n", "U6S2Yd5+OSo=\n");
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.DT_FAIR_BID) {
            return StringFog.decrypt("GHYCoTb1/Q==\n", "fhdr01ScmWU=\n");
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.HELIUM) {
            return StringFog.decrypt("E9JXDBjE\n", "e7c7ZW2pg6w=\n");
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.LEVEL_PLAY) {
            return StringFog.decrypt("rVH7lmJF8De3Rw==\n", "3iSL8xA2n1k=\n");
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.MAX) {
            return StringFog.decrypt("BVSpomGeXMs=\n", "ZCTZzg7oNaU=\n");
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.UNITY) {
            return StringFog.decrypt("dbM/8z402lE=\n", "AN1Wh0dVviI=\n");
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.SELF_MEDIATED) {
            return StringFog.decrypt("ZCTYf8kLFKp2NdF9\n", "F0G0GaRucMM=\n");
        }
        return iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.OTHER ? StringFog.decrypt("kUAkhJo=\n", "/jRM4eidqCg=\n") : "";
    }

    public C0396(C0604 c0604) {
        this.f828 = c0604;
        C0411 c0411 = new C0411(this);
        AbstractC1227 abstractC1227M885 = AbstractC1227.m885();
        synchronized (abstractC1227M885) {
            abstractC1227M885.f3730.add(c0411);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m461(C0396 c0396, ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        c0396.getClass();
        C1132 c1132 = new C1132();
        c1132.f3309 = true;
        c1132.f3312 = iSAdQualityCustomMediationRevenue.getRevenue();
        c1132.f3314 = m460(iSAdQualityCustomMediationRevenue.getMediationNetwork());
        c1132.f3310 = iSAdQualityCustomMediationRevenue.getPlacement();
        c1132.f3308 = iSAdQualityCustomMediationRevenue.getCustomData();
        return c1132.m840();
    }
}
