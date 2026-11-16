package defpackage;

import com.inmobi.media.C4101ib;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wd3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4101ib b;

    public /* synthetic */ wd3(C4101ib c4101ib, int i) {
        this.a = i;
        this.b = c4101ib;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        C4101ib c4101ib = this.b;
        switch (i) {
            case 0:
                C4101ib.a(c4101ib);
                break;
            case 1:
                C4101ib.c(c4101ib);
                break;
            case 2:
                C4101ib.b(c4101ib);
                break;
            default:
                C4101ib.e(c4101ib);
                break;
        }
    }
}
