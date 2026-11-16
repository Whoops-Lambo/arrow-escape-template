package defpackage;

import com.google.android.gms.internal.ads.o;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class i44 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ i44(o oVar, int i) {
        this.a = i;
        this.b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        o oVar = this.b;
        switch (i) {
            case 0:
                super/*android.webkit.WebView*/.destroy();
                break;
            default:
                oVar.t0();
                break;
        }
    }
}
