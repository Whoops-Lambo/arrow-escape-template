package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zziej {
    public static final zziej a;
    public static final zziej b;
    public static final /* synthetic */ zziej[] c;

    static {
        zziej zziejVar = new zziej("LENIENT", 0);
        a = zziejVar;
        zziej zziejVar2 = new zziej("LEGACY_STRICT", 1);
        b = zziejVar2;
        c = new zziej[]{zziejVar, zziejVar2, new zziej("STRICT", 2)};
    }

    public static zziej[] values() {
        return (zziej[]) c.clone();
    }
}
