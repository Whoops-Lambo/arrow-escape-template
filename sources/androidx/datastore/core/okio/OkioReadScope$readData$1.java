package androidx.datastore.core.okio;

import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@t50(c = "androidx.datastore.core.okio.OkioReadScope", f = "OkioStorage.kt", l = {180, 187}, m = "readData$suspendImpl")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class OkioReadScope$readData$1<T> extends fy {
    public /* synthetic */ Object r;
    public final /* synthetic */ OkioReadScope s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioReadScope$readData$1(OkioReadScope okioReadScope, fy fyVar) {
        super(fyVar);
        this.s = okioReadScope;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return OkioReadScope.f(this.s, this);
    }
}
