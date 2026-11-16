package com.inmobi.media;

import defpackage.fy;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: renamed from: com.inmobi.media.dg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C3967dg extends fy {
    public Mutex a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3994eg c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3967dg(C3994eg c3994eg, fy fyVar) {
        super(fyVar);
        this.c = c3994eg;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.h(this);
    }
}
