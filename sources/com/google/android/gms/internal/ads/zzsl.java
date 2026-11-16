package com.google.android.gms.internal.ads;

import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzsl extends Exception {
    public final int a;
    public final boolean b;
    public final zzv c;

    public zzsl(int i, zzv zzvVar, boolean z) {
        super(pv1.l(i, "AudioTrack write failed: ", new StringBuilder(String.valueOf(i).length() + 25)));
        this.b = z;
        this.a = i;
        this.c = zzvVar;
    }
}
