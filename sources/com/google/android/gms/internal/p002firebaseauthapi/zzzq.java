package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzzq {
    public static final zzzq a;
    public static final zzzq b;
    public static final zzzq c;
    public static final /* synthetic */ zzzq[] d;

    static {
        zzzq zzzqVar = new zzzq("NIST_P256", 0);
        a = zzzqVar;
        zzzq zzzqVar2 = new zzzq("NIST_P384", 1);
        b = zzzqVar2;
        zzzq zzzqVar3 = new zzzq("NIST_P521", 2);
        c = zzzqVar3;
        d = new zzzq[]{zzzqVar, zzzqVar2, zzzqVar3};
    }

    public static zzzq[] values() {
        return (zzzq[]) d.clone();
    }
}
