package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import defpackage.jc1;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzsi extends Exception {
    public final boolean a;

    public zzsi(int i, int i2, int i3, int i4, int i5, zzv zzvVar, boolean z, @Nullable Exception exc) {
        String strValueOf = String.valueOf(zzvVar);
        int length = String.valueOf(i2).length();
        int length2 = String.valueOf(i3).length();
        int length3 = String.valueOf(i4).length();
        StringBuilder sb = new StringBuilder(length + 34 + length2 + 2 + length3 + 2 + String.valueOf(i5).length() + 2 + strValueOf.length());
        pv1.s(i2, i3, "AudioTrack init failed 0 Config(", ", ", sb);
        pv1.s(i4, i5, ", ", ", ", sb);
        super(jc1.o(") ", strValueOf, sb, ""), exc);
        this.a = false;
    }
}
