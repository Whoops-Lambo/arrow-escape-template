package com.google.android.gms.internal.ads;

import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzrc extends Exception {
    public final int a;
    public final boolean b;

    public zzrc(int i, boolean z) {
        super(pv1.l(i, "AudioOutput write failed: ", new StringBuilder(String.valueOf(i).length() + 26)));
        this.b = z;
        this.a = i;
    }
}
