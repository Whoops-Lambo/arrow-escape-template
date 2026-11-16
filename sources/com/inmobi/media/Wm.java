package com.inmobi.media;

import defpackage.fy;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Wm extends fy {
    public int a;
    public String b;
    public Mutex c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Ym e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wm(Ym ym, fy fyVar) {
        super(fyVar);
        this.e = ym;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(0, null, this);
    }
}
