package defpackage;

import com.inmobi.media.C4435ub;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nh3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4435ub b;

    public /* synthetic */ nh3(C4435ub c4435ub, int i) {
        this.a = i;
        this.b = c4435ub;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        C4435ub c4435ub = this.b;
        switch (i) {
            case 0:
                C4435ub.c(c4435ub);
                break;
            case 1:
                C4435ub.b(c4435ub);
                break;
            default:
                C4435ub.a(c4435ub);
                break;
        }
    }
}
