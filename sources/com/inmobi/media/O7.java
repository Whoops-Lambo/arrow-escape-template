package com.inmobi.media;

import defpackage.fy;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class O7 extends fy {
    public Mutex a;
    public /* synthetic */ Object b;
    public final /* synthetic */ P7 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O7(P7 p7, fy fyVar) {
        super(fyVar);
        this.c = p7;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.i(this);
    }
}
