package com.fyber.inneractive.sdk.config.enums;

import com.ironsource.C4664b4;
import com.unity3d.ads.BuildConfig;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public enum UnitDisplayType {
    INTERSTITIAL("interstitial", false),
    LANDSCAPE(C4664b4.i.C, true),
    MRECT("mrect", false),
    BANNER("banner", false),
    REWARDED("rewarded", false),
    NATIVE("typenative", false),
    SQUARE("square", true),
    VERTICAL("vertical", true),
    DEFAULT(BuildConfig.FLAVOR, false);

    private static final Map<String, UnitDisplayType> CONSTANTS = new HashMap();
    private final boolean deprecated;
    private String stringValue;

    static {
        for (UnitDisplayType unitDisplayType : values()) {
            CONSTANTS.put(unitDisplayType.stringValue, unitDisplayType);
        }
    }

    public static UnitDisplayType fromValue(String str) {
        UnitDisplayType unitDisplayType = str != null ? CONSTANTS.get(str.toLowerCase(Locale.US)) : null;
        return unitDisplayType != null ? unitDisplayType : DEFAULT;
    }

    public boolean isDeprecated() {
        return this.deprecated;
    }

    public boolean isFullscreenUnit() {
        return this == INTERSTITIAL || this == REWARDED;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.stringValue;
    }

    public String value() {
        return this.stringValue;
    }

    UnitDisplayType(String str, boolean z) {
        this.stringValue = str;
        this.deprecated = z;
    }
}
