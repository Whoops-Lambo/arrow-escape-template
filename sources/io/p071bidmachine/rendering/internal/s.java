package io.p071bidmachine.rendering.internal;

import android.view.View;
import defpackage.az2;
import defpackage.cz;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.wr0;
import io.p071bidmachine.rendering.model.animation.effect.c;
import io.p071bidmachine.util.n;
import io.p071bidmachine.util.t;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class s extends rc1 implements wr0 {
    public final /* synthetic */ cz i;
    public final /* synthetic */ ArrayList j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ sr0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(cz czVar, ArrayList arrayList, boolean z, sr0 sr0Var) {
        super(1);
        this.i = czVar;
        this.j = arrayList;
        this.k = z;
        this.l = sr0Var;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        View view = (View) obj;
        if (view != null) {
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                ((c) obj2).d(view);
            }
            if (!this.k) {
                n.a(new t(view, 1));
            }
        }
        sr0 sr0Var = this.l;
        if (sr0Var != null) {
            try {
                sr0Var.invoke();
            } catch (Throwable unused) {
            }
        }
        return az2.a;
    }
}
