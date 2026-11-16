package com.inmobi.media;

import defpackage.fy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Vk extends fy {
    public String a;
    public C4250nl b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Yk d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vk(Yk yk, fy fyVar) {
        super(fyVar);
        this.d = yk;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return Yk.a(this.d, null, null, this);
    }
}
