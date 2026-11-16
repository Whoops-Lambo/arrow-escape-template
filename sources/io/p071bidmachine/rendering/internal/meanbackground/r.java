package io.p071bidmachine.rendering.internal.meanbackground;

import android.graphics.Bitmap;
import defpackage.fy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class r extends fy {
    public Object r;
    public Bitmap s;
    public /* synthetic */ Object t;
    public final /* synthetic */ t u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, fy fyVar) {
        super(fyVar);
        this.u = tVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(null, null, this);
    }
}
