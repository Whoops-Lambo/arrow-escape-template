package com.inmobi.media;

import defpackage.fy;

/* JADX INFO: renamed from: com.inmobi.media.k9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4154k9 extends fy {
    public Vg a;
    public Object b;
    public InterfaceC4274oh c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C4238n9 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4154k9(C4238n9 c4238n9, fy fyVar) {
        super(fyVar);
        this.e = c4238n9;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, this);
    }
}
