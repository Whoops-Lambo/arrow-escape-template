package androidx.datastore.core;

import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@t50(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", l = {544, 497}, m = "runIfNeeded")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class RunOnce$runIfNeeded$1 extends fy {
    public RunOnce r;
    public Mutex s;
    public /* synthetic */ Object t;
    public final /* synthetic */ RunOnce u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunOnce$runIfNeeded$1(RunOnce runOnce, fy fyVar) {
        super(fyVar);
        this.u = runOnce;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.b(this);
    }
}
