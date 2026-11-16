package defpackage;

import com.ironsource.C4699d3;
import com.ironsource.T0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class sc3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ T0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ sc3(T0 t0, long j, int i) {
        this.a = i;
        this.b = t0;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        T0 t0 = this.b;
        switch (i) {
            case 0:
                C4699d3.a.d(t0, j);
                break;
            case 1:
                C4699d3.a.a(t0, j);
                break;
            case 2:
                C4699d3.a.b(t0, j);
                break;
            default:
                C4699d3.a.c(t0, j);
                break;
        }
    }
}
