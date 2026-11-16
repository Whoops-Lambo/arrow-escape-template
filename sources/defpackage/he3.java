package defpackage;

import com.inmobi.media.C4156kb;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class he3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4156kb b;

    public /* synthetic */ he3(C4156kb c4156kb, int i) {
        this.a = i;
        this.b = c4156kb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        C4156kb c4156kb = this.b;
        switch (i) {
            case 0:
                C4156kb.c(c4156kb);
                break;
            case 1:
                C4156kb.a(c4156kb);
                break;
            default:
                C4156kb.b(c4156kb);
                break;
        }
    }
}
