package androidx.room;

import android.os.CancellationSignal;
import defpackage.az2;
import defpackage.li2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Laz2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
final class CoroutinesRoom$Companion$execute$4$1 extends rc1 implements wr0 {
    public final /* synthetic */ CancellationSignal i;
    public final /* synthetic */ li2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$4$1(CancellationSignal cancellationSignal, li2 li2Var) {
        super(1);
        this.i = cancellationSignal;
        this.j = li2Var;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        this.i.cancel();
        this.j.cancel(null);
        return az2.a;
    }
}
