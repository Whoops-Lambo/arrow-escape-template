package com.google.android.gms.internal.consent_sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzcg {
    public static final zzcg a;
    public static final zzcg b;
    public static final zzcg c;
    public static final zzcg d;
    public static final zzcg e;
    public static final /* synthetic */ zzcg[] f;

    /* JADX INFO: Fake field, exist only in values array */
    zzcg EF0;

    static {
        zzcg zzcgVar = new zzcg("DEBUG_PARAM_UNKNOWN", 0);
        zzcg zzcgVar2 = new zzcg("ALWAYS_SHOW", 1);
        zzcg zzcgVar3 = new zzcg("GEO_OVERRIDE_EEA", 2);
        a = zzcgVar3;
        zzcg zzcgVar4 = new zzcg("GEO_OVERRIDE_REGULATED_US_STATE", 3);
        b = zzcgVar4;
        zzcg zzcgVar5 = new zzcg("GEO_OVERRIDE_OTHER", 4);
        c = zzcgVar5;
        zzcg zzcgVar6 = new zzcg("GEO_OVERRIDE_NON_EEA", 5);
        d = zzcgVar6;
        zzcg zzcgVar7 = new zzcg("PREVIEWING_DEBUG_MESSAGES", 6);
        e = zzcgVar7;
        f = new zzcg[]{zzcgVar, zzcgVar2, zzcgVar3, zzcgVar4, zzcgVar5, zzcgVar6, zzcgVar7, new zzcg("GEO_OVERRIDE_USFL", 7)};
    }

    public static zzcg[] values() {
        return (zzcg[]) f.clone();
    }
}
