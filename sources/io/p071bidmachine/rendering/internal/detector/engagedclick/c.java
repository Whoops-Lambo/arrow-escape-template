package io.p071bidmachine.rendering.internal.detector.engagedclick;

import android.graphics.Bitmap;
import defpackage.fy;
import defpackage.m32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class c extends fy {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ f D;
    public int E;
    public f r;
    public Object s;
    public Object t;
    public Object u;
    public m32 v;
    public Bitmap w;
    public long x;
    public double y;
    public double z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, fy fyVar) {
        super(fyVar);
        this.D = fVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return f.a(this.D, null, null, 0L, this);
    }
}
