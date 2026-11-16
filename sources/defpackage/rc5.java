package defpackage;

import com.google.android.gms.internal.ads.zzxq;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rc5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yc5 b;

    public /* synthetic */ rc5(yc5 yc5Var, int i) {
        this.a = i;
        this.b = yc5Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        yc5 yc5Var = this.b;
        switch (i) {
            case 0:
                if (!yc5Var.H) {
                    zzxq zzxqVar = yc5Var.r;
                    zzxqVar.getClass();
                    zzxqVar.j(yc5Var);
                }
                break;
            case 1:
                yc5Var.G = true;
                break;
            default:
                yc5Var.o();
                break;
        }
    }
}
