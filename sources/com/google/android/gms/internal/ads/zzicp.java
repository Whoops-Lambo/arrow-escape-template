package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzicp {
    public static final zzicp a;
    public static final zzicp b;
    public static final zzicp c;
    public static final /* synthetic */ zzicp[] d;

    static {
        zzicp zzicpVar = new zzicp("NIST_P256", 0);
        a = zzicpVar;
        zzicp zzicpVar2 = new zzicp("NIST_P384", 1);
        b = zzicpVar2;
        zzicp zzicpVar3 = new zzicp("NIST_P521", 2);
        c = zzicpVar3;
        d = new zzicp[]{zzicpVar, zzicpVar2, zzicpVar3};
    }

    public static zzicp[] values() {
        return (zzicp[]) d.clone();
    }
}
