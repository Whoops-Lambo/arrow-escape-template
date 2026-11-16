package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzedy {
    public static final zzedy a;
    public static final zzedy b;
    public static final zzedy c;
    public static final /* synthetic */ zzedy[] d;

    static {
        zzedy zzedyVar = new zzedy("NONE", 0);
        a = zzedyVar;
        zzedy zzedyVar2 = new zzedy("SHAKE", 1);
        b = zzedyVar2;
        zzedy zzedyVar3 = new zzedy("FLICK", 2);
        c = zzedyVar3;
        d = new zzedy[]{zzedyVar, zzedyVar2, zzedyVar3};
    }

    public static zzedy[] values() {
        return (zzedy[]) d.clone();
    }
}
