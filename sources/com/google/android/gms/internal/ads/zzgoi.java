package com.google.android.gms.internal.ads;

import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgoi extends RuntimeException {
    public zzgoi(int i) {
        super(pv1.l(i, "r: ", new StringBuilder(String.valueOf(i).length() + 3)));
    }

    public zzgoi() {
        this(0);
    }

    public zzgoi(int i, Throwable th) {
        super("r: 2", th);
    }
}
