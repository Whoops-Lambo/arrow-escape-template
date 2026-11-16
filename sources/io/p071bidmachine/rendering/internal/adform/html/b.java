package io.p071bidmachine.rendering.internal.adform.html;

import io.p071bidmachine.iab.mraid.MraidAdView;
import io.p071bidmachine.rendering.internal.controller.k;
import io.p071bidmachine.rendering.utils.d;
import io.p071bidmachine.t1;
import io.p071bidmachine.util.e;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ String c;

    public /* synthetic */ b(d dVar, String str, int i) {
        this.a = i;
        this.b = dVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        d dVar = this.b;
        switch (i) {
            case 0:
                k kVar = dVar.g;
                str.getClass();
                try {
                    MraidAdView mraidAdView = dVar.z;
                    if (mraidAdView == null) {
                        kVar.b(dVar, new e("MraidAdView is null"));
                    } else {
                        mraidAdView.h(str);
                    }
                } catch (Throwable th) {
                    t1.r(th);
                    kVar.b(dVar, new e(th));
                    return;
                }
                break;
            default:
                k kVar2 = dVar.g;
                try {
                    dVar.F();
                    if (dVar.f.l) {
                        d.a(new b(dVar, str, 0));
                    } else {
                        dVar.A = str;
                        kVar2.c(dVar);
                    }
                } catch (Throwable th2) {
                    t1.r(th2);
                    kVar2.b(dVar, new e(th2));
                    return;
                }
                break;
        }
    }
}
