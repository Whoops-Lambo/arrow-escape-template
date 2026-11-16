package com.moloco.sdk.internal.utils;

import defpackage.qb5;
import defpackage.qy;
import defpackage.ry;
import defpackage.sy;
import defpackage.zr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class a implements qy {
    public final b a;

    @Override // defpackage.qy
    public final ry getKey() {
        return this.a;
    }

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.sy
    public final Object fold(Object obj, zr0 zr0Var) {
        return zr0Var.invoke(obj, this);
    }

    @Override // defpackage.sy
    public final qy get(ry ryVar) {
        return qb5.h(this, ryVar);
    }

    @Override // defpackage.sy
    public final sy minusKey(ry ryVar) {
        return qb5.k(this, ryVar);
    }

    @Override // defpackage.sy
    public final sy plus(sy syVar) {
        return qb5.l(this, syVar);
    }
}
