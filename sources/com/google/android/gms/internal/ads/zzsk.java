package com.google.android.gms.internal.ads;

import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzsk extends Exception {
    public zzsk(long j, long j2) {
        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 63 + String.valueOf(j).length());
        n30.x(sb, "Unexpected audio track timestamp discontinuity: expected ", j2, ", got ");
        sb.append(j);
        super(sb.toString());
    }
}
