package defpackage;

import com.ironsource.C4970s6;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class dh3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4970s6 b;

    public /* synthetic */ dh3(C4970s6 c4970s6, int i) {
        this.a = i;
        this.b = c4970s6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        C4970s6 c4970s6 = this.b;
        switch (i) {
            case 0:
                C4970s6.b(c4970s6);
                break;
            default:
                C4970s6.a(c4970s6);
                break;
        }
    }
}
