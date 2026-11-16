package com.inmobi.media;

import defpackage.dy;
import defpackage.fy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Y7 extends fy {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ Z7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y7(Z7 z7, dy dyVar) {
        super(dyVar);
        this.c = z7;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
