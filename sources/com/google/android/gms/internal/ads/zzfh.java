package com.google.android.gms.internal.ads;

import defpackage.bg4;
import defpackage.ch2;
import defpackage.dg4;
import defpackage.gg4;
import defpackage.mg4;
import defpackage.rg4;
import defpackage.z15;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfh {
    public final z15 a;
    public final bg4 b;
    public final zzfb c;
    public final zzbd d = new zzbd();
    public final zzea e;
    public final dg4 f;
    public final gg4 g;
    public final mg4 h;
    public final rg4 i;

    public zzfh(z15 z15Var, zzfb zzfbVar, zzdp zzdpVar, int i, int i2, int i3, int i4) {
        this.a = z15Var;
        this.c = zzfbVar;
        this.e = zzdpVar.a(z15Var.r, new ch2(this, 2));
        this.f = new dg4(this, i);
        this.g = new gg4(this, i2);
        this.h = new mg4(this, i3);
        this.i = new rg4(this, i4);
        bg4 bg4Var = new bg4(this);
        this.b = bg4Var;
        z15Var.m.a(bg4Var);
    }
}
