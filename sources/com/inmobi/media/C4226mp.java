package com.inmobi.media;

import android.widget.ProgressBar;
import defpackage.az2;
import defpackage.cp0;
import defpackage.cz;
import defpackage.dy;

/* JADX INFO: renamed from: com.inmobi.media.mp, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4226mp implements cp0 {
    public final /* synthetic */ C4310pp a;

    public C4226mp(cz czVar, C4310pp c4310pp) {
        this.a = c4310pp;
    }

    @Override // defpackage.cp0
    public final Object emit(Object obj, dy dyVar) {
        ProgressBar progressBar;
        AbstractC4002eo abstractC4002eo = (AbstractC4002eo) obj;
        C4310pp c4310pp = this.a;
        c4310pp.getClass();
        if (abstractC4002eo instanceof C4557yp) {
            ProgressBar progressBar2 = c4310pp.e;
            if (progressBar2 != null) {
                progressBar2.setVisibility(0);
            }
        } else if (abstractC4002eo instanceof C4198lp) {
            int i = ((C4198lp) abstractC4002eo).b;
            ProgressBar progressBar3 = c4310pp.e;
            if (progressBar3 != null) {
                AbstractC4097i7.a(c4310pp.f);
                c4310pp.f = AbstractC4318q5.a(c4310pp.a, new C4282op(progressBar3, c4310pp, i, null));
            }
        } else if ((abstractC4002eo instanceof C3919bo) && c4310pp.c.b && (progressBar = c4310pp.e) != null) {
            progressBar.setVisibility(8);
        }
        return az2.a;
    }
}
