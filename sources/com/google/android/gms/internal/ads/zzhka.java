package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhka {
    public static final zzhka b = new zzhka("ASSUME_AES_GCM");
    public static final zzhka c = new zzhka("ASSUME_XCHACHA20POLY1305");
    public static final zzhka d = new zzhka("ASSUME_CHACHA20POLY1305");
    public static final zzhka e = new zzhka("ASSUME_AES_CTR_HMAC");
    public static final zzhka f = new zzhka("ASSUME_AES_EAX");
    public static final zzhka g = new zzhka("ASSUME_AES_GCM_SIV");
    public final String a;

    public final String toString() {
        return this.a;
    }

    public zzhka(String str) {
        this.a = str;
    }
}
