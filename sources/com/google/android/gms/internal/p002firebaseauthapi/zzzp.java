package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzzp {
    public static final zzzp a;
    public static final zzzp b;
    public static final zzzp c;
    public static final /* synthetic */ zzzp[] d;

    static {
        zzzp zzzpVar = new zzzp("UNCOMPRESSED", 0);
        a = zzzpVar;
        zzzp zzzpVar2 = new zzzp("COMPRESSED", 1);
        b = zzzpVar2;
        zzzp zzzpVar3 = new zzzp("DO_NOT_USE_CRUNCHY_UNCOMPRESSED", 2);
        c = zzzpVar3;
        d = new zzzp[]{zzzpVar, zzzpVar2, zzzpVar3};
    }

    public static zzzp[] values() {
        return (zzzp[]) d.clone();
    }
}
