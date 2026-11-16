package com.iab.omid.library.unity3d.adsession;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;

/* JADX INFO: loaded from: classes6.dex */
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
