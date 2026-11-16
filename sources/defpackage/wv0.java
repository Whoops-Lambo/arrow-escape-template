package defpackage;

import com.ironsource.Ea;
import com.ironsource.Ha;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ha b;
    public final /* synthetic */ Ea c;

    public /* synthetic */ wv0(Ha ha, Ea ea, int i) {
        this.a = i;
        this.b = ha;
        this.c = ea;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Ea ea = this.c;
        Ha ha = this.b;
        switch (i) {
            case 0:
                Ha.a(ha, ea);
                break;
            default:
                Ha.b(ha, ea);
                break;
        }
    }
}
