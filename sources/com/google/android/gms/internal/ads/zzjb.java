package com.google.android.gms.internal.ads;

import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzjb extends IllegalStateException {
    public zzjb(int i, int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21 + String.valueOf(i2).length() + 1);
        pv1.s(i, i2, "Buffer too small (", " < ", sb);
        sb.append(")");
        super(sb.toString());
    }
}
