package defpackage;

import com.google.android.gms.internal.ads.zzgew;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class wk4 extends fy {
    public Mutex r;
    public /* synthetic */ Object s;
    public final /* synthetic */ zzgew t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk4(zzgew zzgewVar, fy fyVar) {
        super(fyVar);
        this.t = zzgewVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return zzgew.d(this.t, this);
    }
}
