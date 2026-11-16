package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public enum zzji {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");

    public final String a;

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    zzji(String str) {
        this.a = str;
    }
}
