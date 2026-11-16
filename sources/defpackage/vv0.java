package defpackage;

import com.ironsource.Ha;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ha b;

    public /* synthetic */ vv0(Ha ha, int i) {
        this.a = i;
        this.b = ha;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Ha ha = this.b;
        switch (i) {
            case 0:
                Ha.d(ha);
                break;
            case 1:
                Ha.a(ha);
                break;
            case 2:
                Ha.b(ha);
                break;
            default:
                Ha.c(ha);
                break;
        }
    }
}
