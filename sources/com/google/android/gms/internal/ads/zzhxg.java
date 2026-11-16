package com.google.android.gms.internal.ads;

import java.security.spec.ECParameterSpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhxg {
    public static final zzhxg c = new zzhxg("NIST_P256", zzhoc.a);
    public static final zzhxg d = new zzhxg("NIST_P384", zzhoc.b);
    public static final zzhxg e = new zzhxg("NIST_P521", zzhoc.c);
    public final String a;
    public final ECParameterSpec b;

    public final String toString() {
        return this.a;
    }

    public zzhxg(String str, ECParameterSpec eCParameterSpec) {
        this.a = str;
        this.b = eCParameterSpec;
    }
}
