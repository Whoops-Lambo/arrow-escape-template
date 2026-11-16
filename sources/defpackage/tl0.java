package defpackage;

import com.inmobi.media.Ai;
import com.inmobi.media.C4331qi;
import com.inmobi.media.Fi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class tl0 implements wr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fi b;

    public /* synthetic */ tl0(Fi fi, int i) {
        this.a = i;
        this.b = fi;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i = this.a;
        Fi fi = this.b;
        switch (i) {
            case 0:
                return Fi.a(fi, (C4331qi) obj);
            default:
                return Fi.a(fi, (Ai) obj);
        }
    }
}
