package com.inmobi.media;

import defpackage.fy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Mh extends fy {
    public /* synthetic */ Object a;
    public final /* synthetic */ Oh b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mh(Oh oh, fy fyVar) {
        super(fyVar);
        this.b = oh;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return Oh.a(this.b, this);
    }
}
