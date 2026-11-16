package defpackage;

import com.google.android.gms.internal.ads.zzgew;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xk4 extends fy {
    public Object r;
    public long s;
    public /* synthetic */ Object t;
    public final /* synthetic */ zzgew u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk4(zzgew zzgewVar, fy fyVar) {
        super(fyVar);
        this.u = zzgewVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return zzgew.i(this.u, this);
    }
}
