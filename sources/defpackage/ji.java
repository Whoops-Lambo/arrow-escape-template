package defpackage;

import com.inmobi.media.Bi;
import com.inmobi.media.Fi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ji implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wr0 b;
    public final /* synthetic */ Fi c;

    public /* synthetic */ ji(int i, wr0 wr0Var, Fi fi) {
        this.a = i;
        this.b = wr0Var;
        this.c = fi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Fi fi = this.c;
        wr0 wr0Var = this.b;
        switch (i) {
            case 0:
                Bi.a(wr0Var, fi);
                break;
            case 1:
                Fi.b(wr0Var, fi);
                break;
            default:
                Fi.a(wr0Var, fi);
                break;
        }
    }
}
