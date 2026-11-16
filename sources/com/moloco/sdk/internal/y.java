package com.moloco.sdk.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class y implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c {
    public static final y a;
    public static final y b;
    public static final y c;
    public static final y d;
    public static final y e;
    public static final y f;
    public static final /* synthetic */ y[] g;

    /* JADX INFO: Fake field, exist only in values array */
    y EF0;

    static {
        y yVar = new y("AD_LOAD_LIMIT_REACHED", 0);
        y yVar2 = new y("BID_LOAD_ERROR_CANNOT_PROCESS_BID_RESPONSE", 1);
        a = yVar2;
        y yVar3 = new y("BID_LOAD_ERROR_PARSE_INVALID_JSON", 2);
        b = yVar3;
        y yVar4 = new y("BID_LOAD_ERROR_PARSE_MISSING_REQUIRED_FIELD", 3);
        c = yVar4;
        y yVar5 = new y("BID_LOAD_ERROR_CANNOT_PARSE_BID_RESPONSE", 4);
        d = yVar5;
        y yVar6 = new y("AD_SHOW_ERROR_NOT_LOADED", 5);
        e = yVar6;
        y yVar7 = new y("AD_SHOW_ERROR_ALREADY_DISPLAYING", 6);
        f = yVar7;
        g = new y[]{yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) g.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public final String a() {
        return name();
    }
}
