package io.p071bidmachine.rendering.internal;

import android.view.View;
import defpackage.az2;
import defpackage.cz;
import defpackage.ih;
import defpackage.rc1;
import defpackage.wr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class u extends rc1 implements wr0 {
    public final /* synthetic */ cz i;
    public final /* synthetic */ float j;
    public final /* synthetic */ float k;
    public final /* synthetic */ ih l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(cz czVar, float f, float f2, ih ihVar) {
        super(1);
        this.i = czVar;
        this.j = f;
        this.k = f2;
        this.l = ihVar;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        View view = (View) obj;
        if (view != null) {
            view.setTranslationX(this.j);
            view.setTranslationY(this.k);
        }
        try {
            this.l.invoke();
        } catch (Throwable unused) {
        }
        return az2.a;
    }
}
