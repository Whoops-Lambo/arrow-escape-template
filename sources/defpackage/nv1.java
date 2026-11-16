package defpackage;

import com.inmobi.media.Pm;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nv1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Pm b;

    public /* synthetic */ nv1(Pm pm, int i) {
        this.a = i;
        this.b = pm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Pm pm = this.b;
        switch (i) {
            case 0:
                Pm.a(pm);
                break;
            case 1:
                Pm.b(pm);
                break;
            default:
                Pm.c(pm);
                break;
        }
    }
}
