package io.p071bidmachine.internal;

import io.p071bidmachine.core.a;
import io.p071bidmachine.core.j;
import io.p071bidmachine.iab.vast.h;
import io.p071bidmachine.iab.vast.processor.VastAd;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;
    public final /* synthetic */ n c;

    public /* synthetic */ l(n nVar, h hVar, int i) {
        this.a = i;
        this.c = nVar;
        this.b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        h hVar = this.b;
        n nVar = this.c;
        switch (i) {
            case 0:
                try {
                    nVar.getClass();
                    int i2 = 1;
                    j.l(new l(nVar, hVar, i2));
                    j.l(new m(nVar, nVar.h, i2));
                } catch (Throwable th) {
                    a.i(th);
                }
                break;
            default:
                try {
                    VastAd vastAd = hVar.d;
                    ArrayList arrayList = vastAd != null ? vastAd.k : null;
                    nVar.getClass();
                    if (arrayList != null) {
                        j.l(new m(nVar, arrayList, 0));
                    }
                    nVar.i = Float.valueOf(hVar.r);
                } catch (Throwable th2) {
                    a.i(th2);
                    return;
                }
                break;
        }
    }
}
