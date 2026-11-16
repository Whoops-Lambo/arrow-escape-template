package com.inmobi.media;

import defpackage.fy;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: renamed from: com.inmobi.media.oc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4269oc extends fy {
    public String a;
    public Mutex b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C4297pc d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4269oc(C4297pc c4297pc, fy fyVar) {
        super(fyVar);
        this.d = c4297pc;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
