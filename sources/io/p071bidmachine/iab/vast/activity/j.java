package io.p071bidmachine.iab.vast.activity;

import android.view.View;
import io.p071bidmachine.iab.vast.h;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class j implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ j(p pVar, int i) {
        this.a = i;
        this.b = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        p pVar = this.b;
        switch (i) {
            case 0:
                if (pVar.C() || pVar.u.j) {
                    pVar.K();
                }
                break;
            case 1:
                h hVar = pVar.t;
                if (hVar == null || !hVar.o || pVar.u.l || !pVar.z()) {
                    if (!pVar.I) {
                        pVar.x();
                    } else {
                        pVar.u();
                    }
                }
                break;
            case 2:
                if (pVar.B()) {
                    VastView$C vastView$C = pVar.u;
                    vastView$C.j = false;
                    vastView$C.d = 0;
                    pVar.F();
                    pVar.y(pVar.t.d.j);
                    pVar.I("restartPlayback");
                    break;
                }
                break;
            case 3:
                pVar.z();
                break;
            case 4:
                p.a(pVar);
                break;
            default:
                pVar.z();
                break;
        }
    }
}
