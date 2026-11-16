package io.p071bidmachine.nativead.view;

import io.p071bidmachine.iab.vast.h;
import io.p071bidmachine.iab.vast.j;
import io.p071bidmachine.nativead.f;
import io.p071bidmachine.nativead.k;
import java.util.Timer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ a(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar;
        int i = this.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                try {
                    dVar.r = false;
                    dVar.a();
                    dVar.l(1);
                    Timer timer = dVar.k;
                    if (timer != null) {
                        timer.cancel();
                    }
                    dVar.k = null;
                    dVar.t = true;
                    dVar.s = false;
                    k kVar = dVar.b;
                    if (kVar != null && (hVar = ((f) kVar).o) != null) {
                        hVar.j(j.i);
                        break;
                    }
                } catch (Exception e) {
                    io.p071bidmachine.core.a.i(e);
                    return;
                }
                break;
            case 1:
                dVar.getClass();
                dVar.a();
                break;
            case 2:
                dVar.f();
                if (dVar.u) {
                    Timer timer2 = dVar.k;
                    if (timer2 != null) {
                        timer2.cancel();
                    }
                    dVar.k = null;
                }
                break;
            default:
                dVar.i();
                break;
        }
    }
}
