package androidx.compose.runtime;

import defpackage.az2;
import defpackage.qo;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Laz2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class Latch$await$2$2 extends rc1 implements wr0 {
    public final /* synthetic */ Latch i;
    public final /* synthetic */ qo j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Latch$await$2$2(Latch latch, qo qoVar) {
        super(1);
        this.i = latch;
        this.j = qoVar;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        Latch latch = this.i;
        Object obj2 = latch.a;
        qo qoVar = this.j;
        synchronized (obj2) {
            latch.b.remove(qoVar);
        }
        return az2.a;
    }
}
