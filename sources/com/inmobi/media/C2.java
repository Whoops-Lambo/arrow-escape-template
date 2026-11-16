package com.inmobi.media;

import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C2 implements Y2 {
    public final sr0 a;

    public abstract void b(Z2 z2);

    public C2(sr0 sr0Var) {
        sr0Var.getClass();
        this.a = sr0Var;
    }

    public final void a(Z2 z2) {
        z2.getClass();
        if (!((Boolean) this.a.invoke()).booleanValue()) {
            return;
        }
        z2.toString();
        b(z2);
    }
}
