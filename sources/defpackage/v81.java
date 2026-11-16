package defpackage;

import com.ironsource.Ja;
import com.ironsource.S2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class v81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ja b;
    public final /* synthetic */ S2 c;
    public final /* synthetic */ Long d;

    public /* synthetic */ v81(Ja ja, S2 s2, Long l, int i) {
        this.a = i;
        this.b = ja;
        this.c = s2;
        this.d = l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Long l = this.d;
        S2 s2 = this.c;
        Ja ja = this.b;
        switch (i) {
            case 0:
                Ja.a(ja, s2, l);
                break;
            default:
                Ja.d.a(ja, s2, l);
                break;
        }
    }
}
