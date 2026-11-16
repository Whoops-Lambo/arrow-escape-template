package com.iab.omid.library.vungle.adsession;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public enum AdSessionContextType {
    HTML(CreativeInfo.al),
    NATIVE("native"),
    JAVASCRIPT("javascript");

    private final String typeString;

    @Override // java.lang.Enum
    public String toString() {
        return this.typeString;
    }

    AdSessionContextType(String str) {
        this.typeString = str;
    }
}
