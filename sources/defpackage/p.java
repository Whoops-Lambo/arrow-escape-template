package defpackage;

import com.ironsource.A;
import com.ironsource.C4766gg;
import com.ironsource.C5047wb;
import com.usercentrics.sdk.unity.UsercentricsUnityBanner;
import com.vungle.ads.internal.util.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sr0 b;

    public /* synthetic */ p(sr0 sr0Var, int i) {
        this.a = i;
        this.b = sr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        sr0 sr0Var = this.b;
        switch (i) {
            case 0:
                A.c(sr0Var);
                break;
            case 1:
                sr0Var.getClass();
                sr0Var.invoke();
                break;
            case 2:
                sr0Var.getClass();
                sr0Var.invoke();
                break;
            case 3:
                sr0Var.getClass();
                sr0Var.invoke();
                break;
            case 4:
                UsercentricsUnityBanner.runOnMainThread$lambda$0(sr0Var);
                break;
            case 5:
                C4766gg.b(sr0Var);
                break;
            case 6:
                C4766gg.a(sr0Var);
                break;
            case 7:
                C5047wb.a(sr0Var);
                break;
            default:
                y.b(sr0Var);
                break;
        }
    }
}
