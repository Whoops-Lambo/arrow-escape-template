package com.inmobi.media;

import defpackage.fy;

/* JADX INFO: renamed from: com.inmobi.media.qh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4330qh extends fy {
    public C3940ch a;
    public InterfaceC4274oh b;
    public Vg c;
    public /* synthetic */ Object d;
    public final /* synthetic */ AbstractC4385sh e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4330qh(AbstractC4385sh abstractC4385sh, fy fyVar) {
        super(fyVar);
        this.e = abstractC4385sh;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
