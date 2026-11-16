package com.google.android.gms.internal.ads;

import defpackage.zu4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzhgl {
    public final zzhgc a;
    public final zzhge b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final zu4 f;
    public final int g;

    public final zzhgc a() {
        this.f.mo1052zza();
        return this.a;
    }

    public /* synthetic */ zzhgl(zzhgc zzhgcVar, int i, int i2, boolean z, boolean z2, zu4 zu4Var) {
        zzhge zzhgeVar;
        this.a = zzhgcVar;
        this.g = i;
        int i3 = i - 2;
        if (i3 != 1) {
            if (i3 != 3) {
                zzhgeVar = zzhge.c;
            } else {
                zzhgeVar = zzhge.d;
            }
        } else {
            zzhgeVar = zzhge.b;
        }
        this.b = zzhgeVar;
        this.c = i2;
        this.d = z;
        this.e = z2;
        this.f = zu4Var;
    }
}
