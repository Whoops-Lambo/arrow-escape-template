package io.p071bidmachine;

import defpackage.fh1;
import defpackage.fy;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class l extends fy {
    public m r;
    public Object s;
    public Map t;
    public fh1 u;
    public fh1 v;
    public /* synthetic */ Object w;
    public final /* synthetic */ m x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, fy fyVar) {
        super(fyVar);
        this.x = mVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.c(null, this);
    }
}
