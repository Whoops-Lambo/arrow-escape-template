package com.inmobi.media;

import defpackage.fy;

/* JADX INFO: renamed from: com.inmobi.media.dh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C3968dh extends fy {
    public Vg a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AbstractC4106ih c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3968dh(AbstractC4106ih abstractC4106ih, fy fyVar) {
        super(fyVar);
        this.c = abstractC4106ih;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((Vg) null, this);
    }
}
