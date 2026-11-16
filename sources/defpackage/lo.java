package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class lo implements mo {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ lo(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.mo
    public final void a(Throwable th) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ScheduledFuture) obj).cancel(false);
                break;
            case 1:
                ((wr0) obj).invoke(th);
                break;
            default:
                ((ad0) obj).dispose();
                break;
        }
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((wr0) obj).getClass().getSimpleName() + '@' + qb5.i(this) + ']';
            default:
                return "DisposeOnCancel[" + ((ad0) obj) + ']';
        }
    }
}
