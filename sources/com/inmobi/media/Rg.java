package com.inmobi.media;

import android.app.Activity;
import defpackage.fy;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Rg extends fy {
    public Activity a;
    public Mutex b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Tg d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rg(Tg tg, fy fyVar) {
        super(fyVar);
        this.d = tg;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
