package com.inmobi.media;

import defpackage.du;
import defpackage.en1;
import defpackage.gg0;
import defpackage.hg0;
import defpackage.sr0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Mk extends C2 {
    public final Md b;
    public final sr0 c;
    public final AtomicBoolean d;

    public static final boolean a(Md md) {
        return Od.a(md.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mk(Md md, sr0 sr0Var) {
        super(new en1(md, 0));
        md.getClass();
        sr0Var.getClass();
        this.b = md;
        this.c = sr0Var;
        this.d = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.C2
    public final void b(Z2 z2) {
        Map map;
        Iterable iterable;
        z2.getClass();
        if (!this.d.getAndSet(true)) {
            boolean z = z2 instanceof Tq;
            if (z) {
                map = ((Tq) z2).a;
            } else {
                map = hg0.a;
            }
            if (z) {
                iterable = ((Tq) z2).b;
            } else {
                iterable = gg0.a;
            }
            ArrayList arrayListO0 = du.o0(iterable, (Collection) this.c.invoke());
            if (!arrayListO0.isEmpty()) {
                int size = arrayListO0.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListO0.get(i);
                    i++;
                    String strA = Od.a((String) obj, this.b, map);
                    X3 x3 = X3.a;
                    strA.getClass();
                    X3.a(strA, false, null);
                }
            }
        }
    }
}
