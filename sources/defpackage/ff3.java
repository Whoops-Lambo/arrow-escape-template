package defpackage;

import com.ironsource.C4868mb;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ff3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4868mb b;

    public /* synthetic */ ff3(C4868mb c4868mb, int i) {
        this.a = i;
        this.b = c4868mb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        C4868mb c4868mb = this.b;
        switch (i) {
            case 0:
                C4868mb.b(c4868mb);
                break;
            case 1:
                C4868mb.c(c4868mb);
                break;
            default:
                C4868mb.a(c4868mb);
                break;
        }
    }
}
