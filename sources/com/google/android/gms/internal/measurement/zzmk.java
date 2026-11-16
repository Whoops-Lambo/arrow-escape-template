package com.google.android.gms.internal.measurement;

import defpackage.rl3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzmk extends RuntimeException {
    private final int a;

    public zzmk(int i, String str, Throwable th) {
        String strValueOf;
        if (str != null) {
            StringBuilder sb = new StringBuilder(rl3.c(i, 2) + str.length());
            sb.append(i);
            sb.append(": ");
            sb.append(str);
            strValueOf = sb.toString();
        } else {
            strValueOf = String.valueOf(i);
        }
        super(strValueOf, th);
        this.a = i;
    }

    public final int d() {
        return this.a;
    }
}
