package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzedp {
    public static final zzedp a;
    public static final zzedp b;
    public static final zzedp c;
    public static final /* synthetic */ zzedp[] d;

    static {
        zzedp zzedpVar = new zzedp("AD_REQUESTED", 0);
        a = zzedpVar;
        zzedp zzedpVar2 = new zzedp("AD_LOADED", 1);
        b = zzedpVar2;
        zzedp zzedpVar3 = new zzedp("AD_LOAD_FAILED", 2);
        c = zzedpVar3;
        d = new zzedp[]{zzedpVar, zzedpVar2, zzedpVar3};
    }

    public static zzedp[] values() {
        return (zzedp[]) d.clone();
    }
}
