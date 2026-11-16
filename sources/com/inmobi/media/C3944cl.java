package com.inmobi.media;

import defpackage.fy;

/* JADX INFO: renamed from: com.inmobi.media.cl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C3944cl extends fy {
    public /* synthetic */ Object a;
    public final /* synthetic */ C4083hl b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3944cl(C4083hl c4083hl, fy fyVar) {
        super(fyVar);
        this.b = c4083hl;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
